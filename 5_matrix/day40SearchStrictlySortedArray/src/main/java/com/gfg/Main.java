package com.gfg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[][] mat = new int[][]{{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int x = 6;
        System.out.println("given array: ");
        printArr(mat);
        Solution solution = new Solution();
        System.out.println("the statement that the key: "+x+" is present in array is: "+solution.searchMatrix(mat,x));
    }
    private static void printArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}