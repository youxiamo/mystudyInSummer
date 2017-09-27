package qunar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
public class T1 {
    static int minCoin(int a,int b){
    return a>b?b:a;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        while(in.hasNext()){
            /*map.put(1,in.nextInt());
            map.put(5,in.nextInt());
            map.put(10,in.nextInt());
            map.put(50,in.nextInt());
            map.put(100,in.nextInt());
            map.put(500,in.nextInt());*/
            int []coin={1,5,10,50,100,500};

            int []coinNum=new int[6];
            for (int i = 0; i <6 ; i++) {
                coinNum[i]=in.nextInt();
            }
            int money=in.nextInt();
            int n=6;
            int i,j,k;
            int []coinUsed=new int[money+1];
            for (int i1=1;i1<=money;i1++)coinUsed[i1]=Integer.MAX_VALUE-1;

            for(i=0;i<n;i++)
                      for(j=1;j<=coinNum[i];j++)
                           for(k=money;k>=coin[i];k--)
                               coinUsed[k]=minCoin(coinUsed[k],coinUsed[k-coin[i]]+1);


            System.out.println(coinUsed[money]);

//            System.out.println(coinUsed[money-1]);

        }

    }
}
