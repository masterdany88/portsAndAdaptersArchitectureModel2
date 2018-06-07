package pl.korbeldaniel.erp2.data.dao;

import pl.korbeldaniel.erp2.data.entity.ContactEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContactDao {

    @PersistenceContext(unitName = "forge-default")
    private EntityManager em;

    public List<ContactEntity> getAllContacts() {
        return em.createNamedQuery(ContactEntity.ALL_CONTACTS_QUERY, ContactEntity.class).getResultList();
    }

    public void create(final ContactEntity newContactEntity) {
        em.persist(newContactEntity);
    }

    public void update(final ContactEntity contact) {
        em.merge(contact);
    }

    public void delete(final Long id) {
        final ContactEntity contact = em.find(ContactEntity.class, id);
        if (contact != null) {
            em.remove(contact);
        } else {
            throw new IllegalArgumentException(
                    "The given id, " + id + ", was not a key for any " + ContactEntity.class.getSimpleName());
        }
    }

}
