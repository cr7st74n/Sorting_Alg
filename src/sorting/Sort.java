package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Sort {
	
	
	public static int[] insertion_sort (int[] array) {
		//Fill in your insertion sort program here
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
        int[] array = new int[end+1];
        for (int i = start; i <= end; i=i+increment) {
            array[i] = i;
        }
        return array;
	}
	
	public static void main(String[] args) {
		int[] array = generate_array(1, 100, 1);

        System.out.println("Generated array: " + java.util.Arrays.toString(array));
        
        array = Sort.generate_random_array(array);
        
        
        System.out.println("randomized array: " + java.util.Arrays.toString(array));

		System.out.println("Insertion sort starts ------------------");

		long time1 = System.currentTimeMillis();
		
		array = Sort.insertion_sort(array);
		
		long time2 = System.currentTimeMillis();
		
		long time = time2 - time1;
		
		boolean flag = Sort.check_sorted(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(time + "," + flag);
	
		System.out.println("Insertion sort ends ------------------");
	}

}

