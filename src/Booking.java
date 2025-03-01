class Booking {
    private Customer customer;
    private String seatNumber;
    private MovieSchedule schedule;

    public Booking(Customer customer, MovieSchedule schedule, String seatNumber) {
        this.customer = customer;
        this.schedule = schedule;
        this.seatNumber = seatNumber;
    }

    public void printBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Movie: " + schedule.getMovie().getTitle());
        System.out.println("Showtime: " + schedule.getShowtime());
        System.out.println("Price: $" + schedule.getMovie().getPrice());
        System.out.println("Seat Number: " + seatNumber);
    }
}