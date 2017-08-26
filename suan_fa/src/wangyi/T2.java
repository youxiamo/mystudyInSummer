package wangyi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
public class T2 {
    static  HashMap<String,Boolean> map=new HashMap<String,Boolean>();

    static void pan(int index,int []numX,int []numY){
        // 扫描一下一圈为一步的 然后再扫描更大的一圈两步的

        int x=numX[index];
        int y=numY[index];
        for(int i=x-1;i<=x+1;i++)
            for(int j=y-1;j<=y+1;i++){
            if(map.containsKey(i+"--"+j)){

            }
            }



    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            String []strX=in.nextLine().split(" ");
            String []strY=in.nextLine().split(" ");
            int []numX=new int[strX.length];
            int []numY=new int[strX.length];

            for(int i=0;i<numX.length;i++){
                numX[i]=Integer.parseInt(strX[i]);
                numY[i]=Integer.parseInt(strY[i]);
                map.put(numX[i]+"--"+numY[i],true);
            }
            for(int i=0;i<numX.length;i++)
            pan(i,numX,numY);
        }
    }
}
