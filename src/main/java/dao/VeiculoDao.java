package dao;

import domain.Veiculo;

import javax.persistence.Query;
import java.util.List;

public class VeiculoDao extends GenericDAO<Veiculo> {

    public List<Veiculo> getAll(){
        return em.createNamedQuery("veiculos.getAll").getResultList();
    }

    public Veiculo veiculoByName(String modelo){
        Query query = em.createNamedQuery("veiculo.ByName");
        query.setParameter("modelo", modelo);
        return (Veiculo) query.getSingleResult();

    }
}
