//A simple java program to remove duplicate in array
import java.util.*;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
        int arr[]={1,1,1,2,3,3,4,4,5,5,5,5};
        for(int x:arr){
            set.add(x);
        }
        System.out.println(set);
    }
}
