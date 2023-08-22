import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023,8,21);


        Product product1 = new Product("Хлеб",
                "Ражаной хлеб из деревни 400г НЕТТО",45,date,"Не Алкоголь");
        Product product2 = new Product("Колбаса",
                "Колбаса из деревни 600г НЕТТО",450,date,"Не Алкоголь");
        Product product3 = new Product("Пиво",
                "Пиво из Ражаного хлеба 1л НЕТТО",300,date,"Алкоголь");
        Product product4 = new Product("Молоко",
                "Домашнее Молоко 1л НЕТТО",45,date,"Не Алкоголь");
        Product product5 = new Product("Шоколад",
                "Шоколад из Какоса Натурал 150г НЕТТО",95,date,"Не Алкоголь");
        Product product6 = new Product("Сок",
                "Натуральный сок 1л НЕТТО",45,date,"Не Алкоголь");
        Product product7 = new Product("Король",
                "Водка Российский",1200,date,"Алкоголь");
        Product product8 = new Product("Хлеб",
                "Ражаной хлеб из деревни 400г НЕТТО",45,date,"Не Алкоголь");
        Product product9 = new Product("Вода",
                "Ледниковая вода из Алтийских гор 1л",45,date,"Не Алкоголь");

        Product [] products1 = {product7,product2,product3};
        Product [] products2 = {product1,product4,product5,product6};
        Product [] products3 = {product3,product8,product9};

        Bank bank1 = new Bank("Антон_Алкаш","бухло123",-1200,1000);
        Bank bank2 = new Bank("Света","любопь98",10000,0);
        Bank bank3 = new Bank("Коля_Дворник","12345678",5000,2500);

        Passport pt1 = new Passport(LocalDate.of(1978,3,2),"Россия","Мужчина");
        Passport pt2 = new Passport(LocalDate.of(1998,3,2),"Россия","Женшина");
        Passport pt3 = new Passport(LocalDate.of(1971,3,2),"Россия","Мужчина");

        Costumer costumer1 = new Costumer("Антон",pt1,products1,bank1);
        Costumer costumer2 = new Costumer("Светлана",pt2,products2,bank2);
        Costumer costumer3 = new Costumer("Коля",pt3,products3,bank3);

        Costumer [] costumers = {costumer1,costumer2,costumer3};

        DateBase dateBase = new DateBase(costumers);
        System.out.println("Список продуктов Светланы: ");
        System.out.println(Arrays.toString(dateBase.getAllCostomerProdukt("Светлана")));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Антон удалил дорогую водку из продуктов: ");
        System.out.println(Arrays.toString(dateBase.deleteProductByName("Антон", "Король")));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Антон добавил дешевую водку к продуктам: ");
        System.out.println(Arrays.toString(dateBase.addProduct("АНТОН", "СВЯЩЕННАЯ ВОДЯРА")));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Антон сменил имя: ");
        System.out.println(dateBase.updateCustomerName("АНТОН", "Владислав", costumers));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Антон хочет купить водку: ");
        System.out.println(dateBase.payment("Антон_Алкаш", "бухло123", 1000));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Антон хочет купить водку используя кредит: ");
        System.out.println(bank1.makePaymentWithCredit("Антон_Алкаш", "бухло123", 200));


    }
}