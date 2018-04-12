import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;
public class FoobarTest {
    @Test
    public void mytest() {
        Foobar f = new Foobar();

        assert(15==f.getfifteen());
    }
    public static junit.framework.Test suite(){
       return new JUnit4TestAdapter(FoobarTest.class);
    }
}
