package lv.acodemy;

public class Loops {
    public static void main(String[] args) {
        String[] shoppingList = {"Bread", "Milt", "Eggs", "Fruits", "Burg"};
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current product list is: " + shoppingList[i]);
        }
        System.out.println("Goes next!");

        for (String s : shoppingList) {
            System.out.println("Current product list is: " + s);
        }
        System.out.println("Goes next!");

        int i = 0;

        while (i < shoppingList.length){
            System.out.println("Current product is " + shoppingList[i]);
            i++;
        }

        int j = 0;

        do {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        } while (j < shoppingList.length);
    }
}
