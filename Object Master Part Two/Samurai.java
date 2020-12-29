package human;

public class Samurai extends Human {

    int counter;

    public Samurai() {
        this.counter += 1;
    }
    public int health = 200;

    public void deathBlow(Human human) {
        human.health = 0;
        this.health = this.health / 2;
    }

    public void meditate() {
        this.health += (this.health / 2);
    }

    public int howMany() {
        return this.counter;
    }
}
