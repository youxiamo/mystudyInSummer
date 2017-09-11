package baidu;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class T3 {
/**/
    int maximumRating(int nhorror, int nscifi, int amount, int[][] horrorList,
                      int[][] scifiList)
    {
        // WRITE YOUR CODE HERE
        // 前面星级后面价格
        horrorList=sortInt(horrorList);
        scifiList=sortInt(scifiList);
        double []horrM=new double[nhorror];
        for (int i = 0; i <horrorList.length ; i++) {
            horrM[i]=horrorList[i][0]/(double)horrorList[i][1];
        }
        double []scifM=new double[nscifi];
        for (int i = 0; i <scifiList.length ; i++) {
            scifM[i]=scifiList[i][0]/(double)scifiList[i][1];
        }




        return 0;
    }
    int[][] sortInt(int[][]s){

        for (int i = 0; i <s.length ; i++) {
            for (int j = i; j <s.length ; j++) {
                double x=((double)s[j][0])/s[j][1];
                if(x>((double)s[i][0])/s[i][1]){
                    int temp=s[i][0];
                    s[i][0]=s[j][0];
                    s[j][0]=temp;
                    temp=s[i][1];
                    s[i][1]=s[j][1];
                    s[j][1]=temp;
                }

            }
        }
        return s;



    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        }
    }
}
