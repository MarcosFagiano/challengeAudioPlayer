package com.challenge.audioplayer.models;

public class Podcast extends Audio {
    public Podcast(String title, int totalLikes, int totalPlay, int calification) {
        super(title, totalLikes, totalPlay, calification);
        //TODO Auto-generated constructor stub
    }
    private String presenter;
    private String description;


    //getters
    public String getPresenter() {
        return presenter;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public int getCalification() {
        if(getTotalPlay()>= 200){
            return 9;
        }else{
            return 2;
        }
    }

    //setters
    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    

}
