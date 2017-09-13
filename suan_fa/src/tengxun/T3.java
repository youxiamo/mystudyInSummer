package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class T3 {

    static int k;
    static  double coust;
 /*   static void pan(int i,int pathCust[][],List<Integer> path){

        for (int j = 1; j <pathCust.length; j++) {
            if(path.add(pathCust[i][1]))
        }


    }*/
    static double  getCust(int []num){

        num=sortInt(num);
        double sum=0L;
        for (int i = 0; i <num.length ; i++) {
            if(i==k-1)sum = sum/2;
            sum +=num[i];
        }

        return 0L;
    }
    static int[] sortInt(int []num){
        for(int i=0;i<num.length;i++)
            for(int j=num.length-1;j>i;j--){
                if(num[j-1]<num[j]){int t=num[j-1];num[j-1]=num[j];num[j]=t;
                }
            }

        for(int i=0;i<num.length;i++)System.out.println(num[i]);

        return num;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            k=in.nextInt();
            int [][]path=new int[n][n];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    path[i][j]=in.nextInt();
                }
            }
            int []min=new int[n];
            for (int i = 1; i <n ; i++) {
                min[i]=path[0][i];
            }
            // 只要找1即可
            //暴力呗
           coust=path[0][1]/2L;
            for (int i = 1; i <n; i++) {
                if((path[0][i]+path[i][1])/2L<coust){
                    coust=(path[0][i]+path[i][1])/2L;
                }
            }





        }
    }
}
