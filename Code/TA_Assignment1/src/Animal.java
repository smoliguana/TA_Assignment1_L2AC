public class Animal {
    // The species of the animal (e.g. "dog", "cat", "lion")
    private String species;
    // The age of the animal in years
    private int age;
    // Constructor for the Animal class. Initializes the species and age of the animal
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    // Getter method for the species attribute
    public String getSpecies() {
        return species;
    }
    // Setter method for the species attribute
    public void setSpecies(String species) {
        this.species = species;
    }
    // Getter method for the age attribute
    public int getAge() {
        return age;
    }
    // Setter method for the age attribute
    public void setAge(int age) {
        this.age = age;
    }
}
