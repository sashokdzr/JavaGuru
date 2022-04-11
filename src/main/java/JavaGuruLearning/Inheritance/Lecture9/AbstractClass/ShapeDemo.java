package JavaGuruLearning.Inheritance.Lecture9.AbstractClass;

class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Green", 3.5);
        System.out.println(circle.area());
        Rectangle rectangle = new Rectangle("Orange", 2.6, 6.9);
        System.out.println(rectangle.area());
    }
}
