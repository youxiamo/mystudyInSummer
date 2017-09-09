package dajiang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class T41 {

    static int []num;
    static void sortInt(){
        for(int i=0;i<num.length;i++)
            for(int j=num.length-1;j>i;j--){
                if(num[j-1]<num[j]){
                    int t=num[j-1];num[j-1]=num[j];num[j]=t;
                }
            }
        return ;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int m=in.nextInt();
            int r=in.nextInt();
            num=new int[n];

            for(int i=0;i<num.length;i++){
                num[i]=in.nextInt();
            }
            //sortInt();
             Arrays.sort(num);

            if(n>0 && n>=m ) {
                int count = 0;
                while (num[num.length-1] - r >= 0) {
                    boolean flag = true;
                    for (int i = 0; i < m; i++)
                        if (num[num.length-1-i] - r >= 0) {
                            num[num.length-1-i] = num[num.length-1-i] - r;
                        } else {
                            flag = false;
                            break;
                        }

                    if (!flag) break;
                    else {
                        count++;
                        Arrays.sort(num);

                    }
                }
                System.out.println(count);
            }else System.out.println(0);

        }
    }
}
