package tmr.design.pattern.strategy;

import tmr.design.pattern.strategy.movie.Movie;
import tmr.design.pattern.strategy.movie.price.ClassicPrice;
import tmr.design.pattern.strategy.movie.reward.DailyReward;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("The Good The Bad & The Ugly", new ClassicPrice(), new DailyReward());
        Rental rental = new Rental(2);
        rental.add(movie);

        Customer customer = new Customer("Wylie Burp", rental);
        System.out.print(customer.generateStatement());
    }

}
