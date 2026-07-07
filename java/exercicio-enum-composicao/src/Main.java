import entities.Worker;
import entities.enums.WorkerLevel;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Worker c1 = new Worker("Alex", WorkerLevel.JUNIOR, 10.0);
        c1.addContract(new Date(), 1.0, 1);
    }
}