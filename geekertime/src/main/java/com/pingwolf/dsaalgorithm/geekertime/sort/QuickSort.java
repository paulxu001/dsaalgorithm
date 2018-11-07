package com.pingwolf.dsaalgorithm.geekertime.sort;

public class QuickSort {

    public void sort(int[] a){
        sort(a, 0, a.length-1);
    }

    public void sort(int[] a, int first, int end){

        if(first >= end){
            return;
        }

        int p = partition(a, first, end);

        sort(a, first, p-1);
        sort(a, p+1, end);


    }

    private int partition(int[] a, int first, int end) {

        int i = first;
        for(int j=first; j<end; j++){
            if(a[j] < a[end]){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }

        }

        int tmp = a[end];
        a[end] = a[i];
        a[i] = tmp;

        return  i;

    }


}
