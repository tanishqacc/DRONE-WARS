import java.io.IOException;

public class ResponderThread extends Thread {
    private Responder responder;

    public ResponderThread(Responder responder) {
        this.responder = responder;
    }

    @Override
    public void run() {
        try {
            responder.processInstructions();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}