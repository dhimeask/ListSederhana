package com.example.listsederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridAlbumClass extends RecyclerView.Adapter<GridAlbumClass.GridViewHolder> {
    private ArrayList<Album> listAlbum;

    public GridAlbumClass(ArrayList<Album> list) {
        this.listAlbum = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.item_grid_album,viewGroup,  false );
        return new GridViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with( holder.itemView.getContext() )
                .load( listAlbum.get(position).getPhoto() )
                .apply( new RequestOptions().override( 350,550 ) )
                .into( holder.imgPhoto );

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listAlbum.get( holder.getAdapterPosition() ));
            }
        } );

    }

    @Override
    public int getItemCount() {
        return listAlbum.size();
    }

    public interface OnItemClickCallback{
        void onItemClicked(Album album);
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }



    public class GridViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super( itemView );
            imgPhoto=itemView.findViewById(R.id.img_item_photo );
        }
    }
}
