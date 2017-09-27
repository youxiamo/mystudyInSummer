package xiecheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //int n=in.nextInt();
            int[] numA = new int[in.nextInt()];
            ArrayList<Integer> arrayList=new ArrayList<Integer>();
            for (int i = 0; i < numA.length; i++) {
                numA[i] = in.nextInt();
                arrayList.add(numA[i]);
            }

            int[] numB = new int[in.nextInt()];
            for (int i = 0; i < numB.length; i++) {
                numB[i] = in.nextInt();
                arrayList.add(numB[i]);
            }
            Collections.sort(arrayList);
            if(arrayList.size()%2==0){
                double i=arrayList.get(arrayList.size()/2)+arrayList.get(arrayList.size()/2-1);
                System.out.println(i/2);
            }else {
                System.out.println(arrayList.get(arrayList.size()/2));
            }
        }
    }
}
