package com.example.myaidlserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;

public class RemoteService extends Service {
    private List<Book> bookList;
    IMyAidlInterface.Stub stub = new IMyAidlInterface.Stub() {
        @Override
        public void addBook(Book book) throws RemoteException {
            book.setName(book.getName()+"---server");
            bookList.add(book);
        }

        @Override
        public List<Book> getBookList() throws RemoteException {
            return bookList;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        if (bookList == null) {
            bookList = new ArrayList<>();
        }

        return stub;
    }
}
