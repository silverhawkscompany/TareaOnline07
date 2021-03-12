package estructuraDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.IO_ES;

/**
 *
 * @author Daniel Díaz González
 * @version 1.0
 */
abstract public class Productos {

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected int unidades;

    /**
     * Método constructor
     *
     * @param codigo Código del Producto
     * @param nombre Nombre del Producto
     * @param descripcion Descripción del Producto
     * @param precio Precio del Producto
     * @param unidades Unidades del Producto
     */
    public Productos(String codigo, String nombre, String descripcion, double precio, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;

        if (precio < 0) {
            this.precio = 0;
        }
        if (unidades < 0) {
            this.unidades = 0;
        }
        if (!comprobarCodigo(codigo)) {
            this.codigo = "X";
        }
    }

    /**
     * Constructor copia
     *
     * @param producto Objeto Producto
     */
    public Productos(Productos producto) {
        this.codigo = producto.codigo;
        this.nombre = producto.nombre;
        this.descripcion = producto.descripcion;
        this.precio = producto.precio;
        this.unidades = producto.unidades;
    }

    /**
     *
     * @return evuelve los datos del prodcuto
     */
    @Override
    public String toString() {
        String datosProducto = "Código: " + this.codigo + "\nNombre: " + this.nombre + "\nDescripción: " + this.descripcion + "\nPrecio: " + this.precio + "\nUnidades: " + this.unidades;
        return datosProducto;

    }

    /**
     *
     * @param codigo del Producto
     * @return Devuelve true o false si el codigo es correcto o falso
     */
    
    //Metodo guardar
    
    public static boolean comprobarCodigo(String codigo) {
        Pattern codigoPattern = Pattern.compile("[0-9]{13}"); // Patrón para comprobar el código de los productos
        Matcher m = codigoPattern.matcher(codigo);
        return m.matches();
    }

    /**
     *
     * @param unidades Número de unidades para añadir
     * @return Devuelve true o false si se ha permitido añadir nuevas unidades
     */
    public boolean aniadirUnidades(int unidades) {
        boolean permitido;
        if (unidades > 0) {
            this.unidades += unidades;
            permitido = true;
        } else {
            IO_ES.escribirLN("No se ha realizado la actualización de los datos");
            permitido = false;
        }
        return permitido;
    }

    /**
     *
     * @param unidades Número de unidades para eliminar
     * @return Devuelve true o false si se ha permitido eliminar nuevas unidades
     */
    public boolean quitarUnidades(int unidades) {
        boolean permitido;
        if (unidades > 0) {
            if (unidades > this.unidades) {
                IO_ES.escribirLN("Se han eliminado todas las unidades del producto: " + this.unidades);
                this.unidades -= this.unidades;
            } else {
                this.unidades -= unidades;
            }
            permitido = true;
        } else {
            IO_ES.escribirLN("No se ha realizado la actualización de los datos");
            permitido = false;
        }
        return permitido;
    }

    ///****************************Métodos getter****************************///
    /**
     *
     * @return Devuelve el código del producto
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     *
     * @return Devuelve el nombre del producto
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @return Devuelve la descripción del producto
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     *
     * @return Devuelve el precio del producto
     */
    public double getPrecio() {
        return this.precio;
    }

    /**
     *
     * @return Devuelve las unidades del producto
     */
    public int getUnidades() {
        return this.unidades;
    }

    ///****************************Métodos setter****************************///
    /**
     *
     * @param codigo Nuevo código para el producto
     */
    public void setCodigo(String codigo) {
        if (comprobarCodigo(codigo)) {
            this.codigo = codigo;
        }
    }

    /**
     *
     * @param nombre Nuevo nombre para el producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param descripcion Nueva descripción para el producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param precio Nuevo precio para el producto
     */
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }
}
