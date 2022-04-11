package JavaGuruLearning.Inheritance.Lecture10.shapes.shapes;

class Circle extends Shape {
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    private double radius;

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
