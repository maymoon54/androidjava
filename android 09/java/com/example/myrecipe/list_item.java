package com.example.myrecipe;

public class list_item {

    private String id;
    private String name;
    private String title;
    private String img;
    private String date;

    public list_item(String id, String name, String title, String img, String date) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.img = img;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
