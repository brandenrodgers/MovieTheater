/**
 * @author branden
 * @author rodgers
 * @author rodgers.b@husky.neu.edu
 * @version 12-4-13
 * 
 */
public class Price {

    /**
     * type
     */
    String type;
    /**
     * amount
     */
    int amount;

    /**
     * 
     * @param type
     *            String
     * @param amount
     *            int
     */
    Price(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    /**
     * 
     * @return String
     */
    public String priceToString() {
        return type + "'s pay " + amount;
    }
}
