package com.company;

public class MovablePoint implements Movable {
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        xSpeed = 0;
        ySpeed = 1;
        x += xSpeed * 1;
        y += ySpeed * 1;
    }

    @Override
    public void moveDown() {
        xSpeed = 0;
        ySpeed = -1;
        x += xSpeed * 1;
        y += ySpeed * 1;
    }

    @Override
    public void moveLeft() {
        xSpeed = -1;
        ySpeed = 0;
        x += xSpeed * 1;
        y += ySpeed * 1;
    }

    @Override
    public void moveRight() {
        xSpeed = 1;
        ySpeed = 0;
        x += xSpeed * 1;
        y += ySpeed * 1;
    }

    @Override
    public String toString() {
        String str;
        str = "x = " + x + "; y = " + y +
                "; xSpeed = " + xSpeed +
                "; ySpeed = " + ySpeed;
        return str;

    }
}
