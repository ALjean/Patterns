package com.jean.algorithms.structure.linkedlist;



public class LinkList {

    Link first;


    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int iData, double dData){
        Link newLink =  new Link(iData, dData);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key){
        Link current = first;

        while (current.iData != key){
            if(current.next == null){
                return null;
            }else{
                current = current.next;
            }

        }
        return current;
    }

    public Link delete(int key){
        Link current = first;
        Link previous = first;

        while (current.iData != key){
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if(current == first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;

    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link current = first;

        while (current != null){
            current.displayLink();
            current = current.next;
        }
    }
}
