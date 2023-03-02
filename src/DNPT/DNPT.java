package DNPT;

import java.util.Scanner;

public class DNPT {
    public static void main(String[] args) {
        int size;
        int[]  array;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.print("Nhập dộ dài của mảng : ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("NHập dộ đang vượt quá 20 ");
            }
        }
        while (size>20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào các phần tử " + ( i + 1) + " : " ) ;
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng hiện tại : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length /2; j++) {
            int temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }
        System.out.print("\nDãy số đảo ngược là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
