package souhu;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
public class T1 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*try (BufferedReader bufferedReader = new BufferedReader(new InSystem.in)) {
        }catch (Exception r){

        }*/
        while(in.hasNext()){
            int n=in.nextInt();
            double []num=new double[n];

            TreeSet<Double> treeSet=new TreeSet<Double>();
            double max=0L;
            for(int i=0;i<num.length;i++){

                treeSet.add(in.nextDouble());

            }
            int x=0;
            for(Iterator<Double> iterator = treeSet.iterator(); iterator.hasNext();x++){
                num[x]=iterator.next();
             //   System.out.println(num[x]);
            }



            for (int i = 0; i < num.length; i++) {
                double a=num[i]+180L;

                //查找 大于a 小于a的两个数 即可
                int q=0;
                int w=num.length-1;
                /*while(q<=w){
                    if(num[(w-q)/2]>a)
                }*/
                for (int j = num.length-1; j >=0 ; j--) {
                  if(num[j]>=a&&num[j-1]<=a) {
                      double len = 0L;
                      if (num[j] - num[i] > 180L) {
                          len = 360L - (num[j] - num[i]);
                      } else {
                          len = num[j] - num[i];
                      }

                      if (len > max) max = len;
                      j=j-1;
                      if (num[j] - num[i] > 180L) {
                          len = 360L - (num[j] - num[i]);
                      } else {
                          len = num[j] - num[i];
                      }
                      if (len > max) max = len;
                      break;
                  }else {
                      continue;
                  }
                }
            }
            DecimalFormat df   =new   java.text.DecimalFormat("#.00000000");
            System.out.println(df.format(max));


        }
    }
}
