package didi;

import java.util.*;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class T2 {


        static void pan(int []num){
            // 动归

        }
        public static void main(String []args){
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                String []s=in.nextLine().split(" ");
                int []num=new int[s.length];
                List<Integer> list=new ArrayList<Integer>();
                for(int i=0;i<num.length;i++){
                    num[i]=Integer.parseInt(s[i]);
                    list.add(num[i]);
                }
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o2,o1);
                    }
                });


                System.out.println(list.get(in.nextInt()-1));
            }
        }
}
