package pinDuoDuo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class T1 {

    static void pan(int []num){
        // 找一个最大正数,两个负数最大
        // 三个正数最大
        // 比较一下
        int z1 = num[0],z2=0,z3=0;
        int f1=num[0],f2=0;
        for(int i=0;i<num.length;i++){
            int a=num[i];
            if(a>=0){
            if(a>=z1){
                if(a>=z2){
                    if(a>=z3){
                        z3=a;
                    }else {z2=a;}

                }else{
                    z1=a;
                }
            }
            }else{
                if(a<=f1){
                    if(a<=f2){
                        f2=a;
                    }
                }else {
                    f1=a;
                }
            }

        }
        if(z1*z2*z3>z3*f1*f2)System.out.println(z1*z2*z3);
        else System.out.println(z3*f1*f2);
        System.out.println("--"+z1+"--"+z2+"---"+z3);
        System.out.println("--"+f1+"--"+f2);

    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            int len = Integer.parseInt(in.nextLine());
            int[] num = new int[len];
            for (int i = 0; i < num.length; i++) {
                num[i] = in.nextInt();
            }
            pan(num);
        }
    }
    /*
6
-3
-6
4
3
2
1
     */
}
