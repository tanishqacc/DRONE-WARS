import java.io.IOException;

public class Responder {
    private Planet giediPrime;
    private Transmission transmission;

    public Responder(Planet giediPrime, Transmission transmission) {
        this.giediPrime = giediPrime;
        this.transmission = transmission;
    }

    public void processInstructions() throws IOException {
        String instructions = transmission.readAcknowledgement();
        if (instructions != null) {
            // Process instructions (simulate processing time)
            try {
                Thread.sleep(1000); // 1 LTU unit
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // Send acknowledgement back
            transmission.writeTransmission("/.>.>.<.");
        }
    }
}