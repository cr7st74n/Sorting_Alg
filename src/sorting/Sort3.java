package sorting;

import java.util.*;

public class Sort3 {

    public static int left (int i) {
        //place code here
        return 2 * i + 1;
    }

    public static int right (int i) {
        //place code here
        return 2 * i + 2;
    }

    public static int parent (int i) {
        //Please code here
        return (i - 1) / 2;
    }

    public static int[] max_heapify (int[] array, int heap_size, int i) {
        //place code here
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < heap_size && array[l] > array[largest]) {
            largest=l;
        }
        if (r < heap_size && array[r] > array[largest]) {
            largest=r;
        }
        if (largest!=i) {
            int postitionArr = array[i];
            array[i] = array[largest];
            array[largest] = postitionArr;
            max_heapify(array, heap_size, largest);
        }

        return array;
    }


    public static int[] build_heap (int[] array) {
        //place code here
        int heap_size = array.length;
        for (int i = (heap_size /2) - 1; i >= 0; i--){
            max_heapify(array,heap_size,i);
        }
        return array;
    }

    public static int[] heap_sort (int[] array) {
        int heap_size = array.length;
        build_heap(array);
        for (int i = array.length - 1; i > 0; i--) {
            int PositionArr = array[0];
            array[0] = array[i];
            array[i] = PositionArr;
            heap_size--;
            max_heapify(array, heap_size, 0);
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
        int[] array = new int[end];
        for (int i = start; i < end; i=i+increment) {
            array[i] = i;
        }
        return array;
    }


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
        // TODO Auto-generated method stub

        System.out.println("Heap sort starts ------------------");

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



        System.out.println("Heap sort ends ------------------");

    }
}


