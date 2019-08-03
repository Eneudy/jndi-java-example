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

public class JndiUser {
    
    public JndiUser(){};
    
    Hashtable<String, String> environment = new Hashtable<String, String>();
    String jndiContext = "com.sun.jndi.fscontext.RefFSContextFactory";
    String folderPath = "file:C:\\Users\\Esc Group - Eneudy\\Desktop\\Open Source 2\\prueba-jndi";

    public void createAdmin(String jndiName, User user) throws NamingException{
        environment.put(Context.INITIAL_CONTEXT_FACTORY, jndiContext);
        environment.put(Context.PROVIDER_URL, folderPath);
        
        Context context = new InitialContext(environment);
        // jndi name association to a user obj
        context.bind(jndiName, user);
        System.out.println("Archivo creado");
    }
    
    public void getAdmin(String jndiName) throws NamingException{
        environment.put(Context.INITIAL_CONTEXT_FACTORY, jndiContext);
        environment.put(Context.PROVIDER_URL, folderPath);
        
        Context context = new InitialContext(environment);
        // jndi lookup method
        Object userAdmin = context.lookup(jndiName);
        System.out.println(userAdmin);
    }
}
