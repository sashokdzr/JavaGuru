package JavaGuruLearning.Inheritance.Lecture10.shapes.shapes;

class Square extends Shape{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return  Math.pow(side,2);
    }
}
