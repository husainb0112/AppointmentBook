public class Main {
    public static void main(String[] args){

        /*boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        a.makeAvailable(2, 10, 14);
        a.makeAvailable(2, 30, 44);
        a.makeAvailable(2, 50, 59);
        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));*/

        boolean[][] newSchedule = new boolean[8][60];
        AppointmentBook b = new AppointmentBook(newSchedule);
        System.out.println(b);
        b.makeAvailable(2, 25, 29);
        b.makeAvailable(3,0, 14);
        b.makeAvailable(3, 41, 59);
        b.makeAvailable(4, 5, 29);
        b.makeAvailable(4, 44, 59);
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
        System.out.println(b.makeAppointment(3, 4, 3));
        b.printPeriod(3);
        System.out.println(b.makeAppointment(2, 4, 30));
    


        
    }

}