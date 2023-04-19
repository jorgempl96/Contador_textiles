/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JORGE PEREZ
 */
public class datos {
    private String quirofano;
    private String turno;
    private String fecha;
    private String responsable;
    private String ruta;

    public datos(String quirofano, String turno, String fecha, String responsable, String ruta) {
        this.quirofano = quirofano;
        this.turno = turno;
        this.fecha = fecha;
        this.responsable = responsable;
        this.ruta = ruta;
    }

    public String getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(String quirofano) {
        this.quirofano = quirofano;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
   
    
    

    
    
}
