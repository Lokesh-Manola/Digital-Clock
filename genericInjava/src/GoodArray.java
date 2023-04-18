/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class GoodArray {
    public static void main(String args[]){
    int a[]={1,5,2,4,6};
    int temp=0;
    for(int i=0;i<a.length;i++){
        if(a[i]>a[i+1]){
            temp=a[i];
            a[i]=a[i+1];
           
            a[i+1]=temp;
        }
    }
    for(int x:a)
        System.out.print(x+",");
    System.out.println(" ");
}
}
