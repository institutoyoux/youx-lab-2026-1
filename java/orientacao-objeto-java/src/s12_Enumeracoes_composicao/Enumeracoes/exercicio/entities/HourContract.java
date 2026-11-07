package s12_Enumeracoes_composicao.Enumeracoes.exercicio.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double ValuePerhour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerhour, Integer hours) {
        this.date = date;
        ValuePerhour = valuePerhour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerhour() {
        return ValuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        ValuePerhour = valuePerhour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue() {
        return ValuePerhour * hours;

    }

}
