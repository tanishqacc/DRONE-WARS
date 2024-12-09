import java.io.*;

public class Transmission {

    private File transFile = new File("C:\\Users\\TanishqChouhan\\IdeaProjects\\DRONE-WARS\\src\\trans.mxt");
    private File recvrsFile = new File("C:\\Users\\TanishqChouhan\\IdeaProjects\\DRONE-WARS\\src\\recvrs.mxt");

    public synchronized void writeTransmission(String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(transFile))) {
            writer.write(data);
        }
    }

    public synchronized String readAcknowledgement() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(recvrsFile))) {
            return reader.readLine();
        }
    }
}