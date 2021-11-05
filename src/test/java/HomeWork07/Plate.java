package HomeWork07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void decreaseFood(int food){
        if (this.food >= food) {
            this.food -= food;
        }else{
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("Plate{");
        sb.append("food=").append(food);
        sb.append('}');
        return sb.toString();
    }

}
