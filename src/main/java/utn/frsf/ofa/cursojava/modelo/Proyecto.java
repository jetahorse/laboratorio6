/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author federicoaugustotschopp
 */
@Entity
public class Proyecto {

    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    private Double presupuestoMaximo;
    
    @Override
    public String toString() {
        return "Proyecto{" + "id=" + Integer.toString(id) + ", nombre=" + nombre + ", descripcion=" + descripcion + ", presupuestoMaximo=" + String.valueOf(presupuestoMaximo) + '}';
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPresupuestoMaximo() {
        return presupuestoMaximo;
    }

    public void setPresupuestoMaximo(Double presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }
    
    
}
