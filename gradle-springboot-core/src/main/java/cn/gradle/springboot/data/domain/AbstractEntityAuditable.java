package cn.gradle.springboot.data.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Sayid on 2016/12/27.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntityAuditable<ID extends Serializable> extends AbstractEntity<ID> {

    private static final long serialVersionUID = 7479587631743834284L;

    private DateTime createdDate;
    private DateTime lastModifiedDate;

    /**
     * Returns the creation date of the entity.
     *
     * @return the createdDate
     */
    @CreatedDate
    public DateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the creation date of the entity.
     *
     * @param creationDate the creation date to set
     */
    public void setCreatedDate(final DateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Returns the date of the last modification.
     *
     * @return the lastModifiedDate
     */
    @LastModifiedDate
    public DateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the date of the last modification.
     *
     * @param lastModifiedDate the date of the last modification to set
     */
    public void setLastModifiedDate(final DateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
