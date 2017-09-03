package shuzi360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class T1 {

    static void pan(){

    }
    public static void main(String []args){
        /*
        * 小明一共有n根彩色粉笔，m根白色粉笔，
        * 现在可以用a根彩色粉笔和b根白色粉笔组成一盒卖x元，
        * 或者c根白色粉笔组成一盒卖y元，或者d根彩色粉笔组成一盒卖z元，
        * 小明最多可以用这些粉笔卖多少元？不一定要把所有粉笔卖完，
        * 小明只希望利益最大化*/
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int m=in.nextInt();

            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();

            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();
            // 最大钱数

            // 穷举
            int max=0;

            for(int i=0;a*i<n && b*i <m;i++){
                int money=0;
                if(a*i<n && b*i <m){
                    money=i*x;

                    int qianCai=(n-a*i)/d*z;
                    int qianBai=(m-b*i)/c*y;
                    money+=qianBai+qianCai;
                //    System.out.println(money);
                    if(max<money)max=money;
                }


            }

            // 直接彩色 白色
            int mon=(n/d)*z+m/c*y;
            if(n%d<a && m%c<b){
                for(int i=1;n%d<a*i && m%c<b*i;i++)
                mon=mon+x*1;
            }

            if(max<mon)max=mon;





            System.out.println(max);

        }
    }

}
