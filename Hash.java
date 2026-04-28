//A simple java program about HashMap

import java.util.*;
public class Hash {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Anusha");
        map.put(2,"Anuvitha");
        map.put(3,"Vinoda");
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(2,"Not found"));
        System.out.println(map.getOrDefault(4,"Not found"));
        System.out.println(map.containsKey(3));
    }
}
