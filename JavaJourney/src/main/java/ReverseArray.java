/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ReverseArray {
    public static void reverse(int[] a, int start,int end){
        while(start<end){
            int temp=0;
           temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] b){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] k={1,65,86,2,4};
    printArray(k);
    reverse(k,0,k.length-1);
    printArray(k);
    }
}