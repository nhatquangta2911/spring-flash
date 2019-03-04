package ryan.spring_core_homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("homework-bean.xml");

//        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
//        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");

        AnotherBean anotherBean = (AnotherBean) applicationContext.getBean("anotherBean");
        anotherBean.getBean1().setValue1("Bean 1");
        anotherBean.getBean2().setValue2(2911);
        anotherBean.setValue1("Another Bean 1");
        anotherBean.setValue2("Another Bean 2");

        System.out.println(anotherBean.toString());

    }

}
