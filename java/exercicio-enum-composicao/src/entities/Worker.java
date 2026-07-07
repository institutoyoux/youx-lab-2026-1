package entities;

import entities.enums.WorkerLevel;

import java.util.Date;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private int max = 0;
    private HourContract[] contracts = new HourContract[*];

    public Worker() {
    }
    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(Date date, Double valuePerHour, int hours) {
        max++;
        System.out.print(contracts.length);
    }

    public void removeContract(HourContract contract) {
        for (int i=0; i < contracts.length; i++) {
            HourContract contract1 = contracts[i];
            if (contract1.equals(contract)) {
                contracts[i] = null;
            }
        }
    }
    public Double income(int year, int month) {
        for (HourContract contract : contracts) {

        }
        return 8.;
    }
}
