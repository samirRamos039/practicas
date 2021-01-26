/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rzagza
 */
public class Modelo {
    //KKKKKKJ
    String numero;
    String nombreProducto;
    int precio;
    String proveedor;
    String vendedor;

    public Modelo(String numero, int id) {
        this.numero = numero;
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
