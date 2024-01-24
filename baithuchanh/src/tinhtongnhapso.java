import java.util.Scanner;

public class tinhtongnhapso {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        int tong = 0;

        // Sử dụng vòng lặp để nhập và tính tổng các số nguyên
        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để kết thúc): ");
            int so = scanner.nextInt();

            // Kiểm tra nếu số nhập vào là 0, kết thúc vòng lặp
            if (so == 0) {
                break;
            }

            // Cộng số nhập vào vào tổng
            tong += so;

            // Kiểm tra tổng và kết thúc vòng lặp nếu tổng lớn hơn 100
            if (tong > 100) {
                System.out.println("Tổng của các số đã nhập là: " + tong);
                break;
            }
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}
