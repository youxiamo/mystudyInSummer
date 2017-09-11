package aqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/9/10 0010.
 */
public class T2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            if(s.equals("")){
                System.out.println("0");
            }else {
                Stack<Character> stack = new Stack<Character>();
                int max = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(') stack.push('(');
                    else {
                        if (stack.size() > max) max = stack.size();
                        stack.pop();
                    }
                }
                System.out.println(max);
            }

        }
    }
}
