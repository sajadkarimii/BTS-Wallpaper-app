package com.example.wallpaper;

import java.io.Serializable;

public class desk implements Serializable {
    private String pic;

    public desk(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
