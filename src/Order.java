/**
 * @author branden
 * @author rodgers
 * @author rodgers.b@husky.neu.edu
 * @version 12-4-13
 * 
 */
public class Order {

    /**
     * show
     */
    Show show;
    /**
     * numAdult
     */
    int numAdult;
    /**
     * numChild
     */
    int numChild;
    /**
     * numSenior
     */
    int numSenior;

    /**
     * 
     * @param show
     *            Show
     * @param numAdult
     *            int
     * @param numChild
     *            int
     * @param numSenior
     *            int
     */
    Order(Show show, int numAdult, int numChild, int numSenior) {
        this.show = show;
        this.numAdult = numAdult;
        this.numChild = numChild;
        this.numSenior = numSenior;
    }

}
