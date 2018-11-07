package com.pingwolf.dsaalgorithm.geekertime.sort; 

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** 
* SelectionSort Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 5, 2018</pre> 
* @version 1.0 
*/ 
public class SelectionSortTest {

    int[] a = new int[]{9,3,5,4,6,7,2,1};

    List<Integer> b = new ArrayList<Integer>();

@Before
public void before() throws Exception {

    Random random = new Random();

    for(int i = 0; i < 10; i++){
        b.add(random.nextInt(100));
    }

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] unSorted) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    SelectionSort selectionSort = new SelectionSort();
    selectionSort.sort(a);
    System.out.println(Arrays.asList(a).toString());

    System.out.println(b);
    selectionSort.sort(b);
    System.out.println(b);
} 


} 
