package controller;

import model.ListBook;
import storage.ListBookFile;

import java.time.LocalDate;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Scanner;

public class Method {
    private static List<ListBook> listBookList = ListBookManager.listBookList;
    public static void addNewListBook(){
        ListBook listBook = creatNewListBook();
        ListBookManager.addNewListBook(listBook);
        ListBookFile.writeFile(listBookList);
    }


    public static void showAllListBook(){
        for (ListBook l: listBookList
             ) {
            System.out.println(l);
        }
    }
    public static ListBook creatNewListBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai");
        String phone = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhap nhom dien thoai");
        String group = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Nhap gioi tinh");
        String gender = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Nhap dia chi");
        String address = scanner4.nextLine();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Nhap nam sinh");
        int year = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Nhap thang sinh");
        int month = scanner6.nextInt();

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Nhap ngay sinh");
        int day = scanner7.nextInt();

        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Nhap email");
        String email = scanner8.nextLine();

        ListBook listBook = new ListBook(phone, group, name, gender, address, dateOfBirth, email);
        return listBook;
    }

    public static void editListBookByPhone (String phone){
        if (checkIndexByPhone(phone) != -1){
            int index = checkIndexByPhone(phone);
            Scanner input = new Scanner(System.in);
                System.out.println("Nhap nhom dien thoai moi");
                String newGroup = input.nextLine();
                Method.listBookList.get(index).setGroup(newGroup);
                System.out.println("Nhap ten moi");
                String newName = input.nextLine();
                Method.listBookList.get(index).setName(newName);
                System.out.println("Nhap gioi tinh moi");
                String newGender = input.nextLine();
                Method.listBookList.get(index).setGender(newGender);
                System.out.println("Nhap dia chi moi");
                String newAddress = input.nextLine();
                Method.listBookList.get(index).setAddress(newAddress);
                System.out.println("Nhap email moi");
                String newEmail = input.nextLine();
                Method.listBookList.get(index).setEmail(newEmail);
        }
        ListBookFile.writeFile(listBookList);
    }

    private static int checkIndexByPhone(String phone) {
        int index = -1;
        for (int i = 0; i< listBookList.size(); i++){
            ListBook TechnologyEquipment=null;
            try{
                TechnologyEquipment = listBookList.get(i);
                if (phone.equals(TechnologyEquipment.getPhone())){
                    index = i;
                    break;
                }
            }
            catch (NullPointerException e){

            }

        }
        return index;
    }
    private static boolean checkListBook(String id, List<ListBook> listBookList) {
        boolean check = false;
        for (int i = 0; i < listBookList.size() ; i++) {
            if (id.equals(listBookList.get(i).getPhone())){
                check = true;
                return check;
            }
        }
        return check;
    }

    public static ListBook getByPhone(String phone){
        int index = checkIndexByPhone(phone);
        if (index == -1){
            return null;
        }
        ListBook technologyEquipment = null;
        try{
            technologyEquipment = listBookList.get(index);
        }catch (NullPointerException e){

        }
        return technologyEquipment;
    }

    public static void deleteListBookByPhone(String phone){
        ListBook listBook = getByPhone(phone);
        if (listBook == null){
            System.out.println("Không tìm thấy so dien thoai");
        }
        else {
            ListBookManager.deleteListBook(listBook);
            System.out.println("Xóa thành công so dien thoai:" + phone);
        }
        ListBookFile.writeFile(listBookList);
    }

}
