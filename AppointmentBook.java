public class AppointmentBook {
    
    private boolean[][] schedule; 

    public AppointmentBook(boolean[][] schedule) {
        this.schedule = schedule; 
    }
    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }

    /**
     * Marks the block of minutes that starts at startMinute in period and
     * is duration minutes long as reserved for an appointment
     * Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59;
     * 1 <= duration <= 60
     */
    private void reserveBlock(int period, int startMinute, int duration) {
        /* implementation not shown */ }

    /**
     * Searches for the first block of duration free minutes during period, as
     * described in
     * part (a). Returns the first minute in the block if such a block is found or
     * returns -1 if no
     * such block is found.
     * Preconditions: 1 <= period <= 8; 1 <= duration <= 60
     */
    public int findFreeBlock(int period, int duration) {
        /* to be implemented in part (a) */ }

    /**
     * Searches periods from startPeriod to endPeriod, inclusive, for a block
     * of duration free minutes, as described in part (b). If such a block is found,
     * calls reserveBlock to reserve the block of minutes and returns true;
     * otherwise
     * returns false.
     * Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
     */
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
     /* to be implemented in part (b) */ }

    // There may be instance variables, constructors, and methods that are not shown.

}