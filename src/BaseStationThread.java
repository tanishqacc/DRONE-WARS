import java.io.IOException;

public class BaseStationThread extends Thread {
    private BaseStation baseStation;
    private String instructions;

    public BaseStationThread(BaseStation baseStation, String instructions) {
        this.baseStation = baseStation;
        this.instructions = instructions;
    }

    @Override
    public void run() {
        try {
            baseStation.sendInstructions(instructions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
