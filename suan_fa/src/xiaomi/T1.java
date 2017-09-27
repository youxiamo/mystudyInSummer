package xiaomi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public class T1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            String s=in.nextLine();


            boolean first=false;
            boolean second=true;
            if(s.charAt(0)>='A'&&s.charAt(0)<='Z'){first=true;}
            String x=""+new String(s.charAt(0)+"").toUpperCase();
            for (int i = 1; i <s.length() ; i++) {
                if(first){
                    if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){

                       if(second){ x+=s.charAt(i);second=true;}
                       else {
                           x+="_";
                       }

                    }else {x+= new String(s.charAt(i)+"").toLowerCase();second=false;}
                }else if(s.charAt(i)<='z'&&s.charAt(i)>='a'){
                    x+=new String(s.charAt(i)+"").toUpperCase();
                    first=false;
                }
            }


            // 开头和结尾包含下划线
            x="_"+x+"_";

            // 把点改成下划线
            x=x.replace('.','_');

            System.out.println(x);
        }
    }
}
