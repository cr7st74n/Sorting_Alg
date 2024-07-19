package sorting;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Sort {
	
	
	public static int[] insertion_sort (int[] array) {
		//Fill in your insertion sort program here
		for (int i = 2; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
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

// Created this function to return all the data .
	public static void returnTimeAndArray( int[]array){
		long time1 = System.currentTimeMillis();
		array = Sort.insertion_sort(array);
		long time2 = System.currentTimeMillis();
		long time = time2 - time1;
		boolean flag = Sort.check_sorted(array);
//		System.out.println(Arrays.toString(array));     I comment this part because I could not see the time and the validation.
		System.out.println(time + "," + flag);
	}
	
	public static void main(String[] args) {
		int[] array = generate_array(1, 100, 1);

        System.out.println("Generated array: " + java.util.Arrays.toString(array));
        
        array = Sort.generate_random_array(array);
        
        
        System.out.println("randomized array: " + java.util.Arrays.toString(array));

		System.out.println("Insertion sort starts ------------------");
		returnTimeAndArray(array);

		System.out.println("\n Lest try something else:");
		int[] array1 = generate_array(1, 100, 1);
		returnTimeAndArray(array1);
		System.out.println("\n Lest try something else:");
		int[] array2 = generate_array(1, 1000, 1);
		returnTimeAndArray(array2);
		System.out.println("\n Lest try something else:");
		int[] array3 = generate_array(1, 10000, 1);
		returnTimeAndArray(array3);
		System.out.println("\n Lest try something else:");
		int[] array4 = generate_array(1, 100000, 1);
		returnTimeAndArray(array4);
		System.out.println("\n Lest try something else:");
		int[] array5 = generate_array(1, 1000000, 1);
		returnTimeAndArray(array5);
		System.out.println("\n Lest try something else:");
		int[] array6 = generate_array(1, 2000000000, 1);
		returnTimeAndArray(array6);
		System.out.println("\n That's all amigos :') ");


	
		System.out.println("Insertion sort ends ------------------");
	}

}

