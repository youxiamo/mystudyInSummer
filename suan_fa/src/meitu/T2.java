package meitu;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
public class T2 {

    static int [] change(int num[],int n){
        //ArrayList<Integer> arrayList=new ArrayList<Integer>(num.length);
        int []x=new int[num.length];
        for (int i = n,j=0; j <x.length ; i++,j++) {
            i=i%num.length;
            x[j]=num[i];

        }


        return x;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            int []num=new int[n];
            String []s=in.nextLine().split(",");
            for (int i = 0; i <num.length ; i++) {
                num[i]=Integer.parseInt(s[i]);
            }

            int max=0;
            int xia=0;

            for (int j = 0; j <num.length ; j++) {
                int []x=change(num,j);
                int xi=0;
                //System.out.println("ddd");
                for (int i = 0; i < num.length; i++) {
                    if (x[i] > 0) xi += x[i];
                    else if (xi > 0) {
                        if (max <= xi) max = xi;

                        if (xi + x[i] < 0) {

                            if (xia <= i) xia = i;
                            else break;

                            xi = 0;
                        } else xi += x[i];
                    }

                }
                if (max <= xi) max = xi;

            //    System.out.println(max);
            }

            System.out.println(max);
        }
    }
}
