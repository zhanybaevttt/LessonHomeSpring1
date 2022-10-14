package org.example;

import org.example.impl.Cat;
import org.example.impl.Horse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("Person",Person.class);
        Person person1 = context.getBean("Person1",Person.class);

        Cat cat = context.getBean("Cat",Cat.class);
        Horse horse=context.getBean("Horse",Horse.class);
        System.out.println(cat);
        cat.animalMinus();
        cat.animalPlus();
        System.out.println(person.getAnimal()+"\n" + person1.getAge() + "\n" + person1.getName());
        System.out.println(horse);
        horse.animalMinus();
        horse.animalPlus();
        System.out.println(person.getAnimal()+ "\n" + person.getAge()+"\n" + person.getAge());


    }
}
