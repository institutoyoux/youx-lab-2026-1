package s12_Enumeracoes_composicao.Enumeracoes.exercicio.entities;

import s12_Enumeracoes_composicao.Enumeracoes.exercicio.entities.enums.Workerlevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Workerlevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();;

    public Worker() {
    }

    public Worker(String name, Workerlevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workerlevel getLevel() {
        return level;
    }

    public void setLevel(Workerlevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    public void addContract(HourContract contract) {
        contracts.add(contract);

    }
    public void removeContract(HourContract contract) {
        contracts.remove(contract);

    }
    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c  : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month)  {
                sum += c.totalValue();
            }



            sum += c.totalValue();
        }
        return sum;

    }
}
