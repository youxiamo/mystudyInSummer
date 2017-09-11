package baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class T1 {
    int minNumberOfLines(int num, int timX, int timY, int[][] coordinates)
    {
        // WRITE YOUR CODE HERE
        Map<Double,Boolean> map=new HashMap<Double,Boolean>();
        int count=0;
        for (int i = 0; i <num ; i++) {
            double x=(double)(coordinates[i][1]-timY)/(coordinates[i][0]-timY);
            if (!map.containsKey(x)){
                count++;
            }
        }


        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        //    Map<>

        }


    }
}
