package JavaGuruLearning.Inheritance.Lecture10.shapes.operations;

import java.util.Scanner;

class DoubleNumberMAthService implements MathService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size:");
        int size = scanner.nextInt();
        double[] numbers = new double[size];

        for (int i=0; i< numbers.length; i++){
            System.out.println("Please enter " + (i+1) + " number");
            numbers[i]= scanner.nextDouble();
        }

        double subtractResult = 0;
        for (double number : numbers){
            subtractResult -= number;
        }
        System.out.println("subtract result = " + subtractResult);

    }
}
