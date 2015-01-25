package GenericDemoHigh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zhiyou on 15-1-24.
 */
public class GenerricHigh {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("dfgrd");
        a.add("sdrg");
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(4);
        a1.add(5);
        prinly(a);
        prinly(a1);
    }
    public static void prinly(ArrayList<?> al){
        for(Iterator<?> it = al.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
