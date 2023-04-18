/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class RemovingEvenIntFromAnArray {
    public static int[] removeEven(int[] a){
        int oddcount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                oddcount++;
            }
        }
    
    int[] result= new int[oddcount];
    int index=0;
    for (int i=0;i<a.length;i++){
        if(a[i]%2!=0){
            result[index]=a[i];
            index++;
        }
    }
    return result;
}
    public static void main(String args[]){
        int[] p={3,4,7,8,5,42,1};
       for(int x:p){
           System.out.print(x+" ");
       }
       System.out.println();
       int[] result= removeEven(p);
      for(int y:result){
          System.out.print(y+" ");
      }
      System.out.println();
     
    }
}