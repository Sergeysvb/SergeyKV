package Serj;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animal(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist)
            System.out.println(this.type + " " + this.name + " пробежала " + dist + " м.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist)
            System.out.println(this.type + " " + this.name + " проплыла " + dist + " м.");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " перепрыгнул " + height + " м.");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " Пробежала: " + this.maxRun + " м. Проплыла: " + this.maxSwim + " м. Перепрыгнула: " + this.maxJump + " м.");
    }
}

