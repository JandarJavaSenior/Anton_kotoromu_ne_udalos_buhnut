import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int price;
    private LocalDate madelInDate;
    private String isAlcoholic;

    public Product(String name, String description, int price, LocalDate madelInDate, String isAlcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madelInDate = madelInDate;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadelInDate() {
        return madelInDate;
    }

    public void setMadelInDate(LocalDate madelInDate) {
        this.madelInDate = madelInDate;
    }

    public String getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(String isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String toString() {
        return "Product: " +'\n'+
                "Name: " + name + '\n'+
                "Description: " + description  + '\n'+
                "Price: " + price + '\n'+
                "MadelInDate: " + madelInDate + '\n'+
                "IsAlcoholic: " + isAlcoholic + '\n';
    }
}
