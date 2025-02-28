class Booking {
    private Customer customer;
    private Movie movie;

    public Booking(Customer customer, Movie movie) {
        this.customer = customer;
        this.movie = movie;
    }

    public void printBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Price: $" + movie.getPrice());
    }
}