import static org.junit.Assert.*;



import org.junit.Test;

/** 
* @author branden
* @author rodgers
* @author rodgers.b@husky.neu.edu
* @version 12-4-13
*
*/
public class ExamplesTicketSales {

    /**
     * test
     */
    @Test
    public void test() {

        // Movie Strings
        String movie1 = "Harry Potter:102";
        String movie2 = "Great Expectations:115";


        // Theatre Strings
        String theatre1 = "A:300";
        String theatre2 = "B:90";
        String theatre3 = "C:500";


        // Show Strings
        String show1 = "1,1,960";
        String show2 = "1,1,1080";
        String show3 = "1,1,1200";
        String show4 = "1,3,1020";
        String show5 = "1,3,1140";
        String show6 = "2,2,990";
        String show7 = "2,2,1210";

        // Price Strings
        String price1 = "Adult:10";
        String price2 = "Child:7";
        String price3 = "Senior:8";

        // sample prices


        TicketSales sales = new TicketSales();

        // movies.add(HarryPotter);
        // movies.add(GreatExpectations);
        // theatres.add(A);
        // theatres.add(B);
        // theatres.add(C);

        sales.initCinema("cinema.txt");

        // /////////////////////////////////////////////////////////////////
        // Movie Tests

        // Test for Find Movie Name
        assertTrue("test FindMovieName1",
                sales.findMovieName(movie1).equals("Harry Potter"));
        assertTrue("test FindMovieName2",
                sales.findMovieName(movie2).equals("Great Expectations"));

        // Test For Find Movie Duration
        assertEquals("test FindMovieDuration1",
                sales.findMovieDuration(movie1), 102);
        assertEquals("test FindMovieduration2",
                sales.findMovieDuration(movie2), 115);

        // Test For Create Movie
        assertTrue("test createMovie1",
                sales.createMovie(movie1).name.equals("Harry Potter"));
        assertTrue("test createMovie2",
                sales.createMovie(movie2).name.equals("Great Expectations"));
        assertEquals("test createMovie3", sales.createMovie(movie1).duration,
                102);
        assertEquals("test createMovie4", sales.createMovie(movie2).duration,
                115);

         //Testing the print out
        System.out.println(sales.createMovie(movie1).movieToString());
        System.out.println(sales.createMovie(movie2).movieToString());
        
        
         ///////////////////////////////////////////////////////////////
         //Theatre Tests
        
        
         //Test for Find Theatre Name
        assertTrue("test FindTheatreName1",
                sales.findTheatreName(theatre1).equals("A"));
        assertTrue("test FindTheatreName2",
                sales.findTheatreName(theatre2).equals("B"));
        assertTrue("test FindTheatreName3",
                sales.findTheatreName(theatre3).equals("C"));

         //Test For Find Theatre Capacity
        assertEquals("test FindTheatreCapacity1",
                sales.findTheatreCapacity(theatre1), 300);
        assertEquals("test FindTheatreCapacity2",
                sales.findTheatreCapacity(theatre2), 90);

         //Test For Create Theatre
        assertTrue("test createTheatre1",
                sales.createTheatre(theatre1).name.equals("A"));
        assertTrue("test createTheatre2",
                sales.createTheatre(theatre2).name.equals("B"));
        assertTrue("test createTheatre3",
                sales.createTheatre(theatre3).name.equals("C"));
        assertEquals("test createTheatre4",
                sales.createTheatre(theatre1).capacity, 300);
        assertEquals("test createTheatre5",
                sales.createTheatre(theatre2).capacity, 90);
        assertEquals("test createTheatre6",
                sales.createTheatre(theatre3).capacity, 500);

         //Testing the print out
        System.out.println(sales.createTheatre(theatre1).theatreToString());
        System.out.println(sales.createTheatre(theatre2).theatreToString());
        System.out.println(sales.createTheatre(theatre3).theatreToString());
        
        
         ///////////////////////////////////////////////////////////////////
         //Show Tests
        
         //test for Find Movie
        assertTrue("test findMovie1",
                sales.movies.get(0).name.equals("Harry Potter"));
        assertTrue("test findMovie2",
                sales.findMovie(show6).name.equals("Great Expectations"));

         //test for Find Theatre
        assertTrue("test findTheatre1",
                sales.findTheatre(show1).name.equals("A"));
        assertTrue("test findTheatre2",
                sales.findTheatre(show4).name.equals("C"));
        assertTrue("test findTheatre3",
                sales.findTheatre(show6).name.equals("B"));

         //Test for Find Showtimes
        assertEquals("test findShowtime1", sales.findShowtime(show1), 960);
        assertEquals("test findShowtime2", sales.findShowtime(show2), 1080);
        assertEquals("test findShowtime3", sales.findShowtime(show3), 1200);
        assertEquals("test findShowtime4", sales.findShowtime(show4), 1020);
        assertEquals("test findShowtime5", sales.findShowtime(show5), 1140);
        assertEquals("test findShowtime6", sales.findShowtime(show6), 990);
        assertEquals("test findShowtime7", sales.findShowtime(show7), 1210);
        
        

        //Testing the print out
        System.out.println(sales.createShow(show1).showToString());
        System.out.println(sales.createShow(show2).showToString());
        System.out.println(sales.createShow(show3).showToString());
        System.out.println(sales.createShow(show4).showToString());
        System.out.println(sales.createShow(show5).showToString());
        System.out.println(sales.createShow(show6).showToString());
        System.out.println(sales.createShow(show7).showToString());
        
        
    ////////////////////////////////////////////////////////////
        //Prices tests
        
        //Test for findPriceType
        assertTrue("test findPriceType1",
                sales.findPriceType(price1).equals("Adult"));
        assertTrue("test findPriceType2",
                sales.findPriceType(price2).equals("Child"));
        assertTrue("test findPriceType3",
                sales.findPriceType(price3).equals("Senior"));

        //Test for findPriceAmount
        assertEquals("test findPriceType1", sales.findPriceAmount(price1),
                10);
        assertEquals("test findPriceType2", sales.findPriceAmount(price2),
                7);
        assertEquals("test findPriceType3", sales.findPriceAmount(price3),
                8);
        
         //Testing the Print out
        System.out.println(sales.createPrice(price1).priceToString());
        System.out.println(sales.createPrice(price2).priceToString());
        System.out.println(sales.createPrice(price3).priceToString());
        
        assertTrue("movieNameExists test",
                sales.movieNameExists("Harry Potter"));

        assertEquals("test findnumAdult",
                sales.findNumAdult("1,1,960,2,3,0"), 2);
        assertEquals("test findnumChild",
                sales.findNumChild("1,1,960,2,3,0"), 3);
        assertEquals("test findnumSenior",
                sales.findNumSenior("1,1,960,2,3,0"), 0);

         //TicketSales.manualCreateOrder("1,1,960,2,3,0");
        
        sales.processOrders("orders.txt");

        System.out.println(sales.reportSales());
        System.out.println(sales.managerReport());
        // //////////////////////////////////////////////////////////////////
    }

}
