/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author sebas
 */
public class Ordenador {
    // atributos
    
    private int id; 
    private String descripcion; 
    private int tiempo;
    private boolean completado;
            
            public Ordenador() {
                
            }
            public Ordenador(int id, String descripcion, int tiempo) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.completado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
        public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
     
       
    



