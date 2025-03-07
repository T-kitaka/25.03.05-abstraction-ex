package com.jstudy.한상희;

import java.util.Scanner;

public class Mario {
    private boolean gameStart;
    private boolean sizeUp;
    private int block; // 이때까지 간 블럭 갯수
    private boolean findEnemy;
    private int killedEnemy;
    private int HP = 100; // 기본 HP 100

    // 0. 게임이 시작되어 있으면
    public void isGameStart() {
        if (gameStart) {
            System.out.println("============게임이 이미 실행중 입니다!============");
        } else {
            gameStart = true;
        }
    }

    // 1. 마리오는 앞으로 갈 수 있음
    public void go() {
        if (gameStart) {
            this.block++; //
            System.out.println("앞으로 갔습니다. 이때까지 간 블럭 수 " + this.block);
        } else {
            System.out.println("============게임이 꺼져있습니다! 실행후 게임을 다시 시도 해주세요!!============");
        }
    }

    // 2. 마리오는 점프를 할 수 있음
    public void jump() {
        if (gameStart) {
            // 적이 있으면
            if (findEnemy) {
                killedEnemy++;
                System.out.println("적을 처치했습니다! 이때까지 처지한 적 " + this.killedEnemy);
                findEnemy = false;
            } else {
                System.out.println("점프를 했습니다!");
            }
        } else {
            System.out.println("============게임이 꺼져있습니다! 실행후 게임을 다시 시도 해주세요!!============");
        }
    }

    // 3. 마리오는 버섯을 먹을 수 있음
    public void eatMushroom() {
        // 3.1 버섯을 먹으면 size가 커짐
        if (gameStart) {
            sizeUp = true;
            System.out.println("사이즈가 켜졌습니다.!");
        } else {
            System.out.println("============게임이 꺼져있습니다! 실행후 게임을 다시 시도 해주세요!!============");
        }

    }

    // 4. 마리오는 적을 발견 할 수 있음
    public boolean FindEnemy() {
        if (gameStart) {
            System.out.println("적 발견! 어떤 행동을 취하겠습니까?");
            findEnemy = true;

            int num;

            do {
                System.out.println("1. 점프");
                System.out.println("2. 가만히 있기");
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        // 4.1 마리오는 적을 공격 할 수 있음 (Jump)
                        jump();
                        break;
                    case 2:
                        // 4.2 사이즈가 커진 상태이면 사이즈가 줄어드면서 체력은 까이지 않음
                        if (sizeUp) {
                            System.out.println("데미지를 입었습니다! 하지만 버섯이 있습니다. 사이즈가 줄었습니다!");
                            sizeUp = false;
                        } else {
                            // 4.3 공격을 하지 않으면 체력이 깍임
                            HP -= 10;
                            System.out.println("데미지를 입었습니다. 체력: " + this.HP);
                            if (HP <= 0) {
                                System.out.println("체력이 0입니다.");
                                return true;
                            }
                        }
                }

                if (num >= 3) {
                    System.out.println("1 또는 2만 입력하세요!");
                }

            } while (num >= 3);

        } else {
            System.out.println("============게임이 꺼져있습니다! 실행후 게임을 다시 시도 해주세요!!============");
        }

        return false;
    }

    // 5. 게임을 종료 함
    public void isGameEnd() {
        if (gameStart) {
            System.out.println("============게임을 종료 합니다!============");
            gameStart = false;
        } else {
            System.out.println("============이미 게임이 꺼져 있습니다!============");
        }
    }


}
