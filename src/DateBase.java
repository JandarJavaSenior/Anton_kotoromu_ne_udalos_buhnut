import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class DateBase {
    private Costumer[] costumers;

    public DateBase(Costumer[] costumers) {
        this.costumers = costumers;
    }

    public Costumer[] getCostumers() {
        return costumers;
    }

    public void setCostumers(Costumer[] costumers) {
        this.costumers = costumers;
    }

    Product[] getAllCostomerProdukt(String name) {

        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getName().equalsIgnoreCase(name)) {
                return costumers[i].getProducts();
            }

        }

        return null;
    }

    public Product[] deleteProductByName(String name, String productName) {
        for (int j = 0; j < costumers.length; j++) {
            if (costumers[j].getName().equalsIgnoreCase(name)) {
                Product[] products = costumers[j].getProducts();
                int productIndexToRemove = -1;

                for (int i = 0; i < products.length; i++) {
                    if (products[i].getName().equalsIgnoreCase(productName)) {
                        productIndexToRemove = i;
                        break;
                    }
                }

                if (productIndexToRemove != -1) {
                    Product[] newProducts = new Product[products.length - 1];
                    int newIndex = 0;

                    for (int i = 0; i < products.length; i++) {
                        if (i != productIndexToRemove) {
                            newProducts[newIndex] = products[i];
                            newIndex++;
                        }
                    }

                    costumers[j].setProducts(newProducts);
                    return costumers[j].getProducts();
                }
            }
        }
        return null;
    }


    public Product[] addProduct(String customerName, String newProduct) {
        for (int j = 0; j < costumers.length; j++) {
            if (costumers[j].getName().equalsIgnoreCase(customerName)) {
                Product[] oldProducts = costumers[j].getProducts();
                Product newProductInstance = new Product(newProduct, "", 250, null, ""); // Создаем новый продукт

                boolean productExists = false;
                for (Product p : oldProducts) {
                    if (p.getName().equalsIgnoreCase(newProduct)) {
                        productExists = true;
                        break;
                    }
                }

                if (!productExists) {
                    Product[] newProducts = Arrays.copyOf(oldProducts, oldProducts.length + 1);
                    newProducts[newProducts.length - 1] = newProductInstance;
                    costumers[j].setProducts(newProducts);
                    return newProducts;
                }
            }
        }

        return null;
    }


    public Costumer updateCustomerName(String oldName, String newName, Costumer[] customers) {
        for (Costumer customer : customers) {
            if (customer.getName().equalsIgnoreCase(oldName)) {
                customer.setName(newName);
                return customer;
            }
        }

        return null;

    }
    String payment(String name, String password, int sum) {
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getBank().getUserName().equalsIgnoreCase(name)) {
                if (costumers[i].getBank().getPassword().equals(password)) {
                    if (sum <= costumers[i].getBank().getTotalManey()) {
                        return "Остаток вашего баланса " + (costumers[i].getBank().getTotalManey() - sum);
                    } else {
                        return "Кассир Лена: У вас недостаточно средств\n" +
                                "\nАнтон Алкаш: Ну Леночка деточка моя, дай пожалуйста, \n" +
                                "у меня голова болит, не могу я Лена, пожалуйста девица красавица\n" +
                                "\nКассир Лена: Нет, и ещё раз НЕТ!\n" +
                                "Как только отдадите долг возможно я дам , а так нет!\n" +
                                "\nАнтон слыша твердый тон Лены понял,\n" +
                                "что сегодня ему не удастся бухнуть,\n" +
                                "и грустно зашагал домой";
                    }
                }
            }
        }
        return "Неправильное имя пользователья или счет";
    }








}