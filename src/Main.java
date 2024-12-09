public class Main {
    public static void main(String[] args) {
        Planet arrakis = new Planet("Arrakis", 12, 0);
        Planet giediPrime = new Planet("Giedi Prime", 60, 0);
        Transmission transmission = new Transmission();

        BaseStation baseStation = new BaseStation(arrakis, giediPrime, transmission);
        Responder responder = new Responder(giediPrime, transmission);

        BaseStationThread baseStationThread = new BaseStationThread(baseStation, "><>><</<<>>/");
        ResponderThread responderThread = new ResponderThread(responder);

        baseStationThread.start();
        responderThread.start();
    }
}