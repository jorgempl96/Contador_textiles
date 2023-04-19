/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JORGE PEREZ
 */
public class materiales extends datos{
    
    private String insumo;
    private Integer cantidad;
    private Boolean automatico;

    public materiales(String insumo, Integer cantidad, Boolean automatico, String quirofano, String turno, String fecha, String responsable, String ruta) {
        super(quirofano, turno, fecha, responsable, ruta);
        this.insumo = insumo;
        this.cantidad = cantidad;
        this.automatico = automatico;
    }

    public String getInsumo() {
        return insumo;
    }

    public void setInsumo(String insumo) {
        this.insumo = insumo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getAutomatico() {
        return automatico;
    }

    public void setAutomatico(Boolean automatico) {
        this.automatico = automatico;
    }
    
    
    
    
    
}
