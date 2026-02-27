public class Product {
    String name;
    String productDate;
    String manufacturer;
    String country;
    float price;
    boolean booking;

    public Product(String name,String productDate, String manufacturer, String country, float price, boolean booking) {
        this.name = name;
        this.productDate = productDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }

    public void PrintInfoObject() {
        System.out.print("Название товара: " + name + "; Дата производства: " + productDate + "; Производитель: "
                + manufacturer + "; Страна происхождения товара: " + country + "; Цена: " + price + "; Состояние бронирования: ");
        if (booking) System.out.println("забронирован \n");
        else System.out.println("не забронирован \n");

    }


    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Ручка гелевая, черная, Schiller Basic 0,5", "20.09.2025", "Schiller", "China", 131f,false);
        productsArray[1] = new Product("Ручка шариковая автоматическая, черная, Schiller Simplex 0,7", "03.11.2025", "Schiller", "China", 107.3f, false);
        productsArray[2] = new Product("Карандаш чернографитный с ластиком, Schiller Classic HB","25.11.2025","Schiller","China", 95.99f, false);
        productsArray[3] = new Product("Записная книжка А6, 96 л., кл СПб","05.05.2025","Знаковые сувениры","Россия",216.99f, true);
        productsArray[4] = new Product("Альбом для акварели А5, 12л, среднезернистая, 100% хлопок, 300г/м2, склейка с одной стороны", "02.02.2025","VISTA-ARTISTA", "Россия", 1079.99f, true);

        for (Product p: productsArray) {
            p.PrintInfoObject();
        }
    }

}
