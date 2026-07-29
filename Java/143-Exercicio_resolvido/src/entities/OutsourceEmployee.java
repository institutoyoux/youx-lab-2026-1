package entities;

public class OutsourceEmployee extends Employee {

    private Double additonalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additonalCharge) {
        super(name, hours, valuePerHour);
        this.additonalCharge = additonalCharge;
    }

    public Double getAdditonalCharge() {
        return additonalCharge;
    }

    public void setAdditonalCharge(Double additonalCharge) {
        this.additonalCharge = additonalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additonalCharge * 1.1;
    }
}
