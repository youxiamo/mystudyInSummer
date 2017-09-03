import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/8 0008.
 */
public class T1 {
    static void pan(){

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        }
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
}
