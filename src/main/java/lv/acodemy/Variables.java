package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        //this is my single comment

        /*
        This is my multiple line
        comment!
         */

        //int - целые числа
        int age = 30;
        int currentYear = 2024;
        int inventoryItemCount = 100;

        System.out.println(currentYear - age);
        System.out.println(inventoryItemCount);

        //double - числа с запятой

        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        //char - символы
        char grade = 'A';
        char myInitial = 'J';
        char currency = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currency);

        //boolean - логический тип true/false
        boolean hasAccess = true;
        boolean isSummer = false;
        System.out.println(hasAccess);
        System.out.println(isSummer);

        //арифметические операции
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        double c = 10.0;
        double d = 3.0;

        System.out.println(c / d);

        /*
        ++	Increment	Increases the value of a variable by 1	++x
        --	Decrement	Decreases the value of a variable by 1  --x
         */
    }
}
