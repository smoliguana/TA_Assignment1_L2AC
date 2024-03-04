public class RunAnimal {
    public static void main(String[] args) {
        // Create a new Animal object
        Animal lion = new Animal("Lion", 5);
        Animal cat = new Animal("Cat",3);
        Animal dog = new Animal("Dog",4);

        // Update the age
        lion.setAge(6);
        cat.setAge(4);
        dog.setAge(5);

        // Print the output
        System.out.println("Species: " + lion.getSpecies());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Updated Age: " + lion.getAge());

        System.out.println("Species: " + cat.getSpecies());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Updated Age: " + cat.getAge());

        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Updated Age: " + dog.getAge());
    }
}
