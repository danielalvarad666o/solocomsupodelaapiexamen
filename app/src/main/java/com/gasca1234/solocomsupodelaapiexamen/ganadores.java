package com.gasca1234.solocomsupodelaapiexamen;

public class ganadores {
    private String Nombre;
    private  String Cantidad;
    private  String urlImg;

    public ganadores(String Nombre, String Cantidad, String urlImg) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.urlImg = urlImg;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
