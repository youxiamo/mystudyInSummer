package shunfeng;

        import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
public class T2 {

    static String IntToStr(int n){
        StringBuilder stringBuilder=new StringBuilder();
        if(n==0)return "0";
        while(n>0){
            stringBuilder.insert(0,n%2);
            n=n/2;
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            //求4和7组成的数字;小于N

            Long n=in.nextLong();

            //      System.out.println(n);
            long x=0;
            int count=-1;



            // 4 看成 0 7看成1即可
            boolean flag=false;
            int count1=-1;
            while(x<=n){
                count++;
                count1++;
                String s=IntToStr(count);
                StringBuilder tem=new StringBuilder();

                for (int i = 0; i <s.length() ; i++) {
                    if(s.charAt(i)=='0')tem.append(4);
                    else tem.append(7);
                }
                x=Long.parseLong(tem.toString());
                System.out.println(x);


                long z=0;
                while(z<=n) {
                    s="0"+s;
                    tem=new StringBuilder();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '0') tem.append(4);
                        else tem.append(7);
                    }
                    z=Long.parseLong(tem.toString());
                    if ( z<= n) {
                        count1++;
                        System.out.println("-----" + Integer.parseInt(tem.toString()));
                    }

                }
            }
            System.out.println(count1);


        }
    }



}
