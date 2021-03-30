package com.ujiantengahsemester.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class listHewanAdapter extends RecyclerView.Adapter<listHewanAdapter.ListViewHolder> {
    private ArrayList listHewan;

    public listHewanAdapter(ArrayList<hewan> list){
        this.listHewan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        hewan Hewan;
        Hewan = (hewan) listHewan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Hewan.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.fotoHewan);

        holder.tvNama.setText(Hewan.getNama());
        holder.tvDetail.setText(Hewan.getDetail());
    }


    @Override
    public int getItemCount() {
        return listHewan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHewan;
        TextView tvNama, tvDetail;
        public ListViewHolder(View itemview) {
            super(itemview);
            fotoHewan = itemview.findViewById(R.id.img_item_hewan);
            tvNama = itemview.findViewById(R.id.tv_namaHewan);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}
