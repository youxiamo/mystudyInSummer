package toutiao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/22 0022.
 */
public class T1 {
    static int max=0;
    static void pan(String s){
        if(s.indexOf(',')<0)return;
        String []numStr=s.split(",");
        int min=100;
        int sum=0;
        for(int i=0;i<numStr.length;i++){
            int a=Integer.parseInt(numStr[i]);
            if(a<min)min=a;
            sum+=a;
        }
        if(max<sum*min)max=sum*min;
        //System.out.println(sum);
    }
    public static void listAll(List candidate, String prefix) {
        //if(candidate.isEmpty()){
        //System.out.println("--"+prefix);
        pan(prefix);
        //}
        for(int i=0;i<candidate.size();i++) {
            List tmp = new LinkedList(candidate);
            listAll(tmp, prefix + tmp.remove(i));//函数中的参数从右边开始解析
        }
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int count=in.nextInt();

            int []numx=new int[count];
            String[] array=new String[count];
            for(int i=0;i<count;i++){
                numx[i]=in.nextInt();
               array[i]=numx[i]+",";
            }
            listAll(Arrays.asList(array), "");

            System.out.println(max);
        }
    }
}
