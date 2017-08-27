package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// test
        int a[] = { 10,9,8,7,6,5,4,3,2,1,0,2};
        print_Array(a);
        Merge_sort(a,0,a.length-1);
        print_Array(a);
    }

    public static void merge(int a[], int start, int middle, int end){
        int start_pos = start;
        int tmp[] = new int[a.length];
        int left_pos = start;// use for sort
        int tmp_pos = start;//use for tmp replacing a
        int right_pos = middle + 1;
        while( (left_pos <= middle)&&(right_pos <= end)){
            //add smaller one to tmp
            if(a[left_pos] <= a[right_pos])
                tmp[start_pos++] = a[left_pos++];
            else tmp[start_pos++] = a[right_pos++];

        }
        //add rest number to tmp
        while( left_pos <= middle )
            tmp[start_pos++] = a[left_pos++];//add rest of left
        while( right_pos <= end)
            tmp[start_pos++] = a[right_pos++];//add rest of right

        while( tmp_pos <= end){
            //add elements of tmp to a
            a[tmp_pos] = tmp[tmp_pos];
            tmp_pos++;
        }
    }

    public static void Merge_sort(int a[], int start, int end){

        int middle;
        if(start < end){

            middle = (start + end)/2;
            Merge_sort(a, start, middle);//merge sort left
            Merge_sort(a, middle + 1, end);
            merge(a, start, middle, end);

        }
        else return;
    }

    public static void print_Array(int a[]){
        //print array
        for (int element:a
             ) {
            System.out.print(element + " ");
        }
        System.out.println("fuck youuuuu");
    }
}
