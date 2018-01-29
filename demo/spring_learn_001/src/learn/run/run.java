package learn.run;

import learn.bean.beanObj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 学习，
 * 学习不同方法创建spring的对象，重点在于相关的xml配置文件
 *
 * 1，默认或者设置singleton时，在项目ApplicationContext初始化的时候执行构造
 * 2，构造的方式有1)使用对象本身的构造方法初始化 2)bean一个静态工厂类，执行工厂的构造方法 3)xml配置里配置实例工厂，在xml中设置工厂实例方法
 * 3，注入参数的方式，可以是构造，也可是是用setXXX的属性的方式
 *
 * 学习IOC和DI的区别
 * IOC：控制反转
 * DI:依赖注入
 * 关系依赖注入是不能单独存在的，需要在控制反转的基础之上完成
 */
public class run {
    /*
    入口
     */
    public static void main (String[] args){
        // 使用ApplicationContext，读取xml配置中的bean，创建相关对象的实例
        ApplicationContext springContext = new ClassPathXmlApplicationContext("spring-config.xml");

        /* 不同的构造方式 */
        // 使用构造
        System.out.println("使用构造的bean进行初始化");
        beanObj bean1 = (beanObj) springContext.getBean("defBean");
        bean1.getStatus();
        // 使用静态工厂
        System.out.println("使用静态工厂构造的bean进行初始化");
        beanObj bean2 = (beanObj) springContext.getBean("defBean_factory_static");
        bean2.getStatus();
        // 使用实例工厂
        System.out.println("使用实例工厂构造的bean进行初始化");
        beanObj bean3 = (beanObj) springContext.getBean("defBean_02");
        bean3.getStatus();
        System.out.println(" ---------------------------------------- ");

        /* 不同模式的区别 */
        // 单例模式
        System.out.println("使用单例模式创建的对象");
        beanObj bean_singleton_01 = (beanObj) springContext.getBean("defBean_singleton");
        beanObj bean_singleton_02 = (beanObj) springContext.getBean("defBean_singleton");
        System.out.println(bean_singleton_01);
        System.out.println(bean_singleton_02);
        // 多例模式
        System.out.println("使用多例模式创建的对象");
        beanObj bean_prototype_01 = (beanObj) springContext.getBean("defBean_prototype");
        beanObj bean_prototype_02 = (beanObj) springContext.getBean("defBean_prototype");
        System.out.println(bean_prototype_01);
        System.out.println(bean_prototype_02);
        System.out.println(" ---------------------------------------- ");

        /* 不同的参数注入方式 */
        System.out.println("构造方式注入参数");
        beanObj bean_arg_01 = (beanObj) springContext.getBean("defBeanArg001");
        bean_arg_01.getInfo();
        System.out.println("参数方式注入参数");
        beanObj bean_arg_02 = (beanObj) springContext.getBean("defBeanArg002");
        bean_arg_02.getInfo();
        System.out.println("注入对象类型的属性");
        beanObj bean_arg_03 = (beanObj) springContext.getBean("defBeanArg003");
        bean_arg_03.getStatus();
        bean_arg_03.getSubobj().getStatus();

    }
}
