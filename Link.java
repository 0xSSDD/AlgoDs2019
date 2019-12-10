package com.company;

public class Link {

        int iData;
        double dData;
        Link next;


    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }


    @Override
    public String toString() {
        return "Link{" +
                "iData=" + iData +
                ", dData=" + dData +
                '}';
    }
}
