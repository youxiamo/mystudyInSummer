package shuzi360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class T3 {

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        try{
        while(in.hasNext()){
            int n=in.nextInt();
            int []a=new int[n];

            int samA=0;
            int samB=0;

            for(int i=0;i<a.length;i++){
                a[i]=in.nextInt();
                samA+=a[i];
            }
            int m=in.nextInt();
            int []b=new int[m];
            for(int i=0;i<b.length;i++){
                b[i]=in.nextInt();
                samB+=b[i];
            }


    //        System.out.println("-"+samA+"___"+samB);
            // 开始为 SamA -SamB
            // 现在为 SamA -SamB + 2*y-2*x

            int sam=samB - samA;
            // 从 两个数组里面找 2y - 2x 最接近 sam;
            if(a.length==0 || b.length==0)System.out.println(sam);

            else {

                int ju = Integer.MAX_VALUE;
                for (int i = 0; i < b.length; i++)
                    for (int j = 0; j < a.length; j++) {
                        if (Math.abs(((b[i] - a[j]) * 2) - sam) < ju) {
                            ju = Math.abs(((b[i] - a[j]) * 2) - sam);
                        }
                    }
                //  System.out.println(ju);
                if(ju!=0) {

                    for (int i = 0; i < b.length; i++)
                        for (int j = 0; j < a.length; j++)
                            for (int i1 = 0; i1 < b.length; i1++)
                                for (int j1 = 0; j1 < a.length; j1++) {
                                    if (i != i1 && j1 != j) {
                                        if (Math.abs(((b[i] + b[i1] - a[j] - a[j1]) * 2) - sam) < ju) {
                                            ju = Math.abs(((b[i] + b[i1] - a[j] - a[j1]) * 2) - sam);
                                        }
                                    } else continue;
                                }
                }
                System.out.println(ju);

            }

        }
        }catch (Exception e){

        }
    }
}
