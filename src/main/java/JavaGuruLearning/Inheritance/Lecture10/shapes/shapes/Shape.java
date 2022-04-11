package JavaGuruLearning.Inheritance.Lecture10.shapes.shapes;

abstract class Shape {
    private String color;

    public Shape(String color) {

        this.color = color;
    }
    abstract double calculateArea();
}
