package FanPassStepDefs;

import FanPassPages.FanPass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by udit on 17/09/18.
 */
public class Hooks extends FanPass{


    @Before
    public void begin(){
        setup();
    }

    @After
    public void tearDown(){
        if(null != getDriver())
            getDriver().quit();
    }
}
