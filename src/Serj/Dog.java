package Serj;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10);
        this.maxJump = random.nextDouble();
    }
}
