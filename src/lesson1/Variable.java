package lesson1;

import java.util.Random;

public class Variable {
    public static void main(String[] args) {
        String product_Collection = "Intel® Optane™ SSD 9 Series";
        int capacity = 280;
        int sequential_Bandwidth_Read = 2500;
        int sequential_Bandwidth_Write = 2000;
        float random_Read = 550_000F;
        double random_Write = 500_000;
        int power_Active = 14;
        int power_ide = 5;
        double endurance_Rating = 5.11;
        int warranty = 5;
        boolean company_Intel = true;

        System.out.println(product_Collection);
        System.out.printf("Capacity: %d GB\n", capacity);
        System.out.printf("Sequential Bandwidth Read (up to): %d mb/s\n", sequential_Bandwidth_Read);
        System.out.printf("Sequential Bandwidth Write (up to): %d mb/s\n", sequential_Bandwidth_Write);
        System.out.printf("Random Read: %f IOPS\n", random_Read);
        System.out.printf("Random Write: %f IOPS\n", random_Write);
        System.out.printf("Warranty: %d years\n", warranty);
        System.out.printf("Made by Intel: %b \n", company_Intel);


    }


}
