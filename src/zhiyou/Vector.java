package zhiyou;
/**
 * Linklist中的方法
 * addFist
 * addLast//相机和中添加元素集合中的元素。
 *
 * offerfirst
 * offerlast//向集合中添加元素l.add("java01");如果集合中没有元素就会有一个异常抛出
 *
 * getFirst
 * getLast//获取一个元素
 *
 *  peekfirst//获取集合中的第一个元素。如果集合中没有元素返回值null
 *  peeklast
 *
 *  removfirst//移除第一个元素，并能把元素取出，如果集合为空，抛出一个异常。
 *  removelast
 *
 *  pollfirst//
 *  polllast//移除最后一个元素，如果集合为空，抛出一个异常。
 */
import java.util.Enumeration;
import java.util.LinkedList;

/**
 * Created by zhiyou on 15-1-18.
 */
 class Vector {
    public static void main(String[] args){

        LinkedList l = new LinkedList();
        l.addFirst("java01");//在第一个位置添加
        l.addFirst("java02");
        l.addLast("java03");//最后一个位置添加
        l.addFirst("java04");
        sop(l.getFirst());//获取第一个元素
        sop(l.removeAll(l));
        sop(l.peekFirst());
//        sop("first="+l.getFirst());
//        sop(l);
//        sop("remove"+l.removeFirst());//移除第一个元素并且可以取出
//        sop(l);
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
