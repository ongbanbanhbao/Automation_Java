package Lab_08;

public class RacingBoy {
    public static void main(String[] args) {
        Dog nasus = new Dog();
        Horse xichTho = new Horse();
        Tiger simba = new Tiger();

        int nasusSpeed = nasus.getSpeed();
        int xichThoSpeed = xichTho.getSpeed();
        int simbaSpeed = simba.getSpeed();

        if (nasus.getSpeed() >= xichTho.getSpeed() && nasus.getSpeed() >= simba.getSpeed()){
            System.out.println("The winner is: Nasus " +  " with speed " + nasus.getSpeed() + " km/h");
        } else  if (xichTho.getSpeed() >= nasus.getSpeed() && xichTho.getSpeed() >= simba.getSpeed()){
            System.out.println("The winner is: Xích Thố" + " with speed " + xichTho.getSpeed() + " km/h");
        } else {
            System.out.println("The winner is: Simba" + " with speed " + simba.getSpeed() + " km/h");
        }
    }
}
