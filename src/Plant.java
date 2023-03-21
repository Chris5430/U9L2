public class Plant extends Food{

    private String color;

    public Plant(String name, int calories, String color){
        super(name, calories);
        this.color = color;
    }

    public void explode(){
        System.out.println("This plant has exploded");
    }
}
