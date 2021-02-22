package domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "veiculos.getAll", query= "select v from Veiculo v"),
        @NamedQuery(name = "veiculo.ByName", query = "select v from Veiculo v where v.modelo=:modelo")
})
public class Veiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;

    @ManyToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE})
    @JoinTable(name="veiculo_acessorio", joinColumns=
            {@JoinColumn(name="veiculo_id")}, inverseJoinColumns=
            {@JoinColumn(name="acessorio_id")})
    private List<Acessorio> acessorios;

    @ManyToOne
    private Concessionaria concessionaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", acessorios=" + acessorios +
                '}';
    }
}
