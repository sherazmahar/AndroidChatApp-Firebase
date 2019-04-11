package com.example.shiraz.letschatt;

/**
 * Created by Shiraz on 3/6/2019.
 * ----FOR RETRIEVING "chats" SECTION OF DATABASE-----
 */

public class Conv {
    public boolean seen;
    public long timeStamp;

    public Conv(){

    }

    public Conv(boolean seen, long timeStamp) {
        this.seen = seen;
        this.timeStamp = timeStamp;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
