package lianJia;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/8/19 0019.
 */
public class T2 {

    static void pan(int []num){
        TreeMap<Integer,Boolean> map=new TreeMap<Integer,Boolean>();
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])) map.put(num[i],true);
        }

        System.out.println(map.size());
        Iterator iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();


    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int cont=in.nextInt();
            int []num=new int[cont];
            for (int i=0;i<cont;i++){
                num[i]=in.nextInt();
            }
            pan(num);
        }
    }
}
