package sorting;

import java.util.*;

public class Sort2 {
	public static int[] merge_sort (int[] array, int p, int r) {
		//Insert merge_sort code here, based on pseudocode from lecture
		
		return array;
	}
	
	public static int[] merge (int[] array, int p, int q, int r) {
		
		
		//insert merge code here, based on pseudocode from lecture
		
		
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
	
	public static void main(String[] args) {
		int[] array = generate_array(1, 500000, 1);

        System.out.println("Generated array: " + java.util.Arrays.toString(array));
        
        array = Sort2.generate_random_array(array);
        
        
        System.out.println("randomized array: " + java.util.Arrays.toString(array));

		System.out.println("Merge sort starts ------------------");

		long time1 = System.currentTimeMillis();
		
		array = Sort2.merge_sort(array, 0, array.length-1);
		
		long time2 = System.currentTimeMillis();
		
		long time = time2 - time1;
		
		boolean flag = Sort2.check_sorted(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(time + "," + flag);
	
		System.out.println("Merge sort ends ------------------");
	}


}
