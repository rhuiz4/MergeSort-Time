/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  Compare the time of runtime for MergeSort to runtime of other sorts
  (ex: BubbleSort, InsertionSort, SelectionSort).
  Compare the swap runtime to runtime of pass of MergeSort
  (i.e. merge and sort)
  
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  nlog(n)
  
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSort bob = new MergeSort();

	int[] arr0 = new int[10];
	for(int i = 0;i < 10; i++){
	    arr0[i] = (int)(Math.random()*1000);
	}

	int[] arr1 = new int[100];
	for(int i = 0;i < 100; i++){
	    arr1[i] = (int)(Math.random()*1000);
	}

	int[] arr2 = new int[1000];
	for(int i = 0;i < 1000; i++){
	    arr2[i] = (int)(Math.random()*1000);
	}
	System.out.println("Merge Sort:");
	System.out.println("\t10 element array:");
	for (int x = 0; x < 10; x++){
	    long start = System.nanoTime();
	    bob.sort(arr0);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    System.out.println("\t\t" + elapsed);
	    }
	System.out.println("\t100 element array:");
	for (int x = 0; x < 10; x++){
	    long start = System.nanoTime();
	    bob.sort(arr1);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    System.out.println("\t\t" + elapsed);
	    }
	System.out.println("\t1000 element array:");
	for (int x = 0; x < 10; x++){
	    long start = System.nanoTime();
	    bob.sort(arr2);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    System.out.println("\t\t" + elapsed);
	    }
    }//end main

}//end class
