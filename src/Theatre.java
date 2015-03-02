/**
 * @author branden
 * @author rodgers
 * @author rodgers.b@husky.neu.edu
 * @version 12-4-13
 * 
 */
public class Theatre {

    /**
     * name
     */
    String name;
    /**
     * capacity
     */
    int capacity;
    /**
     * currentCapacity
     */
    int currentCapacity = 0;

    /**
     * 
     * @param name
     *            String
     * @param capacity
     *            int
     * @param currentCapacity
     *            int
     */
    Theatre(String name, int capacity, int currentCapacity) {
        this.name = name;
        this.capacity = capacity;
        this.currentCapacity = currentCapacity;
    }

    /**
     * 
     * @return String
     */
    public String theatreToString() {
        return name + " has a capacity of " + capacity + " and currently has "
                + currentCapacity + " people in it";
    }
}
