public class Main {
    public static void main(String[] args){

        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        a.setAvailability(schedule, 2, 10, 15);
        a.setAvailability(schedule, 2, 30, 45);
        a.setAvailability(schedule, 2, 50, 60);
        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2, 15));

    }

}