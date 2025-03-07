package com.jstudy.한상희;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        User user = new User();

        while (true) {
            System.out.println("1. 게임시작");
            System.out.println("2. 점프");
            System.out.println("3. 적 발견");
            System.out.println("4. 전진");
            System.out.println("5. 버섯 먹기");
            System.out.println("9. 게임 종료");
            Scanner sc = new Scanner(System.in);
            int chose = sc.nextInt();

            switch (chose) {
                case 1:
                    user.gameStart();
                    break;
                case 2:
                    user.jump();
                    break;
                case 3:
                    if (user.findEnemy()) {
                        chose = 9;
                        System.out.println("게임을 종료합니다.");
                    };
                    break;
                case 4:
                    user.go();
                    break;
                case 5:
                    user.earMushroom();
                    break;
                case 9:
                    System.out.println("게임을 종료합니다.");
            }

            if (chose == 9) {
                break;
            }
        }
    }
}
