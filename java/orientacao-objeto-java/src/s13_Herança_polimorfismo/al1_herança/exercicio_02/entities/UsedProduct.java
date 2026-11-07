package s13_Herança_polimorfismo.al1_herança.exercicio_02.entities;

import java.util.Date;

public class UsedProduct {
    private Date manufactureDate;

    public UsedProduct(){
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}

