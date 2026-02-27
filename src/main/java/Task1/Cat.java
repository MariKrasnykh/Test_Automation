package Task1;

public class Cat extends Animal{
    String breed;
    String color;
    String lengthFur;
    boolean satiety;
    int requiredAmountFeed;

    static int count = 0;

    public Cat() {count++;} //конструкторы
    public Cat(String name){
        super(name); count++;
    }
    public Cat(String name, int age){
        super(name, age); count++;
    }
    public Cat(String name, int age, String breed, String color, String lengthFur, boolean satiety, int requiredAmountFeed) {
        super(name, age);
        this.breed = breed;
        this.color = color;
        this.lengthFur = lengthFur;
        this.satiety = satiety;
        this.requiredAmountFeed = requiredAmountFeed;
        count++;
    }

    public static void getCount(){
        System.out.println("Создано кошек - " + count);
    }

    @Override
    public void info(){
        System.out.print("Кличка кошки - " + name + "; возраст - " + age + "; порода - " + breed + "; цвет - "
                + color + "; длина шерсти - " + lengthFur + "; необходимое количество корма - "
                + requiredAmountFeed + "; состояние - ");
        if (satiety) System.out.println("сытый");
          else System.out.println("голодный");
    }

    @Override
    public void run(int length){
        if (length <= 200)  System.out.println(name + "пробежал(а) " + length + "метров.");
          else System.out.println("Error: Кот не может пробежать больше 200 м.");
    }
    @Override
    public void swim(int length){
        System.out.println("Error: Кот не умеет плавать");
    }

    public void feed(Dish dish){
        if (dish.quantityFeed < 0 ) System.out.println("Error: Миска пустая");
        else {
            if (satiety) System.out.println("Error: Кот сытый)");
            else {
              if (dish.quantityFeed >= requiredAmountFeed) {
                  dish.quantityFeed -= requiredAmountFeed;
                  satiety = true;
              }
              else {
                System.out.println("Error: Корма недостаточно. Кот остался голодным(");
              }
            }
        }

    }



    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурка", 1, "Ragdoll", "белая", "средняя", false, 70);
        cats[1] = new Cat("Барс", 3, "Мейн-кун", "петнистый", "длинная", false, 115);
        cats[2] = new Cat("Бублик", 4);
        cats[2].requiredAmountFeed = 68;
        //cats[2].satiety = true;

        getCount();
        for (Cat cat: cats) {
            cat.info();
        }

        Dish dish = new Dish(500, 0);
        dish.addFeed(150);

        System.out.println("\nКормим кошек: ");
        for (Cat cat: cats) {
            cat.feed(dish);
            System.out.print(cat.name + " - ");
            if (cat.satiety) System.out.println("сытый");
            else System.out.println("голодный");
        }

    }
}
