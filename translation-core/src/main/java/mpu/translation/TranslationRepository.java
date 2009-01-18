package mpu.translation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TranslationRepository {

    /** Logger for this class. */
    private static final Logger log = LoggerFactory
            .getLogger(TranslationRepository.class);

    private EntityManager entityManager;

    @PersistenceContext(unitName = "Translation")
    public void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(final Translation translation) {
        entityManager.persist(translation);
    }

}
