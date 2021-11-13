package lesson2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn Array có độ dài bao nhiêu?: ");
        int lengthOfArr = scanner.nextInt();

        int[] myArray = new int[lengthOfArr];
        for (int index = 0; index < lengthOfArr; index++) {
            System.out.print("Nhập số ở ô thứ " + index + " vô đi bạn: ");
            myArray[index] = scanner.nextInt();
        }
        double sum = 0;
        for (int index = 0; index < lengthOfArr; index++) {
            sum += myArray[index];
        }
        double average = sum / lengthOfArr;

        System.out.println("Giá trị trung bình của Array là : " + average);

    }
}

