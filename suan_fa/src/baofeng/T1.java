package baofeng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class T1 {


    static void pan(String s,String x){
        march(s.toCharArray(),x.toCharArray(),0,0);
    }
    static void march(char []a,char [] b,int a1,int b1){

        if(a1==a.length){
            System.out.println("true");return;
        }

        if(b[b1]=='*')march(a,b,++a1,b1);
        else if(b[b1]=='?')march(a,b,++a1,++b1);
        else if(a[a1]==b[b1])march(a,b,++a1,++b1);
        else {
            System.out.println("false"); return;
        }

    }

    public static void main(String[] args) {
        /*
        待匹配的字符串：”string”

匹配的字符串： “s*g”*/
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            String x=in.nextLine();
            pan(s,x);
        }
    }
}
