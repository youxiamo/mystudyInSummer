package huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
/*[编程|300分] 整型字符串排序
时间限制：3秒
空间限制：32768K
题目描述
给定字符串内有很多正整数，要求对这些正整数进行排序，然后返回排序后指定位置的正整数，排序要求：按照每个正整数的后三位数字组成的整数进行从小到大排序 1）如果不足三位，则按照实际位数组成的整数进行比较
2）如果相等，则按照输入字符串中的原始顺序排序
说明（以下内容考生无须检查，调用者保证：
1) 字符串以’\0’结尾，仅包含数字、空格
2) 字符串内正整数之间以单个空格分隔，字符串首尾没有空格
3) 正整数格式为十进制，大小：1~1000000，正整数的数字非零开始
输入描述:
第一行为一个整数字符串,里面包含若干个整数，以空格分割。第二行为一个整数,即指定的位置。
输出描述:
输出指定位置的整数
示例1
输入

1223 22 3232 2016
3
输出

1223
*/
public class T1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            String []num=s.split(" ");
            Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

            for (int i = 0; i <num.length ; i++) {
                if(num[i].length()>=3){
                    map.put(Integer.parseInt(num[i].substring(num[i].length()-3,num[i].length())),i);
                }else {
                    map.put(Integer.parseInt(num[i]),i);
                }
            }
            int k=Integer.parseInt(in.nextLine());
            int a=1;
            for (Integer key:map.keySet()
                 ) {
                if(a==k){
                    System.out.println(num[map.get(key)]);
                    break;
                }else a++;
            }


        }

    }
}
