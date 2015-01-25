package SetcompareTow;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zhiyou on 15-1-23.
 *
 * 当TreeSet自身的比较方法不能满足需求时。
 * 定义一个比较器，让比较器的对象作为参数传给Tree=Set的构造函数
 *
 * 当num返回值为1时此对象（是指函数compareTo串进来的参数）大于指定对象（是用add()方法指添加的对象）
 *
 * 如何第一一个比较器
 *   定义一个类实现（implement）Comparetor方法，复写compare方法  注意区别Compareable接口中是CompareTo方法
 */
class Student implements Comparable//自定义的类要实现Compareble接口
{
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Object obj){// 1 升序排列 2 反过来降序,元素自身带有比较方法，该方法比较的是两个对象是否相等
        // return -1;//逆序取出
        //return 1;//顺序取出即怎么存进去的怎么取出
      //  return 0;//只取第一个元素
           if(!(obj instanceof Student))
             throw new RuntimeException("这个不是学生对象");//如果传的不是学生类就抛出异常
           Student s = (Student)obj;//强制向下转换

        //   System.out.println(this.name+"----compare----"+s.name);

           if(this.age>s.age)//this.age是此对向是,s.age是指定对象
               return 1;
           if(this.age==s.age)
               return this.name.compareTo(s.name);
           return -1;

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


class Mycompare implements Comparator{//自己构造一个比较器
    public int compare(Object obj1,Object obj2){//两个对象的数据成员是否相等
        Student st1 = (Student)obj1;
        Student st2 = (Student)obj2;
        int num= st1.getName().compareTo(st2.getName());

       if(num==0){
           return new Integer(st1.getAge()).compareTo(new Integer(st2.getAge()));
//            num=st1.getAge()-st2.getAge();
//            return num;
        }
       return num;
    }
}

public class SetcompareTow {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        TreeSet tr = new TreeSet(new Mycompare());//new一个比较器的对象传给TreeSet的构造函数
        tr.add(new Student("java01",11));
        tr.add(new Student("java05",111));
        tr.add(new Student("java02",22));
        tr.add(new Student("java05",22));
        tr.add(new Student("java05",4));
        for(Iterator it = tr.iterator();it.hasNext();){
            Student stu = (Student)it.next();
            sop(stu.getName()+"==="+stu.getAge());
        }
    }
}
