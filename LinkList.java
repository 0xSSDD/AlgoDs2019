package com.company;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) { // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old first first = newLink; // first --> newLink
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
// delete first item
// (assumes list not empty)
// save reference to link
// delete it: first-->old next // return deleted link


    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.toString();
            current = current.next; // move to next link }
            System.out.println("");
        }
    }
}
