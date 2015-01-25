package Stringtest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhiyou on 15-1-24.
 *泛型：用于解决安全问题，是一种安全机制
 *
 * 避免了强制转换的麻烦
 *
 * 通常在使用集合框架中使用泛型
 *
 * 只要遇到<>就定义泛型
 *
 * 使用<>其实就是用来接受类型的
 *
 * 当使用集合时，将集合中元素的数据类型传递到<>中</>
 *
 */
public class GenericDome {
   public static void main(String[] args){
       ArrayList<Integer> ar = new ArrayList<Integer>();
       ar.add(3);
       ar.add(4);

       for(Iterator<Integer> it = ar.iterator();it.hasNext();){
            int s = it.next();// 指定了迭代器的类型后就不用在强制转换的
           System.out.println(s);
       }
   }
}
