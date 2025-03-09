package com.dev.datetika.MoneyMap.backend;

import com.dev.datetika.MoneyMap.Util.EnvReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnvReaderTest {

    @Test
    public void testGetEnvVariable() {
        // Suponiendo que tienes un archivo .env en la raíz con la variable SECRET_KEY
        String secretKey = EnvReader.getEnvVariable("SECRET_KEY");

        // Comprobar que la clave secreta es la esperada
        assertNotNull(secretKey, "La clave secreta no debe ser nula.");
        assertEquals("miClaveSecreta", secretKey, "La clave secreta no es la esperada.");
    }

    @Test
    public void testEnvVariableNotFound() {
        // Intentar obtener una variable que no existe
        String nonExistentKey = EnvReader.getEnvVariable("NON_EXISTENT_KEY");

        // Comprobar que la variable no existe, debe retornar null
        assertNull(nonExistentKey, "La clave no existente debería retornar null.");
    }
}
