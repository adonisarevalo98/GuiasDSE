/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_dse;

import desktop_app.opciones;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 *
 * @author Adonis
 */
public class operaciones {

    private Session sesion;
    
    private void iniciarOperacion(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession(); 
        sesion.getTransaction().begin();
    }
    private void terminarOperacion(){
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public int guardarFederado(Federados federado){
        int id=0;
        iniciarOperacion();
        id = (int)sesion.save(federado);
        terminarOperacion();
        return id;
    }
    public void actualizarFederado (Federados federado){
        iniciarOperacion();
        sesion.update(federado);
        terminarOperacion();
    }
    public void eliminarFederado (Federados federado){
        iniciarOperacion ();
        sesion.delete(federado);
        terminarOperacion();
    }
    
    public Federados obtenerFederado (int idFederado){
        Federados federado =null;
        iniciarOperacion();
        federado = (Federados) sesion.get(Federados.class, idFederado);
        terminarOperacion();
        return federado;
    }
    
    public List<Federados> ListaDeFederados(){
        List<Federados> listaFederado = null;
        iniciarOperacion();
        listaFederado = sesion.createQuery("from Federados").list();
        terminarOperacion();
        return listaFederado;
    }

    public operaciones() {
    }
    public static void main(String[] args) {
        // TODO code application logic here
         opciones v= new opciones();
        v.setVisible(true);
    }
    
}
