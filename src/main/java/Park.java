public class Park {
    String namePark;
    String address;
    int yearOpening;
    int area;
    String phone;
    String workingTimePark;
    Attraction attraction;

    public class Attraction{
        String nameAttraction;
        String workingTimeAttraction;
        int price;
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.namePark = "Disneyland";
        park.yearOpening = 1955;
        park.area = 200;

        Park.Attraction atr = new Park().new Attraction();
        atr.nameAttraction = "Swing";

        park.attraction = atr;
        System.out.println(park.attraction.nameAttraction);

    }

}
