package learn.run;

import learn.bean.bean_001;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 学习，001
 * 使用spring，作为工厂模式创建对象
 */
public class run001 {
    /*
    入口
     */
    public static void main (String[] args){
        // 使用ApplicationContext，读取xml配置中的bean，创建相关对象的实例
        ApplicationContext springContext = new ClassPathXmlApplicationContext("spring-config.xml");
        bean_001 bean = (bean_001) springContext.getBean("defBean001");
        bean.getStatus();
    }
}
