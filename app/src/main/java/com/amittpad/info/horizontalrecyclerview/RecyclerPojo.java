package com.amittpad.info.horizontalrecyclerview;

/**
 * Created by Admin on 29-07-2017.
 */

public class RecyclerPojo {
    String id, text;
    int icon;
    public RecyclerPojo(String id, String text, int icon) {
        this.id = id;
        this.text = text;
        this.icon = icon;
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getId() {

        return id;
    }

    public String getText() {
        return text;
    }

    public int getIcon() {
        return icon;
    }


}
