public class BonusMilesService {
    public int calculate (int price){
        int println;
        if (price > 20){
            println = price / 20;
        } else {
            println = 0;
        }
        return println;
    }
}
