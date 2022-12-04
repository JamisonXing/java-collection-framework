package com.jamison.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test implements Cloneable{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator it = list.iterator();
        while(it.hasNext()) {
            it.next();
            list.remove(1);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
