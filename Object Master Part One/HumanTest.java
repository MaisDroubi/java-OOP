package human;

public class HumanTest {

    public static void main(String[] args) {
        Human mais = new Human();
        Human hadeel = new Human();
        mais.attack(hadeel);
        mais.attack(hadeel);
        mais.attack(hadeel);
        mais.attack(hadeel);
        hadeel.attack(mais);
        System.out.println("Mais's health = " + mais.health);
        System.out.println("Hadeel's health = " + hadeel.health);

    }

}
