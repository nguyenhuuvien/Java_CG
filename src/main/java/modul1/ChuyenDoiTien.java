package modul1;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        final int VND = 24000;
        int change=0;
        int money =1 ;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap so tien can doi tu USD->VND :");
            money = input.nextInt();
        }while (money < 0 );
        change = VND * money;
        System.out.println("So Tien Duoc Chuyen Doi la: " + change);
    }
}
