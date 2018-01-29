package learn.run;

import learn.bean.bean_002;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 学习，002
 */
public class run002 {
    /*
    入口
     */
    public static void main (String[] args){
        // 使用ApplicationContext，读取xml配置中的bean，创建相关对象的实例
        ApplicationContext springContext = new ClassPathXmlApplicationContext("spring-config.xml");
        bean_002 bean = (bean_002) springContext.getBean("defBean002");
        bean.getStatus();
    }
}
