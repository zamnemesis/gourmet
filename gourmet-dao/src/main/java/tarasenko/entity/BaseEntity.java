package tarasenko.entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

/**
 * @author tarasenko
 * @since 21.07.2016
 */
@MappedSuperclass
public abstract class BaseEntity {

    @PrePersist
    public void prePersist() {
        if (getId() == null) {
            setId(UUID.randomUUID().toString());
        }
    }

    protected abstract String getId();

    protected abstract void setId(String id);
}
