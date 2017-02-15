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
  Batch size: <1000>
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

	int[] arr0 = new int[1];
	for(int i = 0;i < 1; i++){
	    arr0[i] = (int)(Math.random()*1000);
	}
	
	int[] arr1 = new int[10];
	for(int i = 0;i < 10; i++){
	    arr1[i] = (int)(Math.random()*1000);
	}

	int[] arr2 = new int[100];
	for(int i = 0;i < 100; i++){
	    arr2[i] = (int)(Math.random()*1000);
	}

	int[] arr3 = new int[1000];
	for(int i = 0;i < 1000; i++){
	    arr3[i] = (int)(Math.random()*1000);
	}

	int[] arr4 = new int[10000];
	for(int i = 0;i < 10000; i++){
	    arr4[i] = (int)(Math.random()*1000);
	}

	int[] arr5 = new int[100000];
	for(int i = 0;i < 100000; i++){
	    arr5[i] = (int)(Math.random()*1000);
	}

	int[] arr6 = new int[1000000];
	for(int i = 0;i < 1000000; i++){
	    arr6[i] = (int)(Math.random()*1000);
	}
	
	System.out.println("Merge Sort:");
	long average = 0;

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr0);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1 element: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr1);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("10 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr2);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("100 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr3);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1,000 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr4);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("10,000 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr5);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("100,000 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr6);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1,000,000 elements: \t\t" + average);
	
    }//end main

}//end class
