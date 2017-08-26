package toutiao;

import java.util.*;

/**
 * Created by Administrator on 2017/8/22 0022.
 */
public class T2 {
    static TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(
            new Comparator<Integer>() {
                public int compare(Integer obj1, Integer obj2) {
                    // 降序排序
                    return obj2.compareTo(obj1);
                }
            }
    );
    static TreeMap<Integer,Integer> mapOut=new TreeMap<Integer,Integer>();
    static void pan(){
        int num=map.size();
        Boolean first=true;
        int yMax=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(first){
                first=false;
                yMax=entry.getValue();
             //   System.out.println(entry.getKey()+"||"+entry.getValue());
                mapOut.put(entry.getKey(),entry.getValue());
            }
            if (entry.getValue()>yMax) {
                yMax=entry.getValue();
              //  System.out.println(entry.getKey() + "||" + entry.getValue());
                mapOut.put(entry.getKey(),entry.getValue());
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapOut.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

      //  Set<Integer>
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int count=in.nextInt();
            for(int i=0;i<count;i++){
                int x=in.nextInt();
                int y=in.nextInt();
                if(map.containsKey(x)){
                    if((int)map.get(x)<y)map.put(x,y);
                }else map.put(x,y);
            }
            pan();
        }
    }
}
