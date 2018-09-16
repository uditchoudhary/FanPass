package FanPassUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by udit on 17/09/18.
 */
public class FanPassUtil {

    public static String getConfigValue(String key){
        Properties config = new Properties();

        try {
            String filename = "config.properties";
            config.load(new FileInputStream("target/classes/envProfiles/"+filename));
        } catch (Throwable t) {
            System.out.print("Issue loading properties file");
            t.printStackTrace();
        }
        return config.getProperty(key);

    }
}
