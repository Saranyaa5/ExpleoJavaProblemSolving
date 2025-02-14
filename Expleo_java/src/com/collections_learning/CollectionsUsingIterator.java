package com.collections_learning;

import java.util.*;

public class CollectionsUsingIterator {
    public static void main(String[] args) {
        
        Integer arr[] = {1, 2, 4, 2, 3, 7, 1, 6, 7}; 
        List<Integer> a = Arrays.asList(arr); 
        ListIterator<Integer> it = a.listIterator();
        System.out.print(a);
        while (it.hasNext()) {
            int element = it.next();
            if(element==3) {
            	break;
            }
        }
        it.set(0);
        System.out.print(a);
        while (it.hasPrevious()) {
            System.out.print(it.previous()+" ");
            
        }
    }
}
