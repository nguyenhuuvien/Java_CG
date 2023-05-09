package modul1;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhap a :");
        int a = Input.nextInt();
        System.out.println("Nhap b :");
        int b = Input.nextInt();
        int x ;
        if (a != 0) {
            x = -b/2*a ;
            System.out.println("x= " +x);
        } else if ( b != 0 ) {
            System.out.println("Phuong trinh vo so nghiem ");
        }else {
            System.out.println("phuong trinh dung voi moi nghiem");
        }
    }
}
