package com.mbobiosio.android_sqlite_crud.ui.adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mbobiosio.android_sqlite_crud.R;
import com.mbobiosio.android_sqlite_crud.model.Energy;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Mbuodile Obiosio on Sep 30,2019
 * https://twitter.com/cazewonder
 * Nigeria.
 */

/**
 * Created by Mbuodile Obiosio on Sep 30,2019
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class DevicesAdapter extends RecyclerView.Adapter<DevicesAdapter.DevicesViewHolder> {
    private final Context context;
    private List<Energy> items;

    public DevicesAdapter(List<Energy> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public DevicesViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_devices, parent, false);
        return new DevicesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DevicesViewHolder holder, int position) {
        Energy item = items.get(position);
        holder.set(item);
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    public class DevicesViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.appliance_name)
        TextView mDeviceName;
        @BindView(R.id.count)
        TextView mDevicesCount;
        @BindView(R.id.watt)
        TextView mDevicesWatt;

        public DevicesViewHolder(View itemView) {
            super(itemView);
        }

        public void set(Energy item) {
            //UI setting code
            mDeviceName.setText(item.getDeviceName());
            mDevicesCount.setText(item.getDeviceCount());
            mDevicesWatt.setText(item.getDeviceWatt());
        }
    }
}