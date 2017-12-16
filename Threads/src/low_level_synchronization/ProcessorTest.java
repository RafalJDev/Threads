package low_level_synchronization;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by Jaszczynski.Rafal on 19.11.2017.
 */
@RunWith(JUnit4.class)
public class ProcessorTest {



    @Test
    public void WhenNothingThenNotPassed () {
        Assert.assertNotNull("Nothing", null);
    }


}
