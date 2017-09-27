package xiaomi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public class T2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        boolean first=true;
        while (in.hasNext()) {

            String s=in.nextLine();
            if(s.equals("-")){
            // 从后往前查
                first=false;
                continue;


            }
            if(first){
                String []s1=s.split(" ");
                map.put(s1[0],Integer.parseInt(s1[1]));
            }else {
                while(!map.containsKey(s)) {
                    int i;
                    for (i = s.length() - 1; i >= 0; i--) {
                        if (s.charAt(i) == '/') break;
                    }
                  //  System.out.println(i);
                    if(i!=0)
                     s=s.substring(0,i);
                    else break;
                }
                if(!map.containsKey(s)){
                    System.out.println(0);}
                    else System.out.println(map.get(s));
            }
        }
    }
}
