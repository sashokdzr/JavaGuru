package JavaGuruLearning.Inheritance.Lecture9.AbstractClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle("Red", 1);

    @Test
    void area() {
        double actual = circle.area();
        double expected = 3.142;
        assertEquals(expected, actual, 0.001);
    }

}