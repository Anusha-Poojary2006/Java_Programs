import java.util.*;

public class nextSmaller {
    public static int[] nse(int arr[]){
        Stack<Integer> stack=new Stack<Integer>();
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int element=arr[i];
            while(!stack.isEmpty() && stack.peek()>=element){
                stack.pop();
            }
            res[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(element);
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
        int res[]=nse(arr);
        System.out.println(Arrays.toString(res));
    }
}

