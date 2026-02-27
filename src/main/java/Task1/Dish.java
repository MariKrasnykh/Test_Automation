package Task1;

public class Dish {
    int capacity;
    int quantityFeed;

    public Dish(int capacity, int quantityFeed){
        this.capacity = capacity;
        this.quantityFeed = quantityFeed;
    }

    public void info(){
        System.out.println("Миска вместимостью - " + capacity + ". На данный момент корма - " + quantityFeed);
    }

    public void addFeed(int quantity){
        if (quantity < 0) System.out.println("Error");
          else {
            if (quantity <= capacity-quantityFeed)
            quantityFeed += quantity;
              else System.out.println("Корм не помещается в миску");
          }
    }

}
