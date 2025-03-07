package com.jstudy.정휘상;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagementServer mgmtServer = new ManagementServer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== VPS 관리 프로그램 ==========");
            System.out.println("1. VPS 켜기");
            System.out.println("2. VPS 끄기");
            System.out.println("3. VPS 재시작");
            System.out.println("4. 앱 배포");
            System.out.println("5. VPS 구매");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();
            int sel = -1;
            sel = switch (no) {
                case 1, 2, 3, 4 -> {
                    System.out.print("VPS 선택 : ");
                    yield sc.nextInt();
                }
                default -> sel;
            };

            switch (no) {
                case 1:
                    mgmtServer.startVPS(sel);
                    break;
                case 2:
                    mgmtServer.stopVPS(sel);
                    break;
                case 3:
                    mgmtServer.restartVPS(sel);
                    break;
                case 4:
                    System.out.print("앱 이름 : ");
                    sc.nextLine();
                    String app = sc.nextLine();
                    mgmtServer.deployToVPS(sel, app);
                    break;
                case 5:
                    int num = mgmtServer.buyVPS();
                    System.out.println("구입하신 VPS 번호는 " + num + "번 입니다.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못 된 입력입니다.");
            }

        }
    }
}
