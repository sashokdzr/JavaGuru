package JavaGuruLearning.Inheritance.Lecture10.shapes.operations;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation");
        String numberOperationType = scanner.nextLine();
        MathService service = getbytype(numberOperationType);
        service.execute();


    }
    static MathService getbytype(String operationType) {
        if (operationType.equals("double")){
            return  new DoubleNumberMAthService();
        }
        if (operationType.equals("int")) {
            return new IntegerNumberMathService();
        }
        return null;
    }
}
