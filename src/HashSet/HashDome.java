package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhiyou on 15-1-23.
 * 对元素进行查找，删除依赖的是元素的hashCode和equals方法，
 */
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        System.out.println(this.name+"=======hashCode");
        return  name.hashCode()+age;//字符串本身就实现了哈西值
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;
        System.out.println(this.name+"+++"+p.name);
        return this.name.equals(p.name)&&this.age==p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class HashDome {
    public static void sop(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        HashSet ha = new HashSet();
        ha.add(new Person("java01", 01));
        ha.add(new Person("java02", 02));
        ha.add(new Person("java03", 03));
        ha.add(new Person("java02", 02));
        System.out.println("a00"+ha.contains(new Person("java02",02)));
        System.out.println("a3"+ha.remove(new Person("java03",03)));


        for(Iterator it = ha.iterator();it.hasNext();){
//            Object obj = it.next();
//            Person p = (Person)obj;
            Person p = (Person)it.next();

            sop(p.getAge()+"------"+p.getName());
        }
    }
}
