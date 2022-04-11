package JavaGuruLearning.Inheritance.Lecture9.AbstractClass;

abstract class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();
}
