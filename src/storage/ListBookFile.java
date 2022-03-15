package storage;

import model.ListBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListBookFile {
    public static void writeFile(List<ListBook> listBookList){
        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("List1.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file và khởi tạo file mới");
            writeFile(listBookList);
            return;
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listBookList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra và không ghi được file");
    }
    }
    public static List<ListBook> readFile(){
        File file = new File("List1.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<ListBook> listBookList = (List<ListBook>) result;
            ois.close();
            fis.close();
            return listBookList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
