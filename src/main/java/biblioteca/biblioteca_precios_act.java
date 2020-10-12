package biblioteca;


public class biblioteca_precios_act {

    // Declaración de datos.

    private int farenheith;
    private int revival;
    private int elAlquimista;
    private int elpoder;
    private int despertar;


    // Constructor

    public biblioteca_precios_act()
    {
        elAlquimista = 45000;
        revival = 22000;
        farenheith = 7000;
        elpoder = 88000;
        despertar = 156000;
    }

    // Accesadores

    public int getFarenheith()
    {
        return farenheith;
    }

    public int getRevival()
    {
        return revival;
    }

    public int getElAlquimista() { return elAlquimista; }

    public int getElpoder() { return elpoder; }

    public int getDespertar() { return despertar; }


}