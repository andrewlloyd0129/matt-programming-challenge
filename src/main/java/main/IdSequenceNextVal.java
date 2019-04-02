package main;

public class IdSequenceNextVal {
    static int next = 0;

    static public int getNext(){
        return ++next;
    }
}
