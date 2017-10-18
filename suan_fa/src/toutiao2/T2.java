package toutiao2;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class T2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int x=in.nextInt();
            int finum[]=new int[n];
            for (int i = 0; i <finum.length ; i++) {
                finum[i]=in.nextInt();
            }
            // 暴力试一下
             //就是一直往前减导致一个为零
            int count=0;
            int i;
            for (i = x-1; i >=0 ; i--) {
                finum[i]--;
                count++;
                if(finum[i]==-1)break;
                if(i==0)i=finum.length;
            }
           /* for (int j = i; j >=0 ;) {
                j--;
                if (j<0)j=finum.length-1;
                finum[j]--;
                count++;
                if(j==i)break;
            }*/
            finum[i]=count-1;
            for (int j = 0; j <finum.length ; j++) {
                System.out.print(finum[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
