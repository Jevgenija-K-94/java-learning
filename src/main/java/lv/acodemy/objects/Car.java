package lv.acodemy.objects;

public class Car {
    // fields
    private String color;
    private String model;

    public Car(String model, String color) {
        this.color = model;
        this.model = color;
    }

    public Car() {
    }

    public void start() {
        System.out.println("Car started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //getter
    //setter те методы которые меняют значения в переменных


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
