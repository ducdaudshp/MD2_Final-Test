package controller;

import model.ListBook;
import storage.ListBookFile;

import java.util.List;

public class ListBookManager {
    public static List<ListBook> listBookList = ListBookFile.readFile();

    public static void addNewListBook(ListBook newListBook) {
        listBookList.add(newListBook);
    }

    public static void deleteListBook(ListBook listBook) {
        listBookList.remove(listBook);
    }
}
