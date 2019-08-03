/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jndiexample;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;


/**
 *
 * @author Esc Group - Eneudy
 */
public class JndiExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        // TODO code application logic here
        
        String adminUserName = "AdministradorUser";
        User adminUser = new User(adminUserName);
        
        // search obj by this name
        String jndiName = "admin user";
        JndiUser jndiObj = new JndiUser();
        
        // create admin user in file using jndi
        //jndiObj.createAdmin(jndiName, adminUser);
        
        // search admin user with jndi
        jndiObj.getAdmin(jndiName);
        
    }
    
}
