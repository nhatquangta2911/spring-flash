package ryan.corepractice2_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo-beans2.xml");

        ColletionList colletionList = (ColletionList) applicationContext.getBean("collectionListBean");
        System.out.println(colletionList.getBooks().get(1).toString());

        CollectionSet collectionSet = (CollectionSet) applicationContext.getBean("collectionSetBean");
        System.out.println(collectionSet.getBooks().toString());

        CollectionMap collectionMap = (CollectionMap) applicationContext.getBean("collectionMapBean");
        System.out.println(collectionMap.getBooks().toString());

    }

}
