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
public class Patienttype {
    private String petType;
    private String petName;
    private String  breedType;
    
    public Patienttype(){
        
    }

    public Patienttype(String petType, String petName, String breedType) {
        this.petType = petType;
        this.petName = petName;
        this.breedType = breedType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    @Override
    public String toString() {
        return "Patienttype:" + this.petType + "\nBreedType:" + this.breedType + "\nPet Name:" + this.petName;
    }
    
}
