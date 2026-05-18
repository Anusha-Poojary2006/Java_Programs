import java.util.Scanner;
import java.util.Stack;

public class balance {
    public static boolean fun(String s){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(ch=='('||ch=='['||ch=='{'){
            stack.push(ch);
        }
        else if(!stack.isEmpty()||(ch==')'&&stack.peek()=='('||ch==']'&&stack.peek()=='['||ch=='}'&&stack.peek()=='{')){
            stack.pop();
        }
        else{
            return false;
        }
    }
        return stack.isEmpty()?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a brackets:");
        String s=sc.nextLine();
        boolean res=fun(s);
        System.out.println(res);
    }
}

