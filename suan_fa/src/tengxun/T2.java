package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class T2 {

    static int pan(int n){

        if(n==1)return 1;

        if(n==0)return 0;
        else {
            int count=0;
            for(int i=0;Math.pow(2,i)<n;i++){
               count += pan(n-(int)Math.pow(2,i));
            }
            return count;
        }


    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(pan(n));
        }
    }
}
