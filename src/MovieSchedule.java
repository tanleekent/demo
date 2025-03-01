class MovieSchedule {
    private Movie movie;
    private String showtime;

    public MovieSchedule(Movie movie, String showtime) {
        this.movie = movie;
        this.showtime = showtime;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getShowtime() {
        return showtime;
    }
}