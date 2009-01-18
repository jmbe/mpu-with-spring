package mpu.translation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
@Component
public class TranslationFacade {

    @Autowired
    private TranslationRepository translationRepository;

    public Translation create(final String phrase) {
        Translation translation = new Translation();
        translation.setPhrase(phrase);
        translationRepository.create(translation);
        return translation;
    }

}
