/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

//MAIN class that uses the factory method pattern

public class SampleFactoryMethod {
    
    public static void main(String args[]) {
        
        //Create a new PetFactory to create the objects
        PetFactory petFactory1 = new PetFactory();
        
        //Create a pet that is the result of the validation from PetFactory
        Pet pet1 = petFactory1.getPet("Bow");
        
        //By convention, you don't know which pet was created except by the 
        //output from the println statement
        System.out.println(pet1.petSound());
    }
}
