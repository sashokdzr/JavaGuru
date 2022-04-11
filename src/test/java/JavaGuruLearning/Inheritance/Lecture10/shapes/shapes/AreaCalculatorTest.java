package JavaGuruLearning.Inheritance.Lecture10.shapes.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {
    private AreaCalculator victim = new AreaCalculator();


    @Test
    void totalArea() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 3);
        shapes[1] = new Square("White", 4);
        shapes[2] = new Square("Green", 2.5);

        double totalarea = victim.totalArea(shapes);

        assertEquals(totalarea,50.5, 0.1);
    }

}