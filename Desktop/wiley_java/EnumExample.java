enum Weekday{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Weekday day=Weekday.FRIDAY;
        // System.out.println(day);

        for(Weekday day: Weekday.values()){
            System.out.println(day);
        }
    }
}
