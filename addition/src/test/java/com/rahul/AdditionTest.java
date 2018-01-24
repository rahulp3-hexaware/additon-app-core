import com.rahul.Addition;
import org.junit.Test;


public class AdditionTest {
    @Test
    public void testAdd()
    {
        int a=10;
        int b=20;
        Addition addobj = new Addition();
        int c = addobj.add(a,b);
        System.out.println(c);
    }
}