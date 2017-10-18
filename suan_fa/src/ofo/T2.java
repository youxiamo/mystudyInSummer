package ofo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/15 0015.
 */
public class T2 {

    static void pan(String x,int a,int b){

        // 小数部分即可
        String s="";


        int inde=0;
        boolean flag=false;
        while(true){
            a*=10;
            if(a>b){


                int j=a/b;
                String s1=j+"";
                if(s.indexOf(s1.charAt(0))>=0){
                    inde=s.indexOf(s1.charAt(0));
                    break;
                }
                s+=a/b;
                if(a%b==0){flag=true;break;}
                a=a%b;

            }
            else {s+=0;}
        }

//                System.out.println(x+"---"+s+"xun huan"+inde);
        if(!flag) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.insert(inde, '(');
            stringBuilder.append(')');
            System.out.println(x+stringBuilder);

        }else {
            System.out.println(x+s);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            while (in.hasNext()){
                int a=in.nextInt();
                int b=in.nextInt();
                //一个分母为N的循环小数的循环节位数最多不超过N-1位
                String x="";
                if(a<b){x=x+"0.";pan(x,a,b);}
                else {
                    while(a>b) {
                        x += a / b;
                        a = a % b;
                    }
                  if(a!=0) {
                      x += '.';
                      pan(x,a,b);
                  }
                  else System.out.println(x);
                }
                System.out.println(Integer.MAX_VALUE);
        }
    }
}
