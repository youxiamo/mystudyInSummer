package wangyi;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
public class T1 {
    static void pan(int x,int f,int d,int p){
        BigInteger x1=BigInteger.valueOf(x);
        BigInteger f1=BigInteger.valueOf(f);
        BigInteger d1=BigInteger.valueOf(d);
        BigInteger p1=BigInteger.valueOf(p);

        f1=f1.multiply(p1);
        d1=d1.add(f1);
        x1=x1.add(p1);
        d1=d1.divide(x1);
        int  aa=(d+f*p)/(x+p);
        if(d<x){
            System.out.println("0");
        }else System.out.println(d1);

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        /*小易为了向他的父母表现他已经长大独立了,
        他决定搬出去自己居住一段时间。一个人生活增加了许多花费:
        小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
        当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,
        商店每个水果售卖p元。
        小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,
        小易希望你来帮他计算一下他最多能独立生活多少天。*/
        //输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分割
        while(in.hasNext()){
            int x=in.nextInt();
            int f=in.nextInt();
            int d=in.nextInt();
            int p=in.nextInt();
            pan(x,f,d,p);
        }
    }
}
