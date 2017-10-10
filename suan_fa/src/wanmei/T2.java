package wanmei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/27 0027.
 */
class Dat{
    int num;
    int sorc;
    double used;

    public Dat(int num, int sorc, double used) {
        this.num = num;
        this.sorc = sorc;
        this.used = used;
    }
}
public class T2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){

            int n=in.nextInt();
            int []quNum=new int[n];
            int []quSorc=new int[n];
            for (int i = 0; i <n ; i++) {
                quSorc[i]=in.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                quNum[i]=in.nextInt();
            }

            int time=in.nextInt();

            ArrayList<Dat> arrayList=new ArrayList<Dat>();
            for (int i = 0; i <n ; i++) {
                Dat dat=new Dat(quNum[i],quSorc[i],(double)quSorc[i]/quNum[i]);
                arrayList.add(dat);
            }
            Collections.sort(arrayList, new Comparator<Dat>() {
                @Override
                public int compare(Dat o1, Dat o2) {
                   if(o1.used>o2.used)return -1;
                   else if(o1.used<o2.used)return 1;

                   else if(o1.num > o2.num)return -1;
                   return 0;
                }
            });
            int count=0;
            for (int i = 0; i <n && time>0; i++) {
            //    System.out.println(arrayList.get(i).used);
                Dat dat=arrayList.get(i);
                if(dat.num<=time){
                    count+=dat.sorc;
                    time-=dat.num;
                }


            }
            System.out.println(count);





        }
    }
}
