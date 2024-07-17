package sorting;

import java.util.*;

public class Sort4 {
	
	public static int left (int i) {
		//place code here
	}
	
	public static int right (int i) {
		//place code here
		
	}
	
	public static int parent (int i) {
		//Please code here
	}
	
	public static int[] max_heapify (int[] array, int heap_size, int i) {
		//place code here
			
	}

	
	public static int[] build_heap (int[] array) {
		//place code here
	}
	
	public static int[] heap_sort (int[] array) {
		//place code here
	}
	
	
	public static int[] generate_random_array (int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : array) {
	        list.add(i);
	    }
		
		Collections.shuffle(list, new Random(System.currentTimeMillis()));
		
		 for (int i = 0; i < array.length; i++) {
		        array[i] = list.get(i);
		    }
		
		return array;
	}
    
	

	public static boolean check_sorted (int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i-1] > array[i])
				return false;
		}
		return true;
	}
	
	
	
	public static int[] generate_array(int start, int end, int increment) {
        int[] array = new int[end];
        for (int i = start; i < end; i=i+increment) {
            array[i] = i;
        }
        return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Heap sort starts ------------------");
		int[] array = generate_array(0, 20, 1);
		System.out.println("Generated array: " + java.util.Arrays.toString(array));
        array = Sort4.generate_random_array(array);
        System.out.println("randomized array: " + java.util.Arrays.toString(array));
		long t1 = System.currentTimeMillis();
		array = Sort4.heap_sort(array);
		long t2 = System.currentTimeMillis();
		long t = t2 - t1;
		boolean flag = Sort4.check_sorted(array);
		System.out.println(t + "," + flag);
	
		System.out.println("Heap sort ends ------------------");
	
	}
}

		

