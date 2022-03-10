package com.chat.myapplication;

public class Food {
   String  text;
   int image;

    public Food(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public  Food(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
