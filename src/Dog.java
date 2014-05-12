/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
/*Derived class 1 that might get instantiated by the factory method pattern */
// Concrete Product class
public class Dog implements Pet {
    
    @Override
    public String petSound() {
        return "Bow Wow";
    }
}
