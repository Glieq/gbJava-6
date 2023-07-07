public class notebooks {
    private String brand;
    private String model;
    private double price;
    private int memory;
    private boolean inStock; // наличие на складе true/false

    public notebooks(String brand, String model, double price, int memory, boolean inStock) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.inStock = inStock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void filterInfo(int filter) {
        if (memory >= filter) {
            System.out.println("Бренд: " + brand);
            System.out.println("Модель: " + model);
            System.out.println("Цена: Руб. " + price);
            System.out.println("Память: " + memory + "Гб");
            System.out.println("Наличие: " + (inStock ? "В наличии" : "Нет в наличии"));
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цена: Руб: " + price);
        System.out.println("Память: " + memory + "Гб");
        System.out.println("Наличие: " + (inStock ? "В наличии" : "Нет в наличии"));
    }
}
