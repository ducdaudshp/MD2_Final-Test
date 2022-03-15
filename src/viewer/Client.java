package viewer;

import controller.Method;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0){
            System.out.println("----CHUONG TRINH QUAN LY DANH BA----");
            System.out.println("Chon chuc nang theo so de tiep tuc");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Tim kiem");
            System.out.println("6. Doc tu file");
            System.out.println("7. Ghi vao file");
            System.out.println("8. Thoat");
            System.out.println("Chon chuc nang");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    Method.showAllListBook();
                    break;
                case 2:
                    Method.addNewListBook();
                    break;
                case 3:
                    inputChoice.nextLine();
                    System.out.println("Nhap so dien thoai muon sua");
                    String inputPhone = inputChoice.nextLine();
                    Method.editListBookByPhone(inputPhone);
                    break;
                case 4:
                    inputChoice.nextLine();
                    System.out.println("Nhap so dien thoai muon xoa");
                    String inputPhoneNumber = inputChoice.nextLine();
                    Method.deleteListBookByPhone(inputPhoneNumber);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("Khong co lua chon, moi chon lai");
            }
        }
    }
}
