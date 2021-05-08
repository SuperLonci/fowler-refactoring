class Rental {
    Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double getCharge() {
        return getMovie()._price.getCharge(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return getMovie()._price.getFrequentRenterPoints(getDaysRented());
    }

}