/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class arraydequedemo {
    public static void main(String args[]){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.pollLast();
        dq.pollFirst();
       dq.peekFirst();
        System.out.println(dq);
    }
}
