package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("------------ I18n ");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("------------ Primary ");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("------------ Property ");
        PropertyInjectedController propertyController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyController.getGreeting());

		System.out.println("------------ Setter ");
		SetterInjectedController setterInjectedController = (SetterInjectedController)  ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------ Constructor ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

    }

}
