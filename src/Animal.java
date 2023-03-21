public class Animal {

    private String name;
    private int age;
    private boolean vaccinated;
    private boolean hasSlept;


    public Animal(String name, int age, boolean vaccinated){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        hasSlept = false;
    }

    public void adopt(){
        System.out.println("I have been adopted");
    }

    public void feed(){
        System.out.println("I have been fed");
    }

    public void sleep(){
        System.out.println("I have slept");
        hasSlept = true;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public boolean isVaccinated() {return vaccinated;}

    public boolean isHasSlept() {return hasSlept;}
}
