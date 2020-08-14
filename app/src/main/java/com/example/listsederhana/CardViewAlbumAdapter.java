package com.example.listsederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewAlbumAdapter extends RecyclerView.Adapter<CardViewAlbumAdapter.CardViewHolder> {
    private ArrayList<Album> listAlbum;

    public CardViewAlbumAdapter(ArrayList<Album>list){
        this.listAlbum=list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.item_cardview_album,viewGroup,false );
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        Album album=listAlbum.get( position );

        Glide.with( holder.itemView.getContext() )
                .load( album.getPhoto() )
                .apply( new RequestOptions().override( 350,350 ) )
                .into( holder.imgPhoto );

        holder.tvName.setText(album.getName());
        holder.tvDetail.setText(album.getDetail());

        holder.btnFavorite.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( holder.itemView.getContext(),"Favorite"+
                        listAlbum.get( holder.getAdapterPosition() ).getName(),Toast.LENGTH_SHORT ).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listAlbum.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( holder.itemView.getContext(),"kamu pilih "+
                        listAlbum.get( holder.getAdapterPosition() ).getName(),Toast.LENGTH_SHORT ).show();
            }
        } );

    }

    @Override
    public int getItemCount() {
        return listAlbum.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnFavorite, btnShare;
        CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);


        }
    }
}
