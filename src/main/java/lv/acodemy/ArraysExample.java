package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {//определение класса

    public static void main(String[] args) {//тут начинается метод
        //arrays (массивы)

        int[] numbers; // говорит что будет массив с данными int
        String[] names;//будет массив со стрингами

        /*
        int number[];
        String name[];
        // bad practice
        */

        numbers = new int[5];// мы создали массив с пятью элементами(с пятью ячейками )
        names = new String[3];

        int[] numberz = {1, 2, 3, 4, 5};
        //в массив нельзя добавлять еще числа, сколько задали столько и будет, массив не расширяется
        String[] namez = {"John", "Alex", "Bab"};
        // доступ к элементам массивов: (в программировании счет ведем с 0)

        System.out.println(namez[1]);
        namez[2] = "Jerry";
        System.out.println(Arrays.toString(namez));

        //loops - циклы

    }
}
