package pinDuoDuo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class T3 {
static void pan(int tang[],int yao[]){

    tang=insertSort(tang);
    yao=insertSort(yao);
    // 先从小到大排序
  //  for(int i=0;i<tang.length;i++)System.out.println(tang[i]);
  //  for(int i=0;i<yao.length;i++)System.out.println(yao[i]);





    int ccc=0;
    for(int i=0,j=0;i<yao.length;i++){
        while(tang[j]<yao[i])j++;
        while (yao[i]<tang[j]){i++;}

        ccc++;
     //   System.out.println(i+"---"+j);


    }
    System.out.println(ccc);


}

    public static int [] insertSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) { //将a[i]插入a[0:i-1]
            int t = a[i];
            int j;
            for (j = i - 1; j >= 0 && t < a[j]; j--) {

                a[j + 1] = a[j];
            }
            a[j + 1] = t;
        }
        return a;
    }
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        /*
3
2 2 3
2
3 1
*/
        while (in.hasNext()) {
            int a = Integer.parseInt(in.nextLine());
            int[] tang = new int[a];
            String s = in.nextLine();
            String[] num = s.split(" ");
            for (int i = 0; i < a; i++) {
                tang[i] = Integer.parseInt(num[i]);
            }
            a = Integer.parseInt(in.nextLine());
            int[] yao = new int[a];
            String s1 = in.nextLine();
            String[] num1 = s1.split(" ");
            for (int i = 0; i < a; i++) {
                yao[i] = Integer.parseInt(num1[i]);
            }


            pan(tang, yao);
        }
    }
}
