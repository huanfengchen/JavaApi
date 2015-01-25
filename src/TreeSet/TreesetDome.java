package TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zhiyou on 15-1-23.
 * 数据结构是哈西表，线程是非同步的
 * 保证了元素的唯一性，判断，删除元素先判断哈西值是否相同
 * 如果相同，在判断equals的值是否为真
 *
 * TreeSet 集合类
 *  底层数据结构是二叉树
 *  可以对set集合中元素进行排序
 *  字符串自就有排序的功能包括compareTo（）方法，返回值为int 类型
 *  保证元素唯一性的方法是compareTo
 *
 *  存储的原理是排序二叉数（比根小的放左边比根大的放右边）
 *
 *  默认的存取方式是从小到大取的
 *
 *  排序的第一种方式是，让元素自身具有排序功能，实现compareable接口覆盖compareTo方法
 */
public class TreesetDome {
    public static void main(String[] args){
        TreeSet tr = new TreeSet();
        tr.add(new Student("adf01",12));
        tr.add(new Student("sdf02",23));
        tr.add(new Student("sdf03",23));
        for(Iterator it = tr.iterator();it.hasNext();){
          Student stu = (Student)it.next();

           System.out.println(stu.getName()+stu.getAge());
        }
    }
}

class Student implements Comparable
{
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

       public int compareTo(Object obj){// 1 升序排列 2 反过来降序
          // return -1;//逆序取出
           //return 1;//顺序取出即怎么存进去的怎么取出
           return 0;//只取第一个元素

           /*
           if(!(obj instanceof Student))
             throw new RuntimeException("这个不是学生对象");//如果传的不是学生类就抛出异常
          Student s = (Student)obj;//强制向下转换

           System.out.println(this.name+"----compare----"+s.name);

           if(this.age>s.age)//this.age是次对向是,s.age是指定对象
               return -1;
           if(this.age==s.age)
               return s.name.compareTo(this.name);
           return 1;
           */

       }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
