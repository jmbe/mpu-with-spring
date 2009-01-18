package mpu.translation.test.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Base class for account service transactional tests.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/translation-context.xml" })
@TransactionConfiguration(transactionManager = "translationTransactionManager")
@Transactional
public abstract class TranslationServiceTestBase extends
        AbstractTransactionalJUnit4SpringContextTests {

    @PersistenceContext(unitName = "Translation")
    protected EntityManager entityManager;

}
