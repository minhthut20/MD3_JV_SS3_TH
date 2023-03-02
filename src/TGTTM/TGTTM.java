package TGTTM;

import java.util.Scanner;

public class TGTTM {
    public static void main(String[] args) {
        String[] students = {"Thu","Chuan","Yen","Vuong","Van","Duong","Sơn93","Đạt","Hồng","Sơn90","Hà","Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học dinh muốn kiểm tra : ");
        String name = scanner.nextLine();
        boolean checkName = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Tên " + name + " ở vị trí số " + i + " trong danh sách ");
                checkName = true;
                break;
            }
        }
        if (!checkName){
            System.out.println( name + " không có trong danh sách ");
        }
    }
}
