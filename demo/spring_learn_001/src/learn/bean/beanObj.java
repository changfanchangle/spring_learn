package learn.bean;

/**
 * Created by Auser on 2018/1/29.
 */
public class beanObj {
    private String name;
    private beanObjSub subobj;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("setName="+name);
        this.name = name;
    }
    public beanObjSub getSubobj() {
        return subobj;
    }
    public void setSubobj(beanObjSub subobj) {
        this.subobj = subobj;
    }

    public beanObj(){
        System.out.println("beanObj，使用构造器初始化");
    }
    public beanObj(String name){
        setName(name);
        System.out.println("beanObj，使用构造器初始化,name="+name);
    }
    public void getStatus(){
        System.out.println("bean_002已经执行");
    }
    public void getInfo(){
        System.out.println("对象名称为"+getName());
    }
}
