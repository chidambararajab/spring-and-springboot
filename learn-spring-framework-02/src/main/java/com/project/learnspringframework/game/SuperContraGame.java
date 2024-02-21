package com.project.learnspringframework.game;

public class SuperContraGame implements GameConsole {

    public void up() {
        System.out.println("Jump & Spin");
    }

    public void down() {
        System.out.println("Slide");
    }

    public void left() {
        System.out.println("Forward & Shoot Bullets");
    }

    public void right() {
        System.out.println("Go Back");
    }
}
