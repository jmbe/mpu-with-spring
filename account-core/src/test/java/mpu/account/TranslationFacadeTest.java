package mpu.account;

import static org.junit.Assert.*;
import mpu.account.test.util.AccountServiceTestBase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TranslationFacadeTest extends AccountServiceTestBase {

    @Autowired
    private AccountFacade accountFacade;

    @Test
    public void create() {
        Account translation = accountFacade.create("test");
        assertNotNull(translation);
        assertNotNull(translation.getId());
    }

}
