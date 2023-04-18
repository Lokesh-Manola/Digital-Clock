/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
class point implements Comparable{
    int x;
    int y;
    public point(int x,int y){
        this.x =x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    public int compareTo(Object o){
        point p=(point)o;
        if(this.x<p.x)
        return -1;
        else if(this.x>p.x)
            return 1;
        else{
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }
}
public class treesetd {
    public static void main(String args[]){
        TreeSet<point> ts=new TreeSet<>();
        ts.add(new point(6,2));
        ts.add(new point(5,4));
        ts.add(new point(5,5));
        System.out.println(ts);
    }
}
