package Serj;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxJump = random.nextInt(2);
        this.maxRun = random.nextInt(200);
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Не умеет плавать!");
    }
}
