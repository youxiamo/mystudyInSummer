package lianJia;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/19 0019.
 */
public class T1 {

    static void pan(){

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int []num=new int[10];
            for(int i=0;i<num.length;i++){
                num[i]=in.nextInt();
            }
            int len=in.nextInt();
            int count=0;
            for(int i=0;i<num.length;i++){
                if(num[i]<=len+30)count++;
            }
            System.out.println(count);
        }
    }

}
