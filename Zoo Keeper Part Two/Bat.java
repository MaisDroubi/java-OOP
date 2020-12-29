/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;

/**
 *
 * @author pccorner
 */
public class Bat extends Mammal {

    public int ergyLevel = 300;

    public Bat() {

    }

    public void fly() {
        this.ergyLevel -= 50;
        System.err.println("Bat can fly");

    }

    public void eatHumans() {
        this.ergyLevel += 25;
        System.err.println("Bat can eat Humans");

    }

    public void attackTown() {
        this.ergyLevel -= 100;
        System.err.println("Bat can attach town");

    }

}
