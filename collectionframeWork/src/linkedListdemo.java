/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class linkedListdemo {
    public static void main(String args[]){
        LinkedList<Integer> at=new LinkedList<>();
        LinkedList<Integer> at1=new LinkedList<>(List.of(50,87,70,2,95));
        at.add(10);
        at.add(0,51);
        at.addAll(1,at1);
        at.add(5,70);
       System.out.println(at);
    }
    
}
