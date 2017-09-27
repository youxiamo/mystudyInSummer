package sougou;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/17 0017.
 */
public class T1 {

    static void pan(int []num){




    }
    static boolean isHui(int num[]){

        int i=0;
        int j=num.length-1;
        while(i<=j){
            if(num[i++]!=num[j--])return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        8
        51 23 52 97 97 76 23 51
        */
        while(in.hasNext()){

            int n=in.nextInt();
            int []num=new int[n];
            int []numX=new int[n];
            for (int i = 0; i <num.length ; i++) {
                num[i]=in.nextInt();
                numX[n-i-1]=num[i];
            }
            //插入数据获取保证为回文数
            //
            // 先找到 每个对应的数的位置
            //求最长的公共子序列 其他的就再加一下 就可以求出它的和了 不管怎么插入;
            int sum=0;
            for (int i = 0; i <num.length ; i++) {
                if(num[i]!=numX[i]){
                    sum+=num[i]*2;
                }else sum+=num[i];
            }
            System.out.println(sum);


        }
    }
}
