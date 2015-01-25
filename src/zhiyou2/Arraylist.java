package zhiyou2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhiyou on 15-1-18.
 */
public class Arraylist {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        al.add("java05");
        al.add("java01");
        al.add("java02");
        sop(al);
        al=singleElement(al);
        sop(al);

    }
    public static ArrayList singleElement(ArrayList al){//删除相同元素，该函数的类型为ArrayList类类型的，
            ArrayList newAl = new ArrayList();
            for(Iterator it = al.iterator();it.hasNext();){
                Object obj = it.next();
                if(!newAl.contains(obj))
                    newAl.add(obj);
            }
        return newAl;
    }
}
