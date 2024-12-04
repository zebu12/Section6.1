public class Bird extends Animal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("Bird is eating");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Bird is breathing");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Bird is sleeping");
    }

    public void layEggs(){
        System.out.println("lay eggs");
    }
    public void buildNests(){
        System.out.println("build nests");
    }
}
