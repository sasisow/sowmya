package com.devlabs.assignment3;

import java.util.*;

public class HighLowTreeSet {
    public static void main(String args[])
    {
      
        TreeSet<Integer> set = new TreeSet<Integer>(); 
        set.add(33);
        set.add(96);
        set.add(17);
        set.add(91);
        set.add(10);
        set.add(4);
        set.add(11);
        set.add(22);
        
        System.out.println("Elements of the treeset are: " + set);

        
        System.out.println("Highest Value: " + set.pollLast()); 
        
        System.out.println("Lowest Value: " + set.pollFirst());
                                                                
        }       


    }
