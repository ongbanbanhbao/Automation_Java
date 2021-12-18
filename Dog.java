package Lab_08;

import java.security.SecureRandom;

public class Dog {
    private final int speed;

    public Dog() {
        speed = new SecureRandom().nextInt(60 + 1);
    }

    public int getSpeed() {
        return this.speed;
    }
}
