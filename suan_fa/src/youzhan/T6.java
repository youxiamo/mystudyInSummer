package youzhan;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int k=in.nextInt();
            int [][]num=new int[in.nextInt()][in.nextInt()];
            boolean flag=true;
            for (int i = 0; i <num.length ; i++) {
                for (int j = 0; j <num[i].length ; j++) {
                    if(k==in.nextInt()) {System.out.println(i+" "+j);flag=false;}
                }
            }
            if(!flag){
                System.out.println("-1 -1");
            }
        }
    }
}
