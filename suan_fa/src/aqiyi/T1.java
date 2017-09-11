package aqiyi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10 0010.
 */
/*
* 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,
* 例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.*
 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。

*
 *1010 3 101010 2
 *
 * Equal
*/
public class T1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int k1=in.nextInt();
            int b=in.nextInt();
            int k2=in.nextInt();

            StringBuilder s1=new StringBuilder();
            StringBuilder s2=new StringBuilder();
            for (int i = 0; i <k1 ; i++) {
                s1.append(a);
            }
            for (int i = 0; i <k2 ; i++) {
                s2.append(b);
            }
//如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
            if(s1.length()>s2.length()){
                System.out.println("Greater");
            }else if(s1.length()<s2.length()){
                System.out.println("Less");
            }else {
                int equ=0;
                for (int i = 0; i <s1.length() ; i++) {
                    int x=Integer.parseInt(s1.charAt(i)+"")-Integer.parseInt(s2.charAt(i)+"");
                    if (x==0){
                        continue;
                    }else if(x>0){
                        equ=1;
                        break;
                    }else {
                        equ=-1;
                        break;
                    }
                }
                switch (equ) {
                    case -1:
                        System.out.println("Less");break;
                    case 0:
                        System.out.println("Equal");break;
                    case 1:
                        System.out.println("Greater");break;
                }
            }




        }
    }
}
