public class Planet {
    private String name;
    private double orbitPeriod; // in LTU
    private double currentPosition; // in degrees

    public Planet(String name, double orbitPeriod, double currentPosition) {
        this.name = name;
        this.orbitPeriod = orbitPeriod;
        this.currentPosition = currentPosition;
    }

    public double getCurrentPosition() {
        return currentPosition;
    }

    public void updatePosition(double time) {
        currentPosition = (currentPosition + (360 / orbitPeriod) * time) % 360;
    }

    public boolean isAlignedWith(Planet other) {
        double difference = Math.abs(this.currentPosition - other.getCurrentPosition());
        return difference <= 10 || difference >= 350;
    }
}