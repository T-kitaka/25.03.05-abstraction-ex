package com.jstudy.신지민;

import java.util.ArrayList;

public class Member {

    private int memberId;
    private String name;
    private ArrayList<Book> rentBooks; //회원이 빌린 책 목록

    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
        rentBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getMemberId(){
        return memberId;
    }

    public void addRentBook(Book book){ //책 대여
        rentBooks.add(book);
    }

    public void returnBook(Book book){ //책 반납
        rentBooks.remove(book);
    }

    public ArrayList<Book> getRentBooks() { //대여중인 책 리스트
        return rentBooks;
    }

}
