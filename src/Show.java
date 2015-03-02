/**
 * @author branden
 * @author rodgers
 * @author rodgers.b@husky.neu.edu
 * @version 12-4-13
 * 
 */
public class Show {

    /**
     * movie
     */
    Movie movie;
    /**
     * theatre
     */
    Theatre theatre;
    /**
     * showtime
     */
    int showtime;

    /**
     * 
     * @param movie
     *            Movie
     * @param theatre
     *            Theatre
     * @param showtime
     *            int
     */
    Show(Movie movie, Theatre theatre, int showtime) {
        this.movie = movie;
        this.theatre = theatre;
        this.showtime = showtime;
    }

    /**
     * 
     * @return String
     */
    public String showToString() {
        return this.movie.name + " is playing in " + this.theatre.name + " at "
                + showtime;
    }


}
