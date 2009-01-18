package mpu.translation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;

    private String phrase;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(final String phrase) {
        this.phrase = phrase;
    }

    public Long getId() {
        return this.id;
    }

}
