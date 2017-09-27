package xiecheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
public class T1 {

    /*
    *
    * 第一行为数组大小n
接下来n行为数组元素*/
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            //TreeSet<Integer> treeSet=new TreeSet<Integer>();
            ArrayList<Integer> arrayList=new ArrayList<Integer>();
            for (int i = 0; i <n ; i++) {
                arrayList.add(in.nextInt());
            }
            Collections.sort(arrayList);

            if(arrayList.size()!=1) {
                if (arrayList.get(0) <= 0) {
                    int xia = arrayList.size() - 1;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) <= 0 && arrayList.get(i + 1) > 0) {
                            xia = i;
                            break;
                        }
                    }

                    for (int j = 1; j <= arrayList.get(arrayList.size() - 1); j++) {
                        if (j < arrayList.get(xia + j)) {
                            System.out.println(j);
                            break;
                        } else if (j == arrayList.get(arrayList.size() - 1)) {
                            System.out.println(j + 1);
                            break;
                        }
                    }

                } else {
                    for (int i = 1; i <= arrayList.get(arrayList.size() - 1); i++) {
                        if (i < arrayList.get(i)) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }else if(arrayList.size()==1){
                int x=arrayList.get(0);
                if(x<=0) System.out.println("1");
                else {
                    for (int i = 1; i <=x ; i++) {
                        if(i<x) {System.out.println(i);break;}
                        else if(i==x){
                            System.out.println(i+1);
                        }
                    }
                }
            }else if(arrayList.size()==0){
                System.out.println(0);
            }
        }
    }
}
