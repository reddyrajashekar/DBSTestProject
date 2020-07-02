package Config;

import io.cucumber.java.bs.I;

import java.io.*;
import java.util.Properties;

public class ReadProperties {
    private Properties prop;
    public ReadProperties() throws IOException {
        try {
            //BufferedReader reader=new BufferedReader(new FileReader("Config/Config.properties"));
            File f=new File("Config/Config.properties");
            FileInputStream fis=new FileInputStream(f);
            try {
                prop.load(fis);
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
    public String getUrl(){
        String url= prop.getProperty("URL");
        if(url!=null)
            return url;
        else throw new RuntimeException("url not found");
    }
}

