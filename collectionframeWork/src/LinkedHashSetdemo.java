/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class LinkedHashSetdemo {
    public static void main(String args[]){
        LinkedHashSet<String>lhs=new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("x");
        lhs.add("b");
        lhs.add("h");
      //  lhs.forEach((x)->System.out.println(x));
        Iterator<String>itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
