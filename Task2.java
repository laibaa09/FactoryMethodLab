/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author laiba
 */
public class Task {
    interface IPerson {
    String getName();
}

// Define Villager class implementing IPerson interface
class Villager implements IPerson {
    public String getName() {
        return "Village Person";
    }
}

// Define CityPerson class implementing IPerson interface
class CityPerson implements IPerson {
    public String getName() {
        return "City Person";
    }
}

// Define PersonType enum
enum PersonType {
    Rural, Urban
}

// Define PersonFactory class
class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new CityPerson();
            default:
                throw new UnsupportedOperationException();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of PersonFactory
        PersonFactory factory = new PersonFactory();

        // Get and print Rural person
        IPerson ruralPerson = factory.getPerson(PersonType.Rural);
        System.out.println(ruralPerson.getName());

        // Get and print Urban person
        IPerson urbanPerson = factory.getPerson(PersonType.Urban);
        System.out.println(urbanPerson.getName());
    }
}

}


}
