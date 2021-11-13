package lesson2;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        // Given an array from user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bạn muốn Array có độ dài bao nhiêu?: ");
            int lengthOfArr = scanner.nextInt();

            int[] myArray = new int[lengthOfArr];
            for (int index = 0; index < lengthOfArr; index++) {
                System.out.print("Nhập số ở ô thứ " + index + " vô đi bạn: ");
                myArray[index] = scanner.nextInt();
            }
            for (int value : myArray) {
                System.out.print(value + " ");
            }
            // Return the index of the max/min number from the array
            int maximum = myArray[0];
            for (int indexArray = 0; indexArray < myArray.length; indexArray++) {
                if (myArray[indexArray] > maximum) {
                    maximum = myArray[indexArray];
                }
            }
            System.out.println("\nMaximum index is: " + maximum);
//
        }

    }


