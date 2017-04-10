/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Nicol
 */
import java.util.ArrayList;
import java.util.List;
import serverpojo.listaCliente;
public class Clientes {
    
    public static List<listaCliente> clientList = new ArrayList();
    int id=1638;
    
    public void dbClientes(){
        clientList.add(new listaCliente("Cursit","Moraga",id++));
        clientList.add(new listaCliente("Elizabeth","Cano",id++));
        clientList.add(new listaCliente("Pablo","Marin",id++));
        clientList.add(new listaCliente("David","Salas",id++));
        clientList.add(new listaCliente("Fabian","Marin",id++));
    }
    
}
