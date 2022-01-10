package com.example.listviewandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listviewandroid.R;
import com.example.listviewandroid.models.Post;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {
    Context context;
    ArrayList<Post> postArrayList;

    public PostsAdapter(Context context, ArrayList<Post> postArrayList) {
        this.context = context;
        this.postArrayList = postArrayList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
                return new PostsViewHolder(view);
    }






    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
Post post = postArrayList.get(position);
holder.userProfile.setImageResource(post.getUserProfile());
holder.userName.setText(post.getUserName());
holder.postImage.setImageResource(post.getPostImage());


    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    public class PostsViewHolder extends RecyclerView.ViewHolder {
        TextView userName;
        ImageView postImage,userProfile;
        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);
            userName=itemView.findViewById(R.id.user_name);
            postImage=itemView.findViewById(R.id.iv_post);
            userProfile=itemView.findViewById(R.id.users_profile);
        }
    }
}
