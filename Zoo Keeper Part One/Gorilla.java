package mammal;

public class Gorilla extends Mammal {
    public Gorilla(){
        
    }

    public void throwSomething() {
        super.ergyLevel -= 5;
        System.out.println("Gorilla throw something");

    }

    public void eatBananas() {
        super.ergyLevel += 10;
        System.out.println("Gorilla eats banana");

    }

    public void climb() {
        super.ergyLevel -= 10;
        System.out.println("Gorilla climbed a tree");

    }
   

}
