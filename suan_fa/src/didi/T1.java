package didi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class T1 {

    static void pan(int []num){
        // -23 17 -7 11 -2 1 -34


        int countFu=0;
        int Max=-11111;
        for(int i=0;i<num.length;i++){
            if(num[i]<0)countFu++;
            if(num[i]>Max)Max=num[i];
        }
        if(countFu==num.length){
            System.out.println(Max);
            return;
        }

        int sum=-1111;
        int max=-1111;
        for(int i=0,j=0;j<num.length;i++,j++){
            while( i<num.length&&num[i]<0 ){i++;j++;}
            if(i==num.length)break;
            sum=num[i];
            if(max<sum)max=sum;
            for(j=i+1;j<num.length;j++){

                if((sum+num[j])>0){
                //    if(num[j]<0)System.out.println("加 负数"+sum);
                    if(max<sum)max=sum;
                    sum+=num[j];
                    if(max<sum)max=sum;
                }else{
                    if(max<sum)max=sum;
                //    System.out.println("结束的"+sum);
                    break;
                }
            }
            i=j;

        }
        System.out.println(max);

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String []s=in.nextLine().split(" ");
            int []num=new int[s.length];
            for(int i=0;i<num.length;i++){
                num[i]=Integer.parseInt(s[i]);
            }

            pan(num);
        }
    }
}
