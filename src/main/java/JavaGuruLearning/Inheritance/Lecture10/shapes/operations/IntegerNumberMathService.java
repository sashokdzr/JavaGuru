package JavaGuruLearning.Inheritance.Lecture10.shapes.operations;

import java.util.Scanner;

class IntegerNumberMathService implements MathService {



    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }
}
