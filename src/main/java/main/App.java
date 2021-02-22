package main;

import dao.GenericDAO;
import dao.VeiculoDao;
import domain.Acessorio;
import domain.Concessionaria;
import domain.Endereco;
import domain.Veiculo;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        GenericDAO<Acessorio> acessorioDao = new GenericDAO<>();
        GenericDAO<Veiculo> veiculoDao = new GenericDAO<>();
        GenericDAO<Concessionaria> concessionariaDao = new GenericDAO<>();

        Acessorio arCondicionado = new Acessorio();
        arCondicionado.setTipo("Ar-condicionado");

        Acessorio gps = new Acessorio();
        gps.setTipo("GPS");

        Acessorio multimedia = new Acessorio();
        multimedia.setTipo("Multimedia");

        Acessorio tetoSolar = new Acessorio();
        tetoSolar.setTipo("Teto-Solar");

    /*    acessorioDao.saveOrUpdate(tetoSolar);
        acessorioDao.saveOrUpdate(arCondicionado);
        acessorioDao.saveOrUpdate(gps);
        acessorioDao.saveOrUpdate(multimedia);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Major Jose Marques");
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.setEndereco(endereco);
        concessionaria.setNome("Veículos CZ");
        concessionariaDao.saveOrUpdate(concessionaria);

        Concessionaria c = concessionariaDao.findById(Concessionaria.class, 1l);

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("VW");
        veiculo.setModelo("Tiguan");
        arCondicionado = acessorioDao.findById(Acessorio.class, 2l);
        tetoSolar = acessorioDao.findById(Acessorio.class, 1l);
        veiculo.setAcessorios(Arrays.asList(arCondicionado, tetoSolar));
        veiculo.setConcessionaria(c);

        veiculoDao.saveOrUpdate(veiculo);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setMarca("Ford");
        veiculo2.setModelo("Mustang");
        multimedia = acessorioDao.findById(Acessorio.class, 4l);
        veiculo2.setAcessorios(Arrays.asList(multimedia, arCondicionado));
        veiculo2.setConcessionaria(c);

        veiculoDao.saveOrUpdate(veiculo2);

        */

       /* Veiculo veiculoRemove = veiculoDao.findById(Veiculo.class, 2l);
        multimedia = acessorioDao.findById(Acessorio.class, 3l);
        veiculoRemove.getAcessorios().add(multimedia);
        veiculoDao.saveOrUpdate(veiculoRemove);*/



       /* multimedia = acessorioDao.findById(Acessorio.class, 3l);
        Acessorio finalMultimedia = multimedia;
        multimedia.getVeiculos().forEach(v -> v.getAcessorios().remove(finalMultimedia));
        acessorioDao.delete(multimedia);*/

        VeiculoDao veiculosDao = new VeiculoDao();

       // List<Veiculo> veiculos = veiculosDao.getAll();

       // veiculos.forEach(veiculo -> System.out.println(veiculo));

        System.out.println(veiculosDao.veiculoByName("Mustang"));

    }
}
