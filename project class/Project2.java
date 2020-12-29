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
public class Project2 {
    String name;
    String description;
    double initialCost;
    
     public Project2() {
         this.name=name;
         this.description=description;
         this.initialCost=initialCost;
        
    }
    public Project2(String name) {
        this.name=name;
    }
    public Project2(String name, String description,double initialCost) {
        this.name=name;
        this.description=description;
        this.initialCost=initialCost;
        
    }
    
    public void setName(String name){
        this.name=name;
        
    }
    public String getName(){
        return "Project name is : "+this.name;
        
    }
    public void setDescription(String description){
        this.description=description;
        
    }
    public String getDescription(){
        return "Project Description : "+this.description;
        
    }
    public String getInitialCost() {
        return "project Initial Cost: "+this.initialCost;
        
    }
    public void setInitialCost(double initialCost){
        this.initialCost=initialCost;
    }
    public String elevatorPitch(){
        return this.name+": ("+ this.initialCost+ ")"+this.description;
    }
    
}
