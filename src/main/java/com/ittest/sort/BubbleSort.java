package com.ittest.sort;

public class BubbleSort {
    /**
     * 思想：双层for循环，外层控制次数，内层进行比较，比较相邻的两个数据，如果第二个数小，就交换位置
     * 平均时间复杂度：O(n2)
     * @param args
     */
    public static void main(String[] args) {

    }

    public static void BubbleSort(int [] arr){
        int temp;//临时变量
        for(int i=0; i<arr.length-1; i++){   //表示趟数，一共arr.length-1次。
            for(int j=arr.length-1; j>i; j--){

                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
