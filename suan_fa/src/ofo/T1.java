package ofo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/15 0015.
 */
public class T1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){


            int n=in.nextInt();

            int n1=n;
            int a=0;
            if(n1<0)n=-n;
            while(n>0){
                if(a*10>Integer.MAX_VALUE){a=0;break;}
                a=a*10;
                a+=n%10;
                n=n/10;
            }
            if(n1<0) System.out.println(-a);
            else System.out.println(a);
        }
    }
}
