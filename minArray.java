//Java programme to find minimum element in the array using recursion

import java.util.Scanner;

public class minArray {
    public static int fun(int arr[],int index,int min){
        if(index==arr.length){
            return min;
        }
        if(arr[index]<min){
            min=arr[index];
        }
        return fun(arr,index+1,min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the size of the array:"));
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elments:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Minimum element in the array:"+fun(arr,0,Integer.MAX_VALUE));
        sc.close();
    }
}
