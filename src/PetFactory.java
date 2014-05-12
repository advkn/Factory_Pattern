/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */


//FACTORY METHOD IMPLEMENTATION

public class PetFactory {
    
    //Function is of type pet so that it returns the necessary concrete product/object (dog or cate)
    public Pet getPet(String petType) {
        
        Pet pet = null;
        
        //Based on logic, factory instatiates an object depending on the type evaluated.
        if("Bow".equals(petType)) {
            pet = new Dog();
        }
        else if("Meow".equals(petType)) {
            pet = new Cat();
        }
        
        return pet;
    }
    
}
