package xiecheng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            //int n=in.nextInt();
            int []numA=new int[in.nextInt()];
            for (int i = 0; i < numA.length ; i++) {
                numA[i]=in.nextInt();
            }

            int []numB=new int[in.nextInt()];
            for (int i = 0; i < numB.length ; i++) {
                numB[i]=in.nextInt();
            }
            int mid=(numA.length+numB.length)/2;

            int x=0;
            boolean flag=false; //false 表示最前面的是i
            for (int i = 0,j=0; i <numA.length && j<numB.length ; ) {
                if(x==mid){
                    if((numA.length+numB.length)%2==0){
                        // 是偶数要分析一下两位数字
                        int mm=0;

                        if(flag){
                            if(numA[i]<numB[j])mm=numB[j];
                            System.out.println(numB[j-1]+1);
                        }

                    }else {
                        if(flag) System.out.println(numB[j-1]);
                        else System.out.println(numA[i-1]);
                    }
                    System.out.println(i+"---"+j);
                    break;
                }

                if(numA[i]<numB[j]){i++;flag=true;}
                else {j++;flag=false;}

                x++;
            }

        }
    }
}
