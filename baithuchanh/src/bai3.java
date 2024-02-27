import java.util.Scanner;
import java.time.LocalDate;
public class bai3 {
    public static void main(String[] args) {
        // Tao đoi tuong Scanner đe nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap vao ten
        System.out.print("Nhap vao ten cua ban: ");
        String ten = scanner.nextLine();

        // Nhap vao nam sinh
        System.out.print("Nhap vao nam sinh cua ban: ");
        int namSinh = scanner.nextInt();

        // Lay nam hien tai
        int namHienTai = LocalDate.now().getYear();

        // Tinh tuoi
        int tuoi = namHienTai - namSinh;

        // Hien thi nhom tuoi tuong ung
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 50) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh.");
        } else {
            System.out.println("Ban " + ten + " đa gia.");
        }

        // Đong đoi tuong Scanner sau khi su dung
        scanner.close();
    }
}