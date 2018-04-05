package com.hacksite.bmwproyect;

public class Prediccion {
    private long velocidad;
    private long aceleracion;
    private long distancia;
    private long bateria;

    public Prediccion() {
        //Es obligatorio incluir constructor por defecto
    }

    public Prediccion(long velocidad, long aceleracion, long distancia, long bateria) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.distancia = distancia;
        this.bateria = bateria;
    }

    public long getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(long velocidad) {
        this.velocidad = velocidad;
    }

    public long getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(long aceleracion) {
        this.aceleracion = aceleracion;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    public long getBateria() { return bateria; }

    public void setBateria(long bateria) { this.bateria = bateria; }

    @Override
    public String toString() {
        return "Prediccion{" +
                "velocidad='" + velocidad + '\'' +
                ", aceleracion=" + aceleracion +
                ", distancia=" + distancia +
                ", bateria=" + bateria +
                '}';
    }
}
