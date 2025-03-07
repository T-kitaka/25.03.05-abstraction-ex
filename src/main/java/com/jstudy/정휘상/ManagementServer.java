package com.jstudy.정휘상;
import java.util.*;

public class ManagementServer {
    private List<VPS> vpsList;

    public ManagementServer() {
        vpsList = new ArrayList<>();
    }

    public int buyVPS() {
        vpsList.add(new VPS());
        return vpsList.size() - 1;
    }

    public void startVPS(int num) {
        if (!validateNum(num)) return;
        vpsList.get(num).start();
    }

    public void stopVPS(int num) {
        if (!validateNum(num)) return;
        vpsList.get(num).stop();
    }
    public void restartVPS(int num) {
        if (!validateNum(num)) return;
        vpsList.get(num).restart();
    }
    public void deployToVPS(int num, String app) {
        if (!validateNum(num)) return;
        vpsList.get(num).deployApplication(app);
    }

    private boolean validateNum(int num) {
        if (num < 0 || num >= vpsList.size()) {
            System.out.println("잘못된 VPS 번호입니다.");
            return false;
        }
        return true;
    }
}
