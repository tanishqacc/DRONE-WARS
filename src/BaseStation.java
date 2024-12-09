import java.io.IOException;

public class BaseStation {
    private Planet arrakis;
    private Planet giediPrime;
    private Transmission transmission;

    public BaseStation(Planet arrakis, Planet giediPrime, Transmission transmission) {
        this.arrakis = arrakis;
        this.giediPrime = giediPrime;
        this.transmission = transmission;
    }

    public void sendInstructions(String instructions) throws IOException {
        if (arrakis.isAlignedWith(giediPrime)) {
            transmission.writeTransmission(instructions);
        }
    }
}