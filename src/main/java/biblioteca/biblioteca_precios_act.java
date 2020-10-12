package biblioteca;


public class biblioteca_precios_act {

    // Declaración de datos.

    private int farenheith;
    private int revival;
    private int elAlquimista;

    // Constructor

    public biblioteca_precios_act()
    {
        elAlquimista = 45000;
        revival = 12000;
        farenheith = 5000;
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


}