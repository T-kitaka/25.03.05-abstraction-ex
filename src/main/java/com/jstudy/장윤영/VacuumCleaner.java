package com.jstudy.장윤영;

public class VacuumCleaner {

    private boolean isOn;            // 초기 상태: 전원 OFF
    private boolean isDustbinFull;   // 초기 상태: 먼지통 비어있음

    /* 전원을 켜기: 먼지통이 비어있어야만 가능 */
    public void turnOn() {
        if (isOn) {
            System.out.println("이미 전원이 켜져 있습니다.");
        } else if (isDustbinFull) {
            System.out.println("❌ 먼지통이 가득 차 있어 전원을 켤 수 없습니다. 먼지를 먼저 비워주세요.");
        } else {
            this.isOn = true;
            System.out.println("🟢 전원이 켜졌습니다. 청소 준비 완료!");
        }
    }

    /* 청소 시작: 전원이 켜져 있어야만 가능 */
    public void clean() {
        if (isOn) {
            if (isDustbinFull) {
                System.out.println("❌ 먼지통이 가득 차서 더 이상 청소할 수 없습니다! 먼지를 먼저 비워주세요.");
            } else {
                System.out.println("🧹 청소 중... 먼지통이 가득 찼습니다.");
                this.isDustbinFull = true;
            }
        } else {
            System.out.println("❌ 청소기가 꺼져 있습니다. 먼저 전원을 켜주세요.");
        }
    }

    /* 전원 끄기: 청소가 끝나면 가능 */
    public void turnOff() {
        if (isOn) {
            this.isOn = false;
            System.out.println("🔴 청소기 전원이 꺼졌습니다.");
        } else {
            System.out.println("⚠ 이미 전원이 꺼져 있습니다.");
        }
    }

    /* 먼지통 비우기: 전원이 꺼진 상태에서만 가능 */
    public void emptyDustbin() {
        if (isOn) {
            System.out.println("❌ 전원을 끈 후 먼지를 비워주세요.");
        } else if (!isDustbinFull) {
            System.out.println("✅ 먼지통이 이미 비어 있습니다.");
        } else {
            this.isDustbinFull = false;
            System.out.println("🗑 먼지통을 비웠습니다. 다시 청소가 가능합니다.");
        }
    }
}
