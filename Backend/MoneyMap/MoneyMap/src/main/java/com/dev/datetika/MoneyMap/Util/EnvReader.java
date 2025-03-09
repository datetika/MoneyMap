package com.dev.datetika.MoneyMap.Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EnvReader {
    private static final String ENV_FILE = "src\\main\\java\\com\\dev\\datetika\\MoneyMap\\Util\\secretkey_par.env"; // Ruta al archivo .env

    public static String getEnvVariable(String key) {
        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader(ENV_FILE);
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorna el valor de la propiedad o null si no existe
        return properties.getProperty(key);
    }
}
