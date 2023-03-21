public class Meat extends Food{

    private int protein;

    public Meat(String name, int calories, int protein){
        super(name, calories);
        this.protein = protein;
    }

    public void cut(){
        System.out.println("This meat has been cut");
    }
}
