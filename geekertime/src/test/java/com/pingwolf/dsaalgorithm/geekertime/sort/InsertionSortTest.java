package com.pingwolf.dsaalgorithm.geekertime.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
* InsertionSort Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 4, 2018</pre> 
* @version 1.0 
*/ 
public class InsertionSortTest {
    List<Integer> unSorted = new ArrayList(15);


    @Before
    public void before() throws Exception {

        System.out.println("perform beform method");

        Random random = new Random();
        for(int i = 0; i < 10; i++){
            unSorted.add(random.nextInt(100));
        }

    }

    @After
    public void after() throws Exception {
        System.out.println("perform after method");
    }

    /**
* 
* Method: sort(List<Integer> unSorted) 
* 
*/ 
@Test
public void testSort() throws Exception { 
    InsertionSort insertionSort = new InsertionSort();
    System.out.println(unSorted);

    insertionSort.sort(unSorted);
    System.out.println(unSorted);


}

@Test
public void testSort1() throws  Exception{
    InsertionSort insertionSort = new InsertionSort();
    System.out.println(unSorted);
    insertionSort.sort1(unSorted);
    System.out.println(unSorted);
}




} 
