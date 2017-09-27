package xiaomi;

        import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public class T3 {

    static HashSet<String> set=new HashSet<String>();
    static void hua(StringBuilder s,int index){

        if(index>=s.length()) {
            //    System.out.println("返回的"+s);
            set.add(showNum(s.toString()));

            return;}

        for (int i = index; i <s.length() ; i++) {

            if(s.charAt(i)<='2'&&s.charAt(i)>='0') {
                StringBuilder x=new StringBuilder(s);
                hua(x.insert(i+1,'_'),index+2);
                StringBuilder x1=new StringBuilder(s);
                if(i+2<s.length()&&s.charAt(i+1)!='_') {
                    hua(x1.insert(i + 2, '_'), index + 3);
                }
            }else if(s.charAt(i)>='3'){
                StringBuilder x=new StringBuilder(s);
                // if(s.charAt(i)!='_')
                hua(x.insert(i+1,'_'),index+2);
            }
        }
    }
    static String showNum(String s){

        String []num=s.split("_");
//
        String xx="";
        for (int i = 0; i <num.length ; i++) {
            // char a=(char)('a'+;  +Integer.parseInt(num[i])-1
            if(!num[i].equals("")) {
                int x=Integer.parseInt(num[i]) - 1;
                if(x<=26) {
                    char a = (char) (97 + x);
                    //System.out.print(a);
                    xx+=a;
                }
            }
        }

        return xx;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();

            hua(new StringBuilder(s),0);
            // 字符串划分问题
            Iterator<String> iterator=set.iterator();
            String ss="";
            while(iterator.hasNext()) {
                ss+=iterator.next()+" ";
            }
            set.clear();
            if(ss.charAt(0)==' ')ss=ss.substring(1,ss.length());
            System.out.println(ss);
        }
    }
}
