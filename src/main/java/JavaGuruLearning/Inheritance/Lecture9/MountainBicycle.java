package JavaGuruLearning.Inheritance.Lecture9;

class MountainBicycle extends Bicycle {


    protected int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    @Override
    void accelerate() {
        speed += 10;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
