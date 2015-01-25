package Practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zhiyou on 15-1-23.
 */
public class TreeSettest {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        TreeSet<String> tr = new TreeSet<String>(new Stringlist());
        tr.add("asdf");
        tr.add("s");
        tr.add("advcghjf");
        tr.add("asf");
        for(Iterator it = tr.iterator();it.hasNext();){
         System.out.println(it.next());
        }
    }
}
class Stringlist implements Comparator<String>{//泛型在自定义比较器中的应用
    public int compare(String obj1,String obj2){


        int num = new Integer(obj2.length()).compareTo(new Integer(obj1.length()));
        if(num==0)
            return obj2.compareTo(obj1);//比较字符串的自然顺序
        return num;
    }
}
