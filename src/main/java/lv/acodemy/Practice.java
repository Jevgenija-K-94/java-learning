package lv.acodemy;

public class Practice {
    public static void main(String[] args) {
        // write a for loop that prints nums from 1 to 10 on separate lines
        //int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //using a for loop print all even numbers from 2 to 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }
    }
}

