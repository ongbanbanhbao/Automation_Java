package Lab_08;

import java.security.SecureRandom;

public class Tiger {
    private final int speed;

    public Tiger() {
        speed = new SecureRandom().nextInt(100 + 1);
    }

    public int getSpeed() {
        return this.speed;
    }
}
