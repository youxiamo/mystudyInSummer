package pinDuoDuo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class T2 {

    static void pan(String a,String b){

        int []num=new int[a.length()+b.length()];
        for(int i=0;i<num.length;i++)num[i]=0;

        for(int i=b.length()-1;i>=0;i--){

            for(int x=a.length()-1;x>=0;x--){
                int z=num[i+x+1];
                z +=(b.charAt(i)-'0')*(a.charAt(x)-'0');
              //  System.out.println(z);
                if(z>9) {
                    num[i+x] += z / 10;
                    num[i+x+1]=z%10;
                }else num[i+x+1]=z;


            }
        }

        String res="";
        boolean flag=false;
        for(int i=0;i<num.length;i++){
            if(num[i]>0)flag=true;

            if(flag)res+=num[i];
        }
        System.out.println(res);


    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        // 72106547548473106236 982161082972751393

        //70820244829634538040848656466105986748
        while(in.hasNext()) {
            String s = in.nextLine();
            String[] num = s.split(" ");
            pan(num[0], num[1]);
        }
    }
}
