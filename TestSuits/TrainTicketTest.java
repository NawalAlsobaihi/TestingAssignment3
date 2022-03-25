import org.junit.Assert;
import org.junit.Test;



public class TrainTicketTest {
    TrainTicket T = new TrainTicket();
    @Test
    public void bookTicketBetween0930and4(){

        char actual = T.BookTicket("11:30:00");
        Assert.assertEquals('S', actual);
    }
    @Test
    public void bookTicket0400(){

        char actual = T.BookTicket("16:00:00");
        Assert.assertEquals('S', actual);
    }

    @Test
    public void bookTicket0930(){

        char actual = T.BookTicket("09:30:00");
        Assert.assertEquals('S', actual);
    }

    @Test
    public void bookTicket0401(){

        char actual = T.BookTicket("16:01:00");
        Assert.assertEquals('F', actual);
    }

    @Test
    public void bookTicketBetween4ad0730(){
        TrainTicket T = new TrainTicket();
        char actual = T.BookTicket("17:49:00");
        Assert.assertEquals('F', actual);
    }

    @Test
    public void bookTicket0730(){
        TrainTicket T = new TrainTicket();
        char actual = T.BookTicket("19:30:00");
        Assert.assertEquals('F', actual);
    }

    @Test
    public void bookTicket0731(){

        char actual = T.BookTicket("19:31:00");
        Assert.assertEquals('S', actual);
    }

    @Test
    public void bookTicketBetween0730and1005(){

        char actual = T.BookTicket("20:45:00");
        Assert.assertEquals('S', actual);
    }

    @Test
    public void bookTicket1005(){

        char actual = T.BookTicket("22:05:00");
        Assert.assertEquals('S', actual);
    }

    @Test
    public void bookTicketOtherTime(){

        char actual = T.BookTicket("00:00:00");
        Assert.assertEquals('F', actual);
    }


}