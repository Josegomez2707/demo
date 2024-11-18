package com.licocastillo.ecommerce.demo;

public class descuento extends producto {
    private float porcentaje;
    private String fechaInicio;
    private String fechaFin;

    // Constructor
    public descuento(int idProducto, String nombreProducto, String descripcion, float precio, int stock, String categoria,
                     float porcentaje, String fechaInicio, String fechaFin) {
        super(idProducto, nombreProducto, descripcion, precio, stock, categoria);
        this.porcentaje = porcentaje;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método adicional
    public String mostrarDescuento() {
        return "Descuento: " + porcentaje + "%, válido desde " + fechaInicio + " hasta " + fechaFin;
    }

    // No es necesario implementar la interfaz IProducto de nuevo
    @Override
    public String obtenerDetalles() {
        return "Descuento en " + getNombreProducto() + ": " + porcentaje + "%, Precio Original: $" + getPrecio() +
                ", Precio con descuento: $" + obtenerPrecio();
    }

    @Override
    public float obtenerPrecio() {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}
