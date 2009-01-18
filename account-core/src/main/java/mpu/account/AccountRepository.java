package mpu.account;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    /** Logger for this class. */
    private static final Logger log = LoggerFactory
            .getLogger(AccountRepository.class);

    private EntityManager entityManager;

    @PersistenceContext(unitName = "Account")
    public void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(final Account account) {
        entityManager.persist(account);
    }

}
