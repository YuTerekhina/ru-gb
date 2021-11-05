package HomeWork07;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullEat = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullEat = fullEat;
    }

    public String getName() {
        return name;
    }

    public boolean isFullEat() {
        return fullEat;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate, Cat[] cat){
        plate.decreaseFood(appetite, getName());
    }

    public boolean fullEat(Plate plate){
        return (plate.getFood() >= appetite);
    }

    public void printFull(Plate plate, Cat[] cat){
        if(fullEat(plate) == true){
            System.out.println(getName() + " сытый.");
        }else{
            System.out.println(getName() + " голоден.");
        }
    }

}
