package com.pingwolf.dsaalgorithm.geekertime.sort;

import java.util.List;

public class SelectionSort {
    public void sort(int[] unSorted){
        for(int i=0; i < unSorted.length; i++){
            int value = unSorted[i];
            int flag = i;
            for(int j = i+1; j < unSorted.length; j++){
                if(unSorted[j] < value){
                    value = unSorted[j];
                    flag = j;
                }
            }

            //交换一次，多了两个变量，这个应该才是正确的选择排序
            unSorted[flag] = unSorted[i];
            unSorted[i] = value;

        }
    }

    public void sort(List<Integer> unSorted){
        for(int i = 0; i < unSorted.size(); i++){
            for(int j=i; j<unSorted.size(); j++){
                if(unSorted.get(i) > unSorted.get(j)){
                    //交换很多次
                    int tmp = unSorted.get(i);
                    unSorted.set(i, unSorted.get(j));
                    unSorted.set(j, tmp);
                }
            }
        }
    }
}
