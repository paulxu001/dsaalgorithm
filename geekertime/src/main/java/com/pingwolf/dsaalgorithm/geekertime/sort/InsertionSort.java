package com.pingwolf.dsaalgorithm.geekertime.sort;

import java.util.List;

public class InsertionSort {

    public void sort(List<Integer> unSorted){
        for(int i = 1; i < unSorted.size(); i++){
            int value = unSorted.get(i);
            for(int j = i-1; j >= 0; j--){
                if(unSorted.get(j) > value){
                    unSorted.set(j+1, unSorted.get(j));
                    unSorted.set(j, value);
                }
                else{
//                    unSorted.set(j+1, value);
                    break;
                }

            }
        }
    }

    public void sort1(List<Integer> unSorted){
        for(int i = 1; i < unSorted.size(); i++){
            int value = unSorted.get(i);
            int j = i-1;
            for(; j >= 0; j--){
                if(unSorted.get(j) > value){
                    unSorted.set(j+1, unSorted.get(j));
//                    unSorted.set(j, value);
                }
                else{
//                    unSorted.set(j+1, value);
                    break;
                }

            }

            unSorted.set(j+1, value);
        }
    }
}
