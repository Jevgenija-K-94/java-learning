package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        // Принципы объектно-ориентированного программирования
        // Encapsulation - объекты защищены от извне, доступ к данным только через медоты, упрощает контроль над стостоянием объекта
        // Inheritance - один класс может унаследовать свойства от другого класса
        // Polymorphism - один медот может работать по разному для разных объектов
        // Abstraction -

        // create object -> audi
        Car audi = new Car("RS6", "Grey");
        audi.start();
        System.out.println(audi);

        audi.setColor("Grey");
        audi.setModel("RS6");

        System.out.println(audi);

        // create BMW object

        Car bmw = new Car("M5", "Black");
        bmw.start();

        bmw.setColor("Black");
        bmw.setModel("M5");

        System.out.println(bmw);

        // распечатать текс my car model and color is: ??

        System.out.println("My car model and color is: " + bmw.getModel() + " " + bmw.getColor());

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();


    }
}

