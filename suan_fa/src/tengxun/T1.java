package tengxun;
import java.util.Scanner;
public class T1{

    static int count=Integer.MAX_VALUE;
    static void pan(int a,int b,int A,int B,int step){
        // BFS 进行即可

        if(a==A && b==B){
            if(step<count)count=step;
            return;
        }
        if(a>A||b>B)return;

        for(int i=0;i<2;i++)
            if(i==0)pan(a+1,b+1,A,B,step+1);
            else pan(a*2,b*2,A,B,step+1);

    }

    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            int A=in.nextInt();
            int B=in.nextInt();
            pan(a,b,A,B,0);

            System.out.println(count);

        }


    }
}
