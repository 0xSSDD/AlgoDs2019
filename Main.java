package com.company;

public class Main {

    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        theList.toString();

        while( !theList.isEmpty() ) {

            Link aLink = theList.deleteFirst();
            System.out.print( "Deleted");
            aLink.toString();
            System.out.println("");
        }

        theList.toString();
    }
}
