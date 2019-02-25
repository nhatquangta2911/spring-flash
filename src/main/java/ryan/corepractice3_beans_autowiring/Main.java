package ryan.corepractice3_beans_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo-beans3.xml");

        AutoWiringReference autoWiringReference = (AutoWiringReference) applicationContext.getBean("autoWiringReferenceBean");
        autoWiringReference.getAutoWiringDemo().setMessage("Hello");

        System.out.println(autoWiringReference.getAutoWiringDemo().getMessage().toString());

    }

}
