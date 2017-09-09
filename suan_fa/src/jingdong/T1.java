package jingdong;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
public class T1 {

    static int cc=0;

    static Stack<Character> stack=new Stack<Character>();
    static void pan(String s1,int x){
       // StringBuilder s=new StringBuilder(s1);

     //   if(s1.equals("")){cc++;return;}

       if(s1.charAt(0)=='(')s1=s1.substring(1,s1.length());
       else return;
       // System.out.println(s);

        for (int i = 0; i <s1.length() ; i++) {
            if(s1.charAt(i)==')'){

                StringBuilder ss=new StringBuilder(s1);
                ss.deleteCharAt(i);
            //    System.out.println(ss);
            //    System.out.println(s);
                if(isSafe(ss,i)){
                 //   cc++;
                    if(!ss.toString().equals(""))
                        pan(ss.toString(),i);
                    else cc++;
                }
            }
        }
    }


    static  boolean isSafe(StringBuilder s,int x){

            stack.clear();


        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='(')stack.push('(');
            else if(!stack.empty())stack.pop();
            else return false;
        }
        if(stack.empty())return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            /*(((())))*/
            String ss=in.nextLine();
            cc=0;


     //       System.out.println(isSafe(s,0));

            pan(ss,-1);

            System.out.println(cc);
        }
    }
}
