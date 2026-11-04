package entities;

public class program {

        public String name;
        public double price;
        public int quantity;

        public program() {
        }

        public program(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public program(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
