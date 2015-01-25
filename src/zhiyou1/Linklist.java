package zhiyou1;

import java.util.LinkedList;

/**
 * Created by zhiyou on 15-1-18.
 */
class Duilei{
    private LinkedList link;//声明链表型的变量
    Duilei(){
        link = new LinkedList();//new一个linklist对象
    }
    public void myadd(Object obj){
        link.addFirst(obj);//向对象中添加元素
    }
    public Object myget(){
       return link.removeFirst();
    }
    public Object my(){
        return link.peekFirst();
    }
    public boolean isNull(){
        return link.isEmpty();//判断集合类中的元素是否为空
    }
}

public class Linklist {
    public static void main(String[] args){
        Duilei d= new Duilei();
        d.myadd("java01");
        d.myadd("java02");
        d.myadd("java03");
        d.myadd("java04");
        System.out.println( d.myget());
        System.out.println(d.isNull());
        System.out.println(d.my());
    }
}
