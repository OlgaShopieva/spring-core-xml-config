package springCoreApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"
        );
        Market market = context.getBean("marketBean", Market.class);
        market.busketStatus();

        System.out.println(market.getAddress());
        System.out.println(market.getName());

        context.close();

    }

}
