/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jahaziel1999
 */
public class EjemploHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session session= HibernateUtil.getSessionFactory().openSession();
        System.out.println("Se conecto");
        Transaction transaction=session.beginTransaction();
        System.out.println("Inicio Transaccion");
        
        Persona p=new Persona();
        p.setClave("010");
        p.setNombre("Juann");
        p.setDireccion("Av5");
        p.setTelefono("272");
        
        session.save(p);
        
        transaction.commit();
        System.out.println("Fin de Transaccion");
        session.close();
    }
    
}
