//import java.util.Map;
import java.util.*;

//import java.util.Map;



public class TreeMapdemo {
    public static void main(String args[]){
    TreeMap<Integer,String>tm=new TreeMap<>(Map.of(1,"a",2,"b",3,"c"));
        tm.put(5,"e");
        tm.put(6,"f");
        Map.Entry<Integer,String>e=tm.lastEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(tm);
    }
    
}
 