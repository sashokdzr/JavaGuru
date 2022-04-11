package JavaGuruLearning.Inheritance.Lecture9;

class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("First", 10);
        MountainBicycle mountainBicycle = new MountainBicycle("Second", 20, 5);
        System.out.println(bicycle);
        bicycle.speed =5;
        bicycle.accelerate();
        System.out.println(bicycle);
        System.out.println(mountainBicycle);
        mountainBicycle.accelerate();
        System.out.println(mountainBicycle);
    }
}
