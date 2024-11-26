package mx.uv.practica12;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Color {
    @Id
    // se define la estrategia de generación incremental de ID mediante
    // GenerationType.Auto
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreColor;
    private String valorColor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public String getValorColor() {
        return valorColor;
    }

    public void setValorColor(String valorColor) {
        this.valorColor = valorColor;
    }
}