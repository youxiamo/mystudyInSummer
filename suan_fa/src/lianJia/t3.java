package lianJia;

        import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/19 0019.
 */
public class t3 {
    static void pan(){

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int zu=in.nextInt();
            int []num=new int[zu];
            num[0]=in.nextInt();
            for(int i=1;i<zu;i++){
                num[i]=num[i-1]+in.nextInt();;
            }

            int q=in.nextInt();
            for(int i=0;i<q;i++){
                int a=in.nextInt();
                for(int j=0;j<num.length;j++){
                    if(a<=num[j]) {
                        System.out.println(j+1);
                        break;
                    }
                }

            }

        }
    }
}
