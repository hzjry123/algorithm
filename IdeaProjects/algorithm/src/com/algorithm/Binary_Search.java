package com.algorithm;

//Iterative binary search,not use recursion, in database, it is lower efficiency.
public class Binary_Search {

    public static void main(String[] args) {
        //binary search
        int[] a = {1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int key = 4;
        int pos, flag = 0;//flag == 0, return leftest, flag == 1, return rightest

        pos = binary_search(a, 0, a.length - 1, key, flag);
        System.out.println(pos);
    }

    public static int binary_search(int[] a, int begin, int end, int key, int flag) {

        int mid, pos = -1;
        if (begin < 0 || end < 0 || a == null || end > a.length || begin > a.length || begin == end)
            return -1;

        while (begin <= end) {

            mid = begin + (end - begin) / 2;//not begin+end/2, it will out of space
            if (a[mid] == key) {
                pos = mid;
                switch (flag) {
                    case 0:
                        end = mid - 1;
                        break;
                    case 1:
                        begin = mid + 1;
                        break;
                    default:
                        return -1;
                }
                //find mid, continue finding the index of leftest element
            }

            if (key > a[mid]) {
                begin = mid + 1;//key is higher,drop the[begin,mid]
            }

            if (key < a[mid]) {
                end = mid - 1;//key is lower,drop the[mid,end]
            }
        }
        return pos;
    }
}

