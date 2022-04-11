package JavaGuruLearning.Inheritance.Lecture9.AbstractClass;

class PolymorphismDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("Green", 3.5);
        Shape rectangle = new Rectangle("Orange", 2.6, 6.9);

        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        for(Shape shape: shapes){
            System.out.println(shape.area());
        }
        double totalarea = 0;
        for (Shape shape: shapes){
            totalarea += shape.area();
        }
        System.out.println("totalarea = " + totalarea);
    }
}
