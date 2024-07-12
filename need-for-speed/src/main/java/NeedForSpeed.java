class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int remainingBattery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
       this.speed = speed;
       this.batteryDrain = batteryDrain;

    }

    public boolean batteryDrained() {
        return remainingBattery < batteryDrain;
    }
    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()) {
        this.distanceDriven += this.speed ;
        this.remainingBattery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {

        this.distance = distance;

    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }

}
