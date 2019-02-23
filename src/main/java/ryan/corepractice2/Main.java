package ryan.corepractice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo-beans2.xml");

        ColletionList colletionList = (ColletionList) applicationContext.getBean("collectionListBean");
        System.out.println(colletionList.getBooks().get(2).toString());

    }

}
