package zhaoyinxinyongka;

        import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class T2 {
    static int[] sortInt(int []num){
        for(int i=0;i<num.length;i++)
            for(int j=num.length-1;j>i;j--){
                if(num[j-1]<num[j]){int t=num[j-1];num[j-1]=num[j];num[j]=t;
                }
            }

        // for(int i=0;i<num.length;i++)System.out.println(num[i]);

        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            int []num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=in.nextInt();
            }
            num=sortInt(num);
            int a=0;
            int b=0;
            for (int i = 0; i <num.length ; i++) {
                if(i%2==0)a+=num[i];
                else b+=num[i];
            }
            /*System.out.println(a+"---"+b);
            System.out.println(a>b);
*/

            int m=a;
            int x=b;
            a=0;
            b=0;
            for (int i = 0; i <num.length; i++) {

                 if(i%2==0 && Math.abs(num.length-1 - i)==1){
                    a+=num[i]+num[i+1];
                    i=i+i;
                }else if(i%2==0)a+=num[i];
                else b+=num[i];
            }
            if(m>a)a=m;
            if(x>b)b=x;
            System.out.println(a>b);

            for (int i = 0; i <num.length ; i++) {
                /*if(i)*/
            }



        }
    }
}
