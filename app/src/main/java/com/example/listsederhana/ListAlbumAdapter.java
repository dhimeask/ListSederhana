package com.example.listsederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAlbumAdapter extends RecyclerView.Adapter<ListAlbumAdapter.ListViewHolder> {
    private ArrayList<Album> listAlbum;

    public ListAlbumAdapter(ArrayList<Album> list) {
        this.listAlbum=list;
    }

    private OnItemClickCallBack onItemClickCallBack;
    public void setOnItemClickBack (OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack=onItemClickCallBack;
    }


    @NonNull
    @Override
    public ListAlbumAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_album, viewGroup, false);
        return new ListViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Album album = listAlbum.get(position);
        Glide.with(holder.itemView.getContext())
                .load(album.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(album.getName());
        holder.tvDetail.setText(album.getDetail());

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked( listAlbum.get( holder.getAdapterPosition() ) );
            }
        } );

    }

    @Override
    public int getItemCount() {
        return listAlbum.size();
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Album album);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super( itemView );
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
