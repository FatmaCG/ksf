package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    // ConfigurationReader classını .properties dosyasını okumak için oluşturuyoruz.
    static Properties properties;
    // static yaptık çünkü nesne oluşturmadan doğrudan erişim sağlamak istedik
    static {
         //Herseyden once calismasini istedigimiz durumlari static block icine yazariz
        // okumak istediğimiz configuration.properties file'ın dosya yolu
        // C:\Users\isimsiz\IdeaProjects\TestNGProje\configuration.properties
        String path = "configuration.properties";
        // dene - hata varsa yakala.
        // bu işlemi DENE eğer hata alırsan, PROGRAMI DURDURMA
        try {
            // okumak istediğiniz dosyanın path(adres)'ini yazıyorsun
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            // fileInputStream'dan ürettiğim file dosyası burada, bunu kullanabilirsin
            properties.load(file);
        } catch (Exception e) {
        }
    }

    //  properties.getProperty("username")  --> manager2
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
    // ConfigurationReader.getProperty("fb_email") --- > hamza@techproed.com
}
