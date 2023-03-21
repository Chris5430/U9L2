public class Cat extends Animal{

    private boolean hasPlayedWith;
    private boolean hasMeowed;

    public Cat(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        hasPlayedWith = false;
        hasMeowed = false;
    }

    public void play(){
        System.out.println("I have been played with");
        hasPlayedWith = true;
    }

    public void meow(){
        System.out.println("I have meowed");
        hasMeowed = true;
    }

    public boolean isHasPlayedWith(){return hasPlayedWith;}

    public boolean isHasMeowed() {return hasMeowed;}
}
