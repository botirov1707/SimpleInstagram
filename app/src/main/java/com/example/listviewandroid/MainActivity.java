package com.example.listviewandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewandroid.adapters.PostsAdapter;
import com.example.listviewandroid.models.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Post> postArrayList;
RecyclerView recyclerView;
PostsAdapter postsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplication(),1));
        postArrayList=new ArrayList<Post>();
        addDataToArray();
        postsAdapter=new PostsAdapter(this,postArrayList);
        recyclerView.setAdapter(postsAdapter);
    }

    private void addDataToArray() {
        postArrayList.add(new Post("Bekhruz_001",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_002",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_003",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_004",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_005",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_006",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        postArrayList.add(new Post("Bekhruz_007",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));

    }


}