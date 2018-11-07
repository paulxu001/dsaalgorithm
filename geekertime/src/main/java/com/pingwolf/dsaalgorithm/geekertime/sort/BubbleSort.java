package com.pingwolf.dsaalgorithm.geekertime.sort;

import java.util.List;

public class BubbleSort {

    public void sort(int[] args){
        if(args.length == 1){
            return;
        }

        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args.length - 1 - i; j++){
                if(args[j] > args[j+1]){
                    int tmp = args[j];
                    args[j] = args[j +1];
                    args[j+1] = tmp;
                }
            }
        }
    }

    public void sort(List<Integer> args){
        if(args.size() == 1){
            return;
        }

        for(int i = 0; i < args.size(); i++){
            for(int j = 0; j < args.size() - 1 - i; j++){
                if(args.get(j) > args.get(j+1)){
                    int tmp = args.get(j);
                    args.set(j, args.get(j +1));
                    args.set(j+1,  tmp);
                }
            }
        }
    }
}
