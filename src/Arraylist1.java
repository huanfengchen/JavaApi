import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhiyou on 15-1-18.
 * ArrayList和Linklist依赖的都是equals方法
 */

class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){//删除元素
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;//如果传进来的是person类，向下转型
        System.out.println(this.name+"______-"+p.name);
        return this.name.equals(p.name)&&this.age==p.age;


    }
    public String getname(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

 class Arraylist1 {
    public static void sop(Object obj){
        System.out.println(obj);
    }//打印容器中的元素
    public static void main(String[] arge){
        ArrayList al = new ArrayList();
        al.add(new Person("lisan01",20));
        al.add(new Person("lisan01",20));
        al.add(new Person("lisan03",30));
        al.add(new Person("lisan04",40));
        al.add(new Person("lisan05",50));
        al.add(new Person("lisan06",60));
        al.add(new Person("lisan07",70));

       sop(al.remove(new Person("lisan05",50)));//删除指定元素内容的元素

        al.remove(3);//删除下标为3集合中的元素
        System.out.println("al.get(3);"+al.get(3));//获得的只是下标为三的对象的地址

        al=singleElement(al);
        for(Iterator it = al.iterator();it.hasNext();){//定义一个迭代器并且遍历迭代器的元素
//            Object obj =it.next();
//            Person p =(Person)obj;//向下转型
            Person p = (Person)it.next();
            sop(p.getAge()+"+++"+p.getname());//通过迭代器获取元素中的值

        }
    }
     public static ArrayList singleElement(ArrayList al){//去除重复元素
         ArrayList newAl = new ArrayList();
         for(Iterator it = al.iterator();it.hasNext();){
             Object obj = it.next();
             if(!newAl.contains(obj))//判断元素是否相同用contains方法
                 newAl.add(obj);
         }
         return newAl;
     }
}
