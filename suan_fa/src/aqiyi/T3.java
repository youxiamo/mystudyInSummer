package aqiyi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10 0010.
 */
public class T3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();


            int count=0;
            // 求 i*j 开方是否为整数即可
            for (int i = 1; i <=a ; i++) {
                for (int j = 1; j <=b ; j++) {


                        int x = (int) Math.sqrt(i * j);
                        if (x * x == i * j) {
                            count++;

                    }
                }
            }
            System.out.println(count);

            count=0;
            // 求1的
            {
                if(a>b){
                    int temp=a;
                    a=b;
                    b=temp;
                }
                for (int i = 1; i <= b; i++) {
                    int x = (int) Math.sqrt(i);
                    if (x * x == i) {
                        count++;

                    }
                }

                for (int i = 2; i <=a ; i++) {
                    for (int j = 1; j <=b ; j++) {
                        if(j%2!=0){
                            if(Math.pow(i,j)<=b){count++;}
                            else break;
                        }
                    }
                }
                System.out.println(count);
            }


        }
    }
}
