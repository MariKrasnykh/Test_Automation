package Task1;

public class Dog extends Animal {
    String breed;
    String size;

    static int count = 0;

    public Dog() {count++;}                   //конструкторы
    public Dog(String name){
        super(name); count++;
    }
    public Dog(String name, int age){
        super(name, age); count++;
    }
    public Dog(String name, int age, String breed, String size) {
        super(name, age);
        this.breed = breed;
        this.size = size;
        count++;
    }

    public static void getCount(){
        System.out.println("Создано собак - " + count);
    }

    @Override
    public void info(){
        System.out.println("Кличка собаки - " + name + "; возраст - " + age + "; порода - " + breed + "; размер - " + size);
    }
    @Override
    public void run(int length){
        if (length <= 500)  System.out.println(name + "пробежал(а) " + length + "метров.");
          else System.out.println("Error: Собака не может пробежать больше 500 м.");
    }
    @Override
    public void swim(int length){
        if (length <= 10) System.out.println(name + "проплыл(а) " + length + "метров.");
          else System.out.println("Error: Собака не может проплыть больше 10 м.");
    }

}
