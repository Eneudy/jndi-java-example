/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jndiexample;
import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

/**
 *
 * @author Esc Group - Eneudy
 */
public class User implements Referenceable{
    private String name;
    
    public User(){}
    
    public User(String name){
        this.name = name;
    }
    
    public String getName(){ return name;}
    
    public void setName(String name){ this.name = name; }

    @Override
    public Reference getReference() throws NamingException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        Reference reference = new Reference(User.class.getName());
        reference.add(new StringRefAddr("name", this.name));
        return reference;
    }
    
}
