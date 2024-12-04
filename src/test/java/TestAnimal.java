public class TestAnimal {

    public static void main(String[] args) {

        Mammal dog = new Mammal();
        Bird eagle = new Bird();

        System.out.println("Passing a Mammal (dog): ");
        doAnimalStuff(dog);

        System.out.println("---------------------------");

        System.out.println("Passing a Bird (eagle): ");
        doAnimalStuff(eagle);



    }

    public static void doAnimalStuff(Animal animal) {

        animal.eat();
        animal.breathe();
        animal.sleep();
        animal.play();

        if (animal instanceof Mammal) {
            Mammal m = (Mammal) animal;
            m.feedYoung();
        }else if (animal instanceof Bird) {
            Bird b = (Bird) animal;
            b.layEggs();
            b.buildNests();
        }


    }


}
