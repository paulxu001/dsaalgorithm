package com.pingwolf.dsaalgorithm.geekertime.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** 
* MergeSort Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 6, 2018</pre> 
* @version 1.0 
*/ 
public class MergeSortTest {

    int[] a = new int[10];

@Before
public void before() throws Exception {

    Random random = new Random();

    for(int i=0; i < 10; i++){
        a[i] = random.nextInt(100);
    }
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] a) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...

    MergeSort mergeSort = new MergeSort();
    System.out.println(Arrays.asList(a));
    int[] b = mergeSort.sort(a);
    System.out.println(Arrays.asList(b));
//    System.out.println(new ArrayList<Integer>(b));
} 


/** 
* 
* Method: merge(int[] a1, int[] a2) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = MergeSort.getClass().getMethod("merge", int[].class, int[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
