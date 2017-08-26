package ali;

import java.util.*;


class BoxTem{
    public int length;
    public int width;
    public int height;
    public BoxTem(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public BoxTem(BoxTem boxTem){
        this.length=boxTem.length;
        this.width=boxTem.width;
        this.height=boxTem.height;
    }
    public BoxTem(){
        super();
    }
}

class Model{
    public int length;
    public int width;
    public int height;
    public int price;
    public Model(){
        super();
    }
}

public class T1 {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/

    static List<Model> list=new ArrayList<Model>();
    static BoxTem boxTemplate=new BoxTem();
    private static int process( Model []items,BoxTem boxTem)
    {
        // 如果价格小于2000 即可 不用清关

        boxTem=boxTemplate;
        int boxMin=0;
        List<BoxTem> box=new ArrayList<BoxTem>();
      //  box.add(new BoxTem(boxTemplate));
        for(int i=0;i<list.size();i++){
            Model mm=list.get(i);
            if(mm.width>boxTem.width || mm.length>boxTem.length || mm.height >boxTem.height )
                return -1;
            else {

                boxMin++;
                box.add(new BoxTem(boxTemplate));
                // 切分为三个箱子 与最小的物品进行比对 大于最小物品 放入 list中 然后再切三个箱子
                box=reduce(box,mm,box.size()-1);


                for(int j=i+1;j<list.size();j++){
                    Model xx=list.get(j);
                    for(int x=0;x<box.size();x++){
                        if(xx.length>=box.get(x).length && xx.width>=box.get(x).width && xx.height>=box.get(x).height) {
                            box = reduce(box, xx, x);
                         //   System.out.println(list.get(j).price);
                            list.remove(j);
                           // System.out.print("--"+boxMin);
                            j--;
                            break;

                        }
                    }
                }
            }

        }


        //盒子体积超过大小返回-1
        return boxMin;
    }

    // 箱子拆分
    static List<BoxTem> reduce(List<BoxTem> box,Model mm,int i){
        BoxTem boxTem=box.get(i);
        BoxTem boxTem1=new BoxTem(boxTem.length,boxTem.width,boxTem.height-mm.height);
        BoxTem boxTem2=new BoxTem(boxTem.length,boxTem.width-mm.width,boxTem.height);
        BoxTem boxTem3=new BoxTem(boxTem.length-mm.length,boxTem.width,boxTem.height);


        box.add(boxTem1);
        box.add(boxTem2);
        box.add(boxTem3);
        box=sort(box);
        return box;
    }



    static void canPutin(Model mm,Model xx){
        //对一次装箱过程进行了分解，
        // 每次需要一个商品和一个空箱子，同时会产生三块新的更小的剩余空间。这三块剩余空间又可以看作是新的箱子。和新的合适自己的空间大小的商品去匹配

    }

    // 箱子排序
    static List<BoxTem> sort(List<BoxTem> ll){
        Collections.sort(list,new Comparator() {
            @Override
            public int compare(Object o11, Object o22) {
                Model o1=(Model)o11;
                Model o2=(Model)o22;
                int a=o1.height*o1.length*o1.width;
                int b=o2.height*o2.length*o2.width;

                return Integer.compare(a,b);
            }
        });
        // 按照箱子体积从小到大排序
        return ll;
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            Model []items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
                list.add(item);
            }
            long startTime = System.currentTimeMillis();
            int boxMinNum = Integer.MAX_VALUE;
            Collections.sort(list,new Comparator() {
                @Override
                public int compare(Object o11, Object o22) {
                    Model o1=(Model)o11;
                    Model o2=(Model)o22;
                    int a=o1.height*o1.length*o1.width;
                    int b=o2.height*o2.length*o2.width;

                    return Integer.compare(b,a);
                }
            });
          /*  for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).price);
            }*/
            System.out.println (process(items,boxTemplate));

        }
    }

}
