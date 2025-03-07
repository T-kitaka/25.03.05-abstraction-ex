package com.jstudy.한상희;

public class User {
    private final Mario mario = new Mario();

    // 유저는 적을 발견할 수 있다.
        // 유저는 적을 발견하면 공격 할 수 있다.
        // 유저는 적을 발견하면 공격 하지 않아도 된다.
    public boolean findEnemy() {
        return mario.FindEnemy();
    }


    // 유저는 게임을 시작할 수 있다.
    public void gameStart() {
        mario.isGameStart();
    }

    // 유저는 게임을 끌 수 있다.
    public void gameEnd() {
        mario.isGameEnd();
    }

    // 유저는 마리오로 앞으로 갈수 있다.
    public void go() {
        mario.go();
    }

    // 유저는 마리오를 점프 시킬 수 있다.
    public void jump() {
        mario.jump();
    }

    // 유저는 버섯을 먹을 수 있다.
    public void earMushroom() {
        mario.eatMushroom();
    }

}
