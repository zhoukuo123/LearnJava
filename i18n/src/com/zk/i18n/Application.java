package com.zk.i18n;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class Application {
    public static void say() {
        Properties properties = new Properties();
        String configPath = Application.class.getResource("/config.properties").getPath();
        try {
            String path = URLDecoder.decode(configPath, "UTF-8");
            properties.load(new FileInputStream(path));
            String language = properties.getProperty("language");
            Class<?> languageClass = Class.forName(language);
            I18N i18N = (I18N) languageClass.newInstance();
            String say = i18N.say();
            System.out.println(say);
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.say();
    }
}
