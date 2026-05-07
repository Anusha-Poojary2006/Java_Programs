//A simple java program for merge sort

import java.util.*;
public class mergeSort {
    public static void mergeSort(int arr[],int low,int mid,int high){
        int a[]=new int[arr.length];
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                a[k]=arr[i];
                k++;
                i++;
            }
            else{
                a[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            a[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            a[k]=arr[j];
            k++;
            j++;
        }
        for(int x=low;x<=high;x++){
            arr[x]=a[x];
        }
       
    }
    public static void merge(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            mergeSort(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,6,4,7,9,8,1};
        merge(arr, 0, arr.length-1);
         System.out.println(Arrays.toString(arr));
    }
}
