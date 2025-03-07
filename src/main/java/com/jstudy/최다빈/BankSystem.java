package com.jstudy.최다빈;

import java.util.Scanner;

public class BankSystem {

    private int bankacount;
    private int bankin;
    private int bankout;
    private int bankgive;
    private String givename;
    Scanner scr = new Scanner(System.in);


    public void in() {
        System.out.print("입금 하고자 하는 금액을 입력하세요 : ");
        this.bankin = scr.nextInt();
        this.bankacount += bankin;
        System.out.println("현재 통장 잔액 : " + bankacount);
    }
    public void out() {
        System.out.print("출금 하고자 하는 금액을 입력하세요 : ");
        bankout = scr.nextInt();
        if(bankout > bankacount || bankacount==0){
            System.out.println("출금하고자 하는 금액이 잔액보다 크거나 잔액이 없습니다. 다시 시도해주십시오.");
        } else {
            this.bankacount -= bankout;
            System.out.println("정상적으로 출금되었습니다. 남은 잔액은 : " + bankacount + " 입니다.");
        }
    }
    public void give() {
        if (bankacount ==0 || bankgive > bankacount ){
            System.out.println("이체하고자 하는 금액이 잔액보다 크거나 잔액이 없습니다. 다시 시도해주십시오. ");
        } else {
            System.out.print("이체하고 하는 사람의 성함을 입력해주세요 : ");
            scr.nextLine();
            givename = scr.nextLine();
            System.out.print("이체하고자하는 금액을 입력해주세요 : ");
            bankgive = scr.nextInt();
            this.bankacount -= bankgive;
            System.out.println( givename + "님에게" + bankgive +" 원이 정상적으로 이체되었습니다.");
            System.out.println("남은 잔액은 " + bankacount + "원입니다. ");
        }
    }
    public void bankcheck() {
        System.out.println("현재 통장의 잔액은 : " + bankacount + "원입니다.");
    }
}
