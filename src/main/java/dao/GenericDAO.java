package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO <T>{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Concessionaria_PU");
    EntityManager em = emf.createEntityManager();

    public void saveOrUpdate(T entity){
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        //em.close();
    }

    public T findById(Class<T> clazz, Long id){
        em.getTransaction().begin();
        T object = em.find(clazz, id);
        em.getTransaction().commit();
       // em.close();
        return object;
    }

    public void delete(T entity){

         em.getTransaction().begin();
         em.remove(entity);
         em.getTransaction().commit();
         //em.close();

    }
}
