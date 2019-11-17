package tmr.design.pattern.strategy;

import org.joda.money.Money;
import tmr.design.pattern.strategy.movie.Movie;

import java.util.ArrayList;

/**
 * Class representing a {@link Customer}'s current rented movies.
 *
 * This class keeps track of the reward points accrued and the cost of renting the movies.
 */
public class Rental {

    private ArrayList<Movie> movies;
    private int daysRented;
    private Money cost;
    private int rewardPoints;

    Rental(int daysRented) {
        this.movies = new ArrayList<>();
        this.daysRented = daysRented;
        this.cost = Money.parse("USD 0");
        this.rewardPoints = 0;
    }

    void add(Movie movie) {
        movies.add(movie);
        cost = cost.plus(movie.getPrice(daysRented));
        rewardPoints += movie.getRewardPoints(daysRented);
    }

    public int getDaysRented() {
        return daysRented;
    }

    ArrayList<Movie> getMovies() {
        return movies;
    }

    Money getCost() {
        return cost;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

}
