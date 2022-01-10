package com.example.listviewandroid.models;

public class Post {
    private String userName;
     private int userProfile,postImage;

    public Post(String userName, int userProfile, int postImage) {
        this.userName = userName;
        this.userProfile = userProfile;
        this.postImage = postImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public int getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(int userProfile) {
        this.userProfile = userProfile;
    }
}
