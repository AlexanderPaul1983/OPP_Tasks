package EasyTasks;

public class Circle extends Shape {
    private double radius;
    private String radio;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

}
