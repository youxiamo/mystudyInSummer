package wanmei;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/27 0027.
 */
public class T1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        int n=in.nextInt();
        int []A=new int[n];
        int []B=new int[n];
            for (int i = 0; i <n ; i++) {
                A[i]=in.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                B[i]=in.nextInt();
            }

            int count=0;
            int j,i;
            boolean flag=false;
            for ( i = 0,j=0; i <n ; i++,j++) {
                while(j<n&&A[i]<B[j])j++;

                if(j<n){
                    if(A[i]>B[j])count+=100;
                    else count+=0;
                }else {flag=true;break;}

            }
            if(flag)count-=100*(n-i);

            System.out.println(count);


        }
    }
}
