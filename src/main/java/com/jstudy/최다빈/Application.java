package com.jstudy.최다빈;

import java.util.Scanner;

/*
    1. 시스템 요구사항
    1) 손님은 입금, 출금, 이체, 잔고확인을 할 수 있다.
    2) 입금 시 잔고에서 돈이 들어온다.
    3) 출금 시 잔고에서 돈이 빠져나간다.(잔고보다 출금 잔액이 크거나, 잔고가 0이면 잔고가 부족합니다 출력)
    4) 이체 시 출금과 동일
    5) 잔고확인 시 통장에 얼마가 있는지 알려줌
 */

public class Application {
    public static void main(String[] args) {

        Guest guest = new Guest();

        Scanner scr = new Scanner(System.in);


        while(true){

            System.out.println("--------------------은행시스템------------------------");
            System.out.println("1.입금 : 2. 출금 : 3. 이체 : 4. 잔고확인 : 9. 시스템 종료하기");
            System.out.println("--------------------은행시스템------------------------");
            System.out.print("원하시는 시스템 번호를 입력하세요 : ");

            int choice = scr.nextInt();


            switch(choice) {
                case 1 : guest.in(); break;
                case 2 : guest.out(); break;
                case 3 : guest.give(); break;
                case 4 : guest.bankcheck(); break;
                case 9 :
                    System.out.println("시스템을 종료합니다.");
                    break;
                default :
                    System.out.println("제대로 된 번호를 입력해주세요 : ");
                    break;
            }
            if(choice == 9){
                break;
            }
        }


    }
}
