package com.bawei.zkDome.apater;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.zkDome.R;
import com.bawei.zkDome.entity.ShopEntity;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.VH> {


    private Context context;
    private List<ShopEntity.ResultBean> list;

    public ShopAdapter(Context context, List<ShopEntity.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View inflate = View.inflate(context, R.layout.rev_shop, null);

        final VH vh = new VH(inflate);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
