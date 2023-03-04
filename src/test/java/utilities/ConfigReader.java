package utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    // This class reads the configuration.properties file
    // properties file i okumak icin properties object'i kullanilir
    private static Properties properties;
    //      static block :
    static {
//        data cekmek istedigim dosyanin path'i
        String path = "configuration.properties";
        try {
//            configuration.property dosyasini acar
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);
//            properties object'ini instantiate ediyoruz
            properties = new Properties();
//            configuration.properties dosyasindaki datalari yukler
            properties.load(fileInputStream);
//            file input stream'i kapatiyoruz
            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }
}