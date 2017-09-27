package sougou;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/9/17 0017.
 */
public class T2 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
                String s=in.nextLine();
        //    System.out.println(s);
                String []step=s.split("/");

          /*  for (int i = 0; i <step.length ; i++) {
                System.out.println(step[i]);
            }*/
            Stack<String> stack=new Stack<String>();
            for (int i = 1; i <step.length ; i++) {
                if(step[i].equals("..")){
                    stack.pop();
                }else if(step[i].equals(".")){

                }else if(step[i].equals("")){

                }
                else stack.push(step[i]);
            }
          //  System.out.println("---------");
            for (int i = 0; i <stack.size() ; i++) {

                System.out.print("/"+stack.get(i));
            }



        }
    }
}
