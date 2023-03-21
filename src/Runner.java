public class Runner {
    public static void main(String[] args){
        Dog dog = new Dog("Jeff", 2, false);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.isHasBarked());
        System.out.println(dog.isHasBeenWalked());
        System.out.println(dog.isHasSlept());
        dog.bark();
        dog.walk();
        dog.sleep();
        System.out.println(dog.isHasBarked());
        System.out.println(dog.isHasBeenWalked());
        System.out.println(dog.isHasSlept());
        System.out.println();
        Cat cat = new Cat("Joe", 1, true);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.isHasMeowed());
        System.out.println(cat.isHasPlayedWith());
        System.out.println(cat.isHasSlept());
        cat.meow();
        cat.play();
        cat.sleep();
        System.out.println(cat.isHasMeowed());
        System.out.println(cat.isHasPlayedWith());
        System.out.println(cat.isHasSlept());
    }
}
