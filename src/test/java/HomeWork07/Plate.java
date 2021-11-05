package HomeWork07;



public class Plate {
    private int food;

    public Plate(int food) {
        foodInPlate();
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int food, String name){
        if (this.food >= food) {
            this.food -= food;
            System.out.println(name + " съел " + food + " грамм корма, в тарелке осталось " + this.food + " грамм корма.");
        }else{
            System.out.println(name + " остался голодным." + " В тарелке недостаточно корма: " + this.food);
        }
    }

    public boolean checkFood() {
        return (this.food - food) <= 0;
    }

    public void foodInPlate(){
        System.out.println("В тарелке находится " + getFood() + " грамм корма.");
        if (checkFood() == true) {
            this.food += 400;
            System.out.println("В тарелку добавили 400 грамм корма");
        }
    }


}
