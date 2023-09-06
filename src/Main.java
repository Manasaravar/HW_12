
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Задание с переводом в шестнадцатиричную систему");
        System.out.println("Введите десятичное число: ");
        int decimal = kb.nextInt();
        char[] finalHex = new char [32];
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        int k = 0;
        while (decimal > 0) {
            int  hex = decimal % 16;
            finalHex [k] = hexDigits[hex];
            decimal /= 16;
            k++;
        }
        System.out.print("Число в шестнадцатиричной системе: ");

        for (--k; k >= 0 ; k--) {
            System.out.print(finalHex[k]);
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Задание с массивом на повторения");
        int n = 10;

        int[] count = new int[n];
        int[] arr = new int[n];
        Random rand = new Random(0);

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(0,10);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int counter = 0;

            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    counter++;

                }
            }    if (counter > 1 ) {
                System.out.println("Значение: " + arr[i] + " имеет " + counter + " повторений");
            }

        }



    }
}
