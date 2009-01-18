package mpu.account.test.util;

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
@ContextConfiguration(locations = { "/account-context.xml" })
@TransactionConfiguration(transactionManager = "accountTransactionManager")
@Transactional
public abstract class AccountServiceTestBase extends
        AbstractTransactionalJUnit4SpringContextTests {

    @PersistenceContext(unitName = "Account")
    protected EntityManager entityManager;

}
