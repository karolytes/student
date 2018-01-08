/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

/**
 *
 * @author student
 */
public class Dog extends Animal {
   private static String animalType = "Dog";

    public Dog(String animalType, String petName, String breedType) {
        super(animalType, petName, breedType);
    }
   
   
   

  @Override
    public String toString() {
        return "Animal type:"+ super.getAnimalType() + "\n Pet Name:" + super.getPetName() + "\n Breed Type:" + super.getBreedType();
    }


   
}
