public class BonusMilesService {
    int miles = 0;
    public int calculate(int price) {
        if (price > 1000) {
            miles = price / 100;
        }
        return miles;
    }
}
