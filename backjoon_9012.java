package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class backjoon_9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(slove(in.next()));
        }
    }
    public static String slove(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a == '('){
                stack.push(a);
            }
            else if(stack.isEmpty())
                    return "NO";
            else
                    stack.pop();

        }
        if(stack.isEmpty())
            return "YES";
        else
            return "NO";


    }
}
