package Task1;

public class Animal {
    String name;
    int age;

    static int count = 0;

    public Animal() {count++;};               //конструкторы
    public Animal(String name){
        this.name = name;
        count++;
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }

    public static void getCount(){
        System.out.println("Создано животных - " + count);
    }

    public void info(){
        System.out.println("Кличка животного: " + name + "; возраст: " + age);
    }

    public void run(int length){
        System.out.println(name + "пробежал(а) " + length + "метров.");
    }

    public void swim(int length){
        System.out.println(name + "проплыл(а) " + length + "метров.");
    }


}

