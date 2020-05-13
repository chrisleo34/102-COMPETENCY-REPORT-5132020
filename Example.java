public class Example {

    public static void main(String[] args){
        
        // objects interaction
        User shay = new User("Shay",21);
        //second object
        User christian = new User ("Christian",29);

        
        // display the object
        shay.printUser();
        //display second object
        christian.printUser();

        Student nora = new Student ("Nora",22,9);
        nora.printStudent();      
        
        //Print second student
        Student trevor = new Student ("Trevor",25,15);
        trevor.printStudent();
        
     //Create Animal
        Animal Sheep = new Animal (" Animal: Baby ", " Animal Type: Sheep ");
        Sheep.printAnimal();

        Animal BabyBear = new Animal (" Animal: Beep ", " Animal Type: BabyBear ");
        BabyBear.printAnimal();

        BabyBear.attacks(nora);
        Sheep.attacks(trevor);
    }
}