package zhaoyinxinyongka;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class zhaoyinxinyongka {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();

            int m=a;
            int x=b;int c;
            while(x!=0){
                c=m%x;
                m=x;
                x=c;
            }
            System.out.println(m);
            m=a*b/m;
            int count=0;
            for (int i = 1; i*m <=n ; i++) {
                if(i*m<=n)count++;
            }
            System.out.println(count);

        }
    }
}
