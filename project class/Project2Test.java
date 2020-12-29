/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author pccorner
 */
public class Project2Test {
    public static void main(String[] args) {
        Project2 axsos=new Project2();
        axsos.setName("Academy");
        axsos.setDescription("An academy to learn coding in Palestine");
        axsos.setInitialCost(2500);
        System.out.println(axsos.getName());
        System.out.println(axsos.getDescription());
        System.out.println(axsos.getInitialCost());
        System.out.println(axsos.elevatorPitch());
        
        
        
    }
    
}
