/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionframework;
import java.util.*;
public class arraylistdemo {
    public static void main(String args[]){
    ArrayList<Integer>al=new ArrayList<>(20);
    ArrayList<Integer>al1=new ArrayList<>(List.of(50,12,45,21));
    al.add(10);
    al.add(0,5);
    al.addAll(1,al1);
    al.set(2,100);
    System.out.println(al);
}
}
