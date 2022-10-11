
public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;

    }
    public int getDrink(){
        return this.volume -= 10;
    }

    public int empty(){
        return this.volume -= 100;
    }

    public int fill(){
        return this.volume += 100;
    }

}
