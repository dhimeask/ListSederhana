package com.example.listsederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DetailAlbum extends RecyclerView.Adapter<DetailAlbum.detailAlbumViewHolder>{
    private ArrayList<Album> listAlbum;

    public DetailAlbum(ArrayList<Album> list) {
        this.listAlbum=list;
    }

    @NonNull
    @Override
    public detailAlbumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_album, viewGroup, false);
        return new detailAlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final detailAlbumViewHolder holder, int position) {
        Glide.with( holder.itemView.getContext() )
                .load( listAlbum.get(position).getPhoto() )
                .apply( new RequestOptions().override( 350,550 ) )
                .into( holder.imgPhoto );

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListAlbumAdapter.OnItemClickCallBack onItemClickCallback = null;
                onItemClickCallback.onItemClicked(listAlbum.get( holder.getAdapterPosition() ));
            }
        } );
    }

    @Override
    public int getItemCount() {return listAlbum.size();
    }

    public class detailAlbumViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public detailAlbumViewHolder(@NonNull View itemView) {
            super( itemView );
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
