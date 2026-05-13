import java.util.*;

public class leader {
    public static int[] fun(int arr[],int n){
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            boolean result=true;
            for(int j=i+1;j<n;j++){
                res[i]=-1;
                if(arr[i]<arr[j]){
                    result=false;
                    break;
                }
            }
        if(result){
            res[i]=arr[i];
        }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter a array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=fun(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
