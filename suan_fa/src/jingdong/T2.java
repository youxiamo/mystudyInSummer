package jingdong;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
public class T2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /* 东东对这个性质充满了好奇,东东现在给出一个整数n,希望你能帮助他求出满足 a^b = c^d(1 ≤ a,b,c,d ≤ n)的式子有多少个。*/
        while(in.hasNext()){
            /*(((())))*/
            int n=in.nextInt();
            int count=0;
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n ; j++) {
                    for (int k = 1; k <=n ; k++) {
                        for (int l = 1; l <=n ; l++) {
                            if(Math.pow(i,j)== Math.pow(k,l))count++;
                        }
                    }
                }
            }

            System.out.println(count);

        }
    }
}
