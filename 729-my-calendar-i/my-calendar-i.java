class MyCalendar {

    private TreeMap<Integer, Integer> bookings;

    public MyCalendar() {
        bookings = new TreeMap<>();    
    }
    
    public boolean book(int start, int end) {
        Integer prev = bookings.floorKey(start);
        Integer nextBooking = bookings.ceilingKey(start);

        // check whether double booking taking place or not
        if((prev == null || bookings.get(prev)<= start) && (nextBooking == null || nextBooking>=end)){
            bookings.put(start,end);
            return true;
        }
        return false;
    }
}

/**
    public MyCalendar() {
        
    }
    

 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */