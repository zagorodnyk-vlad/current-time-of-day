

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.zagorodnyk.zagorodnyk.CurrentDate;
import org.junit.Assert;
import org.junit.Test;


public class CurrentDateTest {

    private final CurrentDate currentDate = new CurrentDate();
    private final Locale currentLocale = new Locale("en");

    @Test
    public void morning() {
        Double value = 07.05;
        String answer = currentDate.current(value,currentLocale);
        Assert.assertEquals("Good morning, World!", answer);

    }

    @Test
    public void day() {
        Double value = 14.05;
        String answer = currentDate.current(value,currentLocale);
        Assert.assertEquals("Good day, World!", answer);

    }

    @Test
    public void evening() {
        Double value = 19.05;
        String answer = currentDate.current(value,currentLocale);
        Assert.assertEquals("Good evening, World!", answer);

    }

    @Test
    public void night() {
        Double value = 23.05;
        String answer = currentDate.current(value,currentLocale);
        Assert.assertEquals("Good night, World!", answer);

    }

    @Test
    public void dowbleConvert() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("HH.mm");
        Date date = dateFormat.parse("07.17");
        Double expected = Double.parseDouble(dateFormat.format(date));
        Double actual = 07.17;
        Assert.assertEquals(expected, actual);

    }

}
