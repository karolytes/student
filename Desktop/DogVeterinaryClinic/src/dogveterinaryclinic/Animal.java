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
public class Animal {
    private String animalType;
    private String petName;
    private String breedType;

    /**
     *
     */
    public Animal() {
    }

    /**
     *
     * @param animalType
     * @param petName
     * @param breedType
     */
    public Animal(String animalType, String petName, String breedType) {
        this.animalType = animalType;
        this.petName = petName;
        this.breedType = breedType;
    }

    /**
     *
     * @return
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     *
     * @param animalType
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /**
     *
     * @return
     */
    public String getPetName() {
        return petName;
    }

    /**
     *
     * @param petName
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     *
     * @return
     */
    public String getBreedType() {
        return breedType;
    }

    /**
     *
     * @param breedType
     */
    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    
    
}
