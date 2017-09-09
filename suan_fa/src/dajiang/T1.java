package dajiang;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class T1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int H=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int h=in.nextInt();
            int s=in.nextInt();
            if(H==0) System.out.println(0);
            else {
                if (x <= y) System.out.println(0);
                else {
                    int a = h + (x - y) * s;
                    if (a >= H) System.out.println(H);
                    else System.out.println(a);
                }
            }
        }
    }
}
