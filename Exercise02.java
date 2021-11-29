package lesson4;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        String myPassword = "password123";
        int countInput = 0;
        int MAX_TIMES = 3;

        while (countInput < 3){
            System.out.print("Nhập mk đi bác: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            if (myPassword.equals(userInput)){
                System.out.println("Chào mừng bác đến với Group\n");
                break;
            } else {
                System.out.println("Chúc mừng bạn đã quay vào ô mất lượt!\n");
                countInput++;
            }
        }
        System.out.println("Còn gì nữa đâu mà khóc với sầu :v");
    }
}
