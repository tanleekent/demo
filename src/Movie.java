class Movie {
    private String title;
    private String genre;
    private double price;
    private int duration; // Duration in minutes

    public Movie(String title, String genre, double price, int duration) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public String getFormattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("%02d:%02d", hours, minutes);
    }
}