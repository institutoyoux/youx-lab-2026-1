
package s09_construtores_this_sobrecarga_encapsulamento.a01_construtores.entities;

import java.util.Date;

public class Order {
    private Date date;
    private Product product;

    public Order(Date date,Product product) {
        super ();
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
