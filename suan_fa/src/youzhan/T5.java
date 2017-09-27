package youzhan;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T5 {

    static StringBuilder turn(StringBuilder s){
        StringBuilder s1=new StringBuilder();
        for (int i = s.length()-1; i>= 0; i--) {
            s1.append(s.charAt(i));

        }
        return s1;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s=in.nextLine();
            //System.out.println(turn(new StringBuilder(s)).toString());
            s=turn(new StringBuilder(s)).toString();
            String []str=s.split(" ");
            for (int i = 0; i <str.length ; i++) {
                if(!str[i].equals("")){
                    StringBuilder stringBuilder=turn(new StringBuilder(str[i]));
                    System.out.print(stringBuilder+" ");

                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
