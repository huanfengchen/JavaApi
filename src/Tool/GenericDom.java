package Tool;

/**
 * Created by zhiyou on 15-1-24.
 */
/*
class Worker{

}

class Teacher{

}

//泛型之前

class Tool{
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

//泛型
class Until<QQ>{
    private QQ q;

    public QQ getQ() {
        return q;
    }

    public void setQ(QQ q) {
        this.q = q;
    }
}

class Dome<T>{
    public void shou(T t){
        System.out.println("show"+t);
    }
    public void look(T t){
        System.out.println("look"+t);
    }
}



    class Dome1{
    public <T> void show(T t)
    {
        System.out.println("show"+t);
    }
    public <Q> void look(Q q){
        System.out.println("look"+q);
    }
    public static <W> void method(W w){
        System.out.println("method"+w);
    }

}
*/

  interface inter<T>{
      void show(T t);
        }
class Interly<T> implements inter<T>{
    public void show(T t){
        System.out.println("show"+t);
    }
}
public class GenericDom {

    public static void main(String[] args){
        Interly<Integer> i = new Interly<Integer>();
        i.show(3444);
        /*
        Dome1 d= new Dome1();
        d.look("sefr");
        d.look(new Integer(4));
        Dome1.method("sef");
        /*
        Dome<String> d = new Dome<String>();//只要对象类型一建立，泛型里面的T类型就固定
        d.look("nihao");
        d.shou("haha");
        /*
        Until<Worker> u = new Until<Worker>();
        u.setQ(new Worker());
        Worker w = (Worker)u.getQ();//也可以不强制转换
        System.out.println("=====");

        /*
        Tool t= new Tool();
        t.setObj(new Worker());
        Worker w = (Worker)t.getObj();
        */
    }
}
