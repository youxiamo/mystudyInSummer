package baofeng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class T2 {
    public static void main(String[] args) {
        /*
一定玩过消除类的游戏吧，请完成一个消除判断算法，使用已有的字母去插入字母字符串中（注意：使用过的字母不能拿回）。当三个或多个字母连续时，进行消除操作，返回你最少使用的字母数量，若无法完全消除，返回-1.
例子如下：
输入："CDDBBC", "DB"
返回：-1
其中一种方案如：CDDBBC -> CDD[D]BBC -> CBBC -> CBB[B]C -> CC
输入："CCDDBBCC", "CDBDC"
返回：2
步骤解释：CCDDBBCC -> CCDD[D]BBCC -> CCBBCC -> CCBB[B]CC -> CCCC -> empty


输入："D", "ABDD"
返回：2
步骤解释：D -> D[D] ->DD->DD[D]->DDD->empty*/

        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            String x=in.nextLine();
            pan(s,x);
        }
    }
    static  void pan(String s,String x){
        char []a=s.toCharArray();
        char []b=x.toCharArray();
        char y=a[0];
        int count=0;
        StringBuffer stringBuffer=new StringBuffer(s);
        for(int i=1;i<a.length;i++){
            if(a[i]==y){
                count++;
                if(count==2){
                    for(int j=0;j<b.length;j++){
                        if(b[j]==y){stringBuffer.replace(i-2,i+1,"111");b[j]='1';}
                    }

                }
            }else {
                count=0;
                y=a[i];
            }
        }

        for(int i=0;i<stringBuffer.length();i++){
            if(stringBuffer.charAt(i)!='1') System.out.println(stringBuffer.charAt(i));
        }
    }
}
