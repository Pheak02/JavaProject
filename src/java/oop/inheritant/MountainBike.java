class MountianBike extends Bicycle {
    public int seatHeight;
    public MountianBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear); //write as this very 1st line
        this.seatHeight = startHeight;
    }
    public void setHeight (int newValue) {

    }
}