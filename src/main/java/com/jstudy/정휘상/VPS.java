package com.jstudy.정휘상;
public class VPS {
    private boolean isRunning;

    public VPS() {
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("VPS 전원이 켜졌습니다.");
            return;
        }
        System.out.println("VPS가 이미 실행 중입니다.");
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("VPS 전원이 종료되었습니다.");
            return;
        }
        System.out.println("VPS가 실행 중이 아닙니다..");
    }

    public void restart() {
        if (isRunning) {
            System.out.println("VPS 서버를 재시작 합니다.");
            stop();
            start();
            return;
        }
        System.out.println("VPS가 실행 중이 아닙니다.");
    }

    public void deployApplication(String app) {
        if (isRunning) {
            System.out.println("애플리케이션 " + app + "가 배포 되었습니다.");
            return;
        }
        System.out.println("VPS가 실행 중이 아닙니다. ");
    }
}
