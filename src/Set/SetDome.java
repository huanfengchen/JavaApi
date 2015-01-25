package Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhiyou on 15-1-19.
 * 子类
 * 1 HarshSet;底层数据结构是哈西表
 * set集合的功能和collection一样
 */

class Person implements Comparable{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){//一定要复写object中的hashcode方法
      System.out.println(this.name+"++++++");
        return name.hashCode()+age;//如果地址值不同就不用调用equals;字符串中自带eqauls方法
    }
    public boolean equals(Object obj){//一定要是Object类中的obj
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;
        return this.name.equals(p.name)&&this.age==p.age;
    }
    public int compareTo(Object obj){
        if(!(obj  instanceof Person))
           throw new RuntimeException("这不是人类");

            Person p = (Person)obj;
            if(this.age > p.age)
                return 1;
            if(this.age==p.age)
            {
                int num = this.name.compareTo(p.name);
                return num;
            }
        return -1;
    }
    /*
    public boolean equals(Object obj){//删除元素
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;//如果传进来的是person类，向下转型
        System.out.println(this.name+"______-"+p.name);
        return this.name.equals(p.name)&&this.age==p.age;
    }
    */
    public String getname(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class SetDome {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
      HashSet ha = new HashSet();
        ha.add(new Person("lisi01",11));
        ha.add(new Person("lisi02",12));
        ha.add(new Person("lisi03",13));
        ha.add(new Person("lisi02",12));
        for(Iterator it = ha.iterator();it.hasNext();){
//            Object obj = it.next();
//           Person p = (Person)obj;
            Person p = (Person)it.next();
            sop(p.getAge()+"+++++"+p.getname());
        }

    }
}

