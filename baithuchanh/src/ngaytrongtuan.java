import java.util.Scanner;

public class ngaytrongtuan {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên đại diện cho ngày trong tuần
        System.out.print("Nhập vào một số từ 1 đến 7 (1: Chủ nhật, 2: Thứ 2, ..., 7: Thứ 7): ");
        int soNgay = scanner.nextInt();

        // Kiểm tra xem số ngày có nằm trong khoảng hợp lệ hay không
        if (soNgay < 1 || soNgay > 7) {
            System.out.println("Vui lòng nhập số từ 1 đến 7.");
        } else {
            // Gọi phương thức để hiển thị ngày tương ứng
            hienThiNgayTrongTuan(soNgay);
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }

    // Phương thức hiển thị ngày trong tuần tương ứng với số ngày nhập vào
    private static void hienThiNgayTrongTuan(int soNgay) {
        switch (soNgay) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
        }
    }
}
