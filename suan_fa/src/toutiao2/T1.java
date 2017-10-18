package toutiao2;

import java.util.Scanner;


/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class T1 {

    static int num[][]={{0,1},{0,-1},{-1,0},{1,0}};
    static int Ex;
    static int Ey;
    static int max=Integer.MAX_VALUE;
    static int panSToO(String s[],int i,int j,int a,int b){

        // 判断一下 s到 i,j的最短距离是多少 用深搜即可
        // a,b是表示 s的当前 位置

        //返回的是最短的移动
        return 3;
    }
    static void pan(String s[],int i,int j,int a1,int b1,int count){

        /*for ( i = 0; i <s.length ; i++) {
            if(s[i].indexOf("0")>=0){
               j=s[i].indexOf("0");
            }else continue;
        }
        */
        if(i==Ex&&j==Ey){
            // 保存一下步数
            if(count<max)max=count;

        }
        for (int k = 0; k <2 ; k++) {
            int a=num[k][0];
            int b=num[k][1];
            // 看四周有没有.点
            if(i+a>-1&&i+a<s[i].length()&&j+b>-1&&j+b<s.length) {
                if (s[i + a].charAt(j + b) == '.') {
                    // 判断一下s 到这里i+a,j+b的距离是多少
                    count += panSToO(s, i + a, j + b, a1, b1);
                    // S把0 举到相反的位置i-a,j-b;
                    // S 到0的位置 count+1
                    pan(s, i - a, j - b, i, j, count + 1);
                }
            }
        }




    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){

            String s1[]=in.nextLine().split(" ");
            int n=Integer.parseInt(s1[0]);
            int m=Integer.parseInt(s1[1]);
            String s[]=new String[n];
            //
            int i1=-1;
            int j1=-1;
            int a1=-1;
            int b1=-1;
            for (int i = 0; i <n ; i++) {
                s[i]=in.nextLine();
                if(s[i].indexOf("E")>=0){
                    Ex=i;
                    Ey=s[i].indexOf("E");
                }
                if(s[i].indexOf("0")>=0){
                    i1=i;
                    j1=s[i].indexOf("0");
                }
                if(s[i].indexOf("S")>=0){
                    a1=i;
                    b1=s[i].indexOf("E");
                }
            }

            pan(s,i1,j1,a1,b1,0);
            // 先找到0的位置 然后推0 有四种可能性


            System.out.println(max);


        }
    }
}
