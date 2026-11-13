import java.util.Scanner;

public class Bai4_Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 4 (TUẦN 4): Chọn loại sách bằng switch-case ---");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
        
        int chon = Integer.parseInt(scanner.nextLine());

        // Dùng cấu trúc switch-case
        switch (chon) {
            case 1:
                System.out.println("=> Bạn đã chọn: Sách giáo khoa");
                break;
            case 2:
                System.out.println("=> Bạn đã chọn: Sách tham khảo");
                break;
            case 3:
                System.out.println("=> Bạn đã chọn: Sách chuyên ngành");
                break;
            case 4:
                System.out.println("=> Bạn đã chọn: Sách khác");
                break;
            default:
                System.out.println("=> Lựa chọn không hợp lệ!");
                break;
        }

        scanner.close();
    }
}