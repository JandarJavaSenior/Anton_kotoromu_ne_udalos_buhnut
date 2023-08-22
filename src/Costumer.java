import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Costumer {
    private String name;
    private Passport passport;
    private Product [] products;
    private Bank bank;

    public Costumer(String name, Passport passport, Product[] products, Bank bank) {
        this.name = name;
        this.passport = passport;
        this.products = products;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Costumer: " + '\n' +
                "Name: " + name + '\n' +
                "Passport: " + passport + '\n' +
                "Products: " + '\n' +
                "Bank: " + bank ;
    }
    String checkProduct(Product[]products) {
        for (int i = 0; i < products.length; i++) {
            Period prosrochka = Period.between(products[i].getMadelInDate(), LocalDate.of(2023, 9, 11));
            if (prosrochka.getMonths() >= 3) {
                return " Товар просроченный";
            } else {
                if (products[i].getIsAlcoholic().equalsIgnoreCase("Алкоголь")) {
                    Period age = Period.between(passport.getDateOfBirth(), LocalDate.now());
                    if (age.getYears() >= 18) {
                        return "Вам больше 18, можете купить этот товар" + products[i];
                    } else {
                        return "Вам нет 18, не можете купить этот товар" + products[i];
                    }
                }
            }
        }
        return "Тут нет алькоголя, можете купить любой товар";
    }
}
