package JavaGuruLearning.Inheritance.Lecture10.shapes.shapes;

class AreaCalculator {

     double totalArea(Shape[] shapes) {
         double sum = 0;
         for (Shape shape: shapes){
             sum += shape.calculateArea();
         }
         return sum;

     }

}
