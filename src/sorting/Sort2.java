package sorting;

import java.util.*;

public class Sort2 {

	public static int[] merge_sort (int[] array, int p, int r) {
		//Insert merge_sort code here, based on pseudocode from lecture
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort (array, p, q);
			merge_sort (array, q + 1, r);
			merge(array, p, q, r);
		}

		return array;
	}
	
	public static int[] merge (int[] array, int p, int q, int r) {
		//insert merge code here, based on pseudocode from lecture
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] Larray1 = new int[n1];
		int[] Larray2 = new int[n2];
		for (int i = 0; i < n1; ++i) {
			Larray1[i] = array[p + i];
		}
		for (int i = 0; i < n2; ++i) {
			Larray2[i] = array[q +1+ i];
		}
		int i = 0, j = 0;
		for (int k = p; k <= r; k++) {
			if (i < n1 && (j >= n2 || Larray1[i] <= Larray2[j])) {
				array[k] = Larray1[i];
				i++;
			} else {
				array[k] = Larray2[j];
				j++;
			}
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
//        System.out.println("Generated array: " + java.util.Arrays.toString(array));
//        System.out.println("randomized array: " + java.util.Arrays.toString(array));

		System.out.println("Merge sort starts ------------------");

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

	
		System.out.println("Merge sort ends ------------------");
	}


}
