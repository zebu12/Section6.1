public class Mammal extends Animal {


    @Override
    public void eat() {
        super.eat();
        System.out.println("Mammal eat");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Mammal breathe");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Mammal sleep");
    }
    public void feedYoung(){
        System.out.println("Feed young");
    }
}
