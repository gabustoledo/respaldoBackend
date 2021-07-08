package com.mingeso.backend.repositories;

import com.mingeso.backend.models.Diplomado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class DiplomadoRepositoryImp implements DiplomadoRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDiplomados() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM diplomado").executeScalar(Integer.class);
        }
        return total;
    }
    
    // CREATE
    @Override
    public Diplomado createDiplomado(Diplomado diplomado) {
        try(Connection conn = sql2o.open()){
            int insertedId = (int) conn.createQuery("INSERT INTO diplomado (nombre, objetivo) VALUES (:diplomadoNombre,:diplomadoObjetivo)", true)
                                        .addParameter("diplomadoNombre", diplomado.getNombre())
										.addParameter("diplomadoObjetivo", diplomado.getObjetivo())
                    .executeUpdate().getKey();
										diplomado.setId(insertedId);
            return diplomado;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }  
    }

    // READ
    @Override
    public List<Diplomado> getAllDiplomados() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from diplomado")
                    .executeAndFetch(Diplomado.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    // UPDATE
    @Override
    public void updateDiplomado(Diplomado diplomado) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("Update diplomado Set nombre = :diplomadoNombre, objetivo = :diplomadoObjetivo WHERE id = :Id")
										.addParameter("Id", diplomado.getId())
										.addParameter("diplomadoNombre", diplomado.getNombre())
										.addParameter("diplomadoObjetivo", diplomado.getObjetivo())
                    .executeUpdate();
                   
        }catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
    // DELETE
    @Override
    public void deleteDiplomado(@PathVariable Integer Id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM diplomado WHERE id = :id")
                    .addParameter("id", Id)
                    .executeUpdate();
            System.out.println("Diplomado eliminado");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
}
