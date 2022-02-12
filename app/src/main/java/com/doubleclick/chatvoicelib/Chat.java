package com.doubleclick.chatvoicelib;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class Chat {

    private String name;
    private String id;

    public Chat(String name, String id, String massage, int image, String type) {
        this.name = name;
        this.id = id;
        this.massage = massage;
        this.image = image;
        this.type = type;
    }

    private String massage;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public Chat(String name, String id, String massage, String type) {
        this.name = name;
        this.id = id;
        this.massage = massage;
        this.type = type;
    }
}
