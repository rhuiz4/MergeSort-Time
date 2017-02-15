/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  MergeSort takes an int[] to be sorted.
  It splits up the job of sorting.
  It splits the int[] in halves until a half is 1 card.
  Merges(sorts) both 1 cards.
  Merges(sorts) both 2 cards.
  Keeps doing this until merges both halves of int[].
  Int[] is now sorted.
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private int[] merge( int[] a, int[] b ) 
    {
	int[] arr = new int[a.length+b.length];
	int counterA = 0;
	int counterB = 0;
	int counterArr = 0;
	
	while ( counterArr != arr.length ) {
	    if (counterB < b.length) {
		if (
		    counterA == a.length
		    || a[counterA] > b[counterB]
		    || a[counterA] == b[counterB]) {
		    arr[counterArr] = b[counterB];
		    counterB++;
		    counterArr++;
		}
	    }
		
	    if (counterA < a.length) {
		if (counterB == b.length
		    || a[counterA] < b[counterB] ) {
		    arr[counterArr] = a[counterA];
		    counterA ++;
		    counterArr++;
		}
	    }
	}
	
	return arr;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public int[] sort( int[] arr ) 
    {
	if (arr.length == 1){
	    return arr;
	}
	else{
	    
	    //splits into two arrays
	    int[] arr1 = new int[arr.length / 2];
	    for (int x = 0; x < arr.length / 2; x++){
		arr1[x] = arr[x];
	    }
	    int[] arr2 = new int[arr.length - (arr.length / 2)];
	    for (int x = arr.length / 2; x < arr.length; x++){
		arr2[x - arr.length / 2] = arr[x];
	    }
	    
	    return merge(sort(arr1),sort(arr2));
	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


}//end class MergeSort

