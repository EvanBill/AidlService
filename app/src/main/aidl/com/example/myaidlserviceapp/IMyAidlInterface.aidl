// IMyAidlInterface.aidl
package com.example.myaidlserviceapp;
import com.example.myaidlserviceapp.Book;//此处显示引用
// Declare any non-default types here with import statements

interface IMyAidlInterface {
   void addBook(in Book book);
   List<Book> getBookList();
}
