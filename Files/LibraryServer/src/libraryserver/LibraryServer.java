/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryserver;

/**
 *
 * @author murilo.erhardt
 */
public class LibraryServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Singleton st = Singleton.getInstance();
        st.getSomeThing();
        
        
    }
    
}