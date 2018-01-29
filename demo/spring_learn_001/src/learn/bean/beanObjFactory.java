package learn.bean;

/**
 * Created by Auser on 2018/1/29.
 */
public class beanObjFactory {
  public beanObj getBean(){
      return new beanObj();
  }
    public static beanObj getStaticBean(){
        return new beanObj();
    }
}
