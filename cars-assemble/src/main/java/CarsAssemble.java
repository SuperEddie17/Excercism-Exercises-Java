public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int baseRate = speed *221;
        if (1 <= speed && speed <= 4){
            return baseRate;
        } else if(speed >= 5 && speed <= 8) {
            return baseRate*0.9;
        } else if (speed == 9 ){
            return baseRate*0.8;
        } else if (speed == 10){
            return baseRate*0.77;
        } else {
            return 0;
        }

    }

    public int workingItemsPerMinute(int speed) {
    return (int) (productionRatePerHour(speed) / 60); }
}
