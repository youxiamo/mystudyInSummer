package shuzi360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class T2 {


    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int []num=new int[n];
            int []count=new int[n];
            for(int i=0;i<n;i++){
                num[i]=in.nextInt();
            }
            System.out.print(0);
            for(int i=1;i<num.length;i++){
                count[i]=0;
                for(int j=0;j<i;j++){
                    if(num[j]>num[i])count[i]++;
                }
                System.out.print(" "+count[i]);
            }
        }
    }
}
