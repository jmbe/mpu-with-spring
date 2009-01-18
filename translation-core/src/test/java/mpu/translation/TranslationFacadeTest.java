package mpu.translation;

import static org.junit.Assert.*;
import mpu.translation.test.util.TranslationServiceTestBase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TranslationFacadeTest extends TranslationServiceTestBase {

    @Autowired
    private TranslationFacade translationFacade;

    @Test
    public void create() {
        Translation translation = translationFacade.create("test");
        assertNotNull(translation);
    }

}
