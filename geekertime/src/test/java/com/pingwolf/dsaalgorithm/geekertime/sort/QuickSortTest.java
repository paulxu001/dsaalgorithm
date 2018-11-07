package com.pingwolf.dsaalgorithm.geekertime.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.Random;

/** 
* QuickSort Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 7, 2018</pre> 
* @version 1.0 
*/ 
public class QuickSortTest {

    int[] a = new int[10];

@Before
public void before() throws Exception {
    Random random = new Random();
    for(int i=0; i < a.length; i++){
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
public void testSortA() throws Exception { 
//TODO: Test goes here...
    QuickSort quickSort = new QuickSort();
    quickSort.sort(a);

    System.out.println(a);
} 

/** 
* 
* Method: sort(int[] a, int first, int end) 
* 
*/ 
@Test
public void testSortForAFirstEnd() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: partition(int[] a, int first, int end) 
* 
*/ 
@Test
public void testPartition() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = QuickSort.getClass().getMethod("partition", int[].class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
