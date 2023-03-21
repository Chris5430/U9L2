public class Dog extends Animal{

    private boolean hasBeenWalked;
    private boolean hasBarked;

    public Dog(String name, int age, boolean vaccinated){
        super(name,age,vaccinated);
        hasBeenWalked = false;
        hasBarked = false;
    }

    public void walk(){
        System.out.println("I have been walked");
        hasBeenWalked = true;
    }

    public void bark(){
        System.out.println("I have barked");
        hasBarked = true;
    }

    public boolean isHasBeenWalked() {return hasBeenWalked;}

    public boolean isHasBarked() {return hasBarked;}

}
