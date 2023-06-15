package com.example.wallpaper;

import java.io.Serializable;

public class mobile implements Serializable {
    private String pic;

    public mobile( String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
