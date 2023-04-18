/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class PrintArray {
    public void Array(int[] a){
        for (int i=0;i<=a.length-1;i++){
        System.out.print(a[i]+" ");
    }
        System.out.println();
    }
public static void main(String args[]){
PrintArray obj=new PrintArray();
obj.Array(new int[]{2,4,5,6,41,5});
}
}
