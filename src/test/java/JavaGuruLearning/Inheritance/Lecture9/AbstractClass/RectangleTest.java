package JavaGuruLearning.Inheritance.Lecture9.AbstractClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle("Black", 4, 2);

    @Test
    void area() {
        double actual = rectangle.area();
        double expected = 8;
        assertEquals(expected, actual);
    }
}