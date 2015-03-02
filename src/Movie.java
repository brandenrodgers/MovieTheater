/**
 * 
 * @author branden
 * @author rodgers
 * @author rodgers.b@husky.neu.edu
 * @version 12-4-13
 * 
 */
public class Movie {

    /**
     * nams
     */
    String name;
    /**
     * duration
     */
    int duration;

    /**
     * 
     * @param name
     *            String
     * @param duration
     *            duration
     */
    Movie(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
     * 
     * @return String
     */
    public String movieToString() {
        return this.name + " at " + this.duration;
    }
}
