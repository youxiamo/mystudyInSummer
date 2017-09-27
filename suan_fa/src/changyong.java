import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
public class changyong {

    // 全排列
    static void listAll(List a,String pre){
        if(a.isEmpty()){
            System.out.println(pre);
        }
        for (int i = 0; i <a.size() ; i++) {
            List temp=new LinkedList(a);
            listAll(temp,pre+temp.remove(i));
        }
    }

    // 全组合
    static void listAllAndOne(List a,String pre){
       // if(a.isEmpty()){
            System.out.println(pre);
     //   }
        for (int i = 0; i <a.size() ; i++) {
            List temp=new LinkedList(a);
 //           System.out.println(temp.remove(i));
            listAllAndOne(temp,pre+temp.remove(i));
        }
    }


    public static void main(String[] args) {
        String []s=new String[]{"a1","b2","c3"};
     //   listAll(Arrays.asList(s),"");
        listAllAndOne(Arrays.asList(s),"");

        Integer k;
        for (int i = 0; i <10 ; i++) k=new Integer(i);

    }

}
