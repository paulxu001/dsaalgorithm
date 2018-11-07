package com.pingwolf.dsaalgorithm.geekertime.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
* BubbleSort Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 4, 2018</pre> 
* @version 1.0 
*/ 
public class BubbleSortTest {

    List<Integer> unSorted = new ArrayList(150);


@Before
public void before() throws Exception {

    System.out.println("perform beform method");

    Random random = new Random();
    for(int i = 0; i < 100; i++){
        unSorted.add(random.nextInt(100));
    }

} 

@After
public void after() throws Exception {
    System.out.println("perform after method");
} 

/** 
* 
* Method: sort(int[] args) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    BubbleSort bubbleSort = new BubbleSort();
    int[] a = new int[]{1, 3, 5, 6, 3,4, 8,109,10};
    bubbleSort.sort(a);

    System.out.println(a);
    System.out.println(unSorted);

    bubbleSort.sort(unSorted);

    System.out.println(unSorted);
} 


} 
