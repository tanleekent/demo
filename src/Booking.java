class Booking {
    private Customer customer;
    private Movie movie;
    private String seatNumber;

    public Booking(Customer customer, Movie movie, String seatNumber) {
        this.customer = customer;
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    public void printBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + movie.getPrice());
    }
}