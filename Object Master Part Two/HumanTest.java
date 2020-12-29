package human;

public class HumanTest {

    public static void main(String[] args) {
        Human mais = new Human();
//        Human hadeel = new Human();
//        mais.attack(hadeel);
//        mais.attack(hadeel);
//        mais.attack(hadeel);
//        mais.attack(hadeel);
//        hadeel.attack(mais);
//        System.out.println("Mais's health = " + mais.health);
//        System.out.println("Hadeel's health = " + hadeel.health);
        Ninja hazem = new Ninja();
////        Ninja dia = new Ninja();     
//        hazem.runAway();
//        hazem.runAway();
//        dia.steal(hazem);
//        hazem.steal(mais);
//        System.out.println(hazem.health);
//        System.out.println(mais.health);
//        System.out.println(dia.health);
        Samurai ikram = new Samurai();
        Samurai nawal = new Samurai();
        Samurai shatha = new Samurai();        
        shatha.deathBlow(hazem);
        System.out.println(hazem.health);
        System.out.println(shatha.health);
        


    }

}
