package xiecheng;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            Map<Character,Boolean> map= new HashMap<Character,Boolean>();

            String out="";
            for (int i = 0; i <s.length() ; i++) {
                if(map.containsKey(s.charAt(i))){

                }else {
                    map.put(s.charAt(i),true);
                    out+=s.charAt(i);
                }
            }
            System.out.println(out);



        }
    }
}
