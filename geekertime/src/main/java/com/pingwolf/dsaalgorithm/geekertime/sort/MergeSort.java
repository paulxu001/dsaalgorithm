package com.pingwolf.dsaalgorithm.geekertime.sort;

public class MergeSort {

    public int[] sort(int[] a){

        int p = a.length/2;
        //退出条件
        if(p == 0){
            return a;
        }
        int[] a1 = new int[p];
        System.arraycopy(a, 0, a1, 0, p);

        int[] a2 = new int[a.length - p];
        System.arraycopy(a, p, a2, 0, a.length-p);

        //递归公式（还是不能很快的理解，或者推导出，怎么要怎么去练习这种思维？）
        int[] b1 = sort(a1);
        int[] b2 = sort(a2);

        //合并
        return merge(b1, b2);
    }





    private int[] merge(int[] a1, int[] a2){



        int i = 0;
        int j = 0;
        int k = 0;
        int[] tmp = new int[a1.length + a2.length];
        while(i < a1.length && j < a2.length){
            if(a1[i] > a2[j]){
                tmp[k++] = a2[j++];

            }else{
                tmp[k++] = a1[i++];
            }
        }

        while(i < a1.length){
            tmp[k++] = a1[i++];
        }

        while(j < a2.length){
            tmp[k++] = a2[j++];
        }

        return tmp;
    }


}
