import java.util.*;
public class infixTopostfix {
    public static void main(String[] args) {
        String s="AB*CD*+";
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isAlphabetic(ch)){
                stack.push(ch+"");
            }
            else{
                String s1=stack.pop();
                String s2=stack.pop();
                String res="("+s2+ch+s1+")";
                stack.push(res);
            }
        }
        System.out.println(stack.pop());
    }
}
