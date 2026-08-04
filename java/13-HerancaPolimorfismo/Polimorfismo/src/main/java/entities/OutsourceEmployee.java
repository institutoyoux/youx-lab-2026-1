package entities;

public class OutsourceEmployee extends Employee {
    private Double additinalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additinalCharge) {
        super(name, hours, valuePerHour);
        this.additinalCharge = additinalCharge;
    }

    public Double getAdditinalCharge() {
        return additinalCharge;
    }

    public void setAdditinalCharge(Double additinalCharge) {
        this.additinalCharge = additinalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additinalCharge * 1.1;
    }
}
