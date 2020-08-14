package com.example.listsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int time_load=4000;

    private RecyclerView rvAlbum;
    private ArrayList<Album> list = new ArrayList<>(  );
    private String title = "List Album";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );
        setActionBarTitle( title );

        rvAlbum = findViewById(R.id.rv_album);
        rvAlbum.setHasFixedSize(true);

        list.addAll(AlbumData.getListData());
        showRecyclerList();

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(MainActivity.this, Home.class);
                startActivity(home);
                finish();
            }
        }, time_load );
    }

    private void showRecyclerList() {
        rvAlbum.setLayoutManager( new LinearLayoutManager( this ) );
        ListAlbumAdapter listAlbumAdapter = new ListAlbumAdapter(list);
        rvAlbum.setAdapter( listAlbumAdapter );

        listAlbumAdapter.setOnItemClickBack( new ListAlbumAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Album data) {
                showSelectedAlbum(data);
            }
        } );
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerGrid(){
        rvAlbum.setLayoutManager( new GridLayoutManager( this, 2 ) );
        GridAlbumClass gridAlbumClass= new GridAlbumClass(list);
        rvAlbum.setAdapter( gridAlbumClass );

        gridAlbumClass.setOnItemClickCallback(new GridAlbumClass.OnItemClickCallback(){
            public void onItemClicked(Album data){
                showSelectedAlbum(data);
            }
        });
    }

    private void showRecyclerCardView(){
        rvAlbum.setLayoutManager(new LinearLayoutManager(this));
        CardViewAlbumAdapter cardViewAlbumAdapter = new CardViewAlbumAdapter(list);
        rvAlbum.setAdapter(cardViewAlbumAdapter);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title="Tampilan List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title="Tampilan Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title="Tampilan Cardview";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle( title );
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedAlbum(Album album) {
        Toast.makeText( this,"Kamu pilih"+album.getName(),Toast.LENGTH_SHORT ).show();

    }
}