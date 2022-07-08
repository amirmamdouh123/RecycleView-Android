package org.codeforiraq.recyclerviewproject;

public class filmList {
    String name,time,type,description;
    int Image;


    public filmList(String name, String time, String type, String description,int Image) {
        this.name = name;
        this.time = time;
        this.type = type;
        this.description = description;
        this.Image=Image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(int Image){
        this.Image=Image;
    }
    public int getImage(){
        return Image;
    }
}
