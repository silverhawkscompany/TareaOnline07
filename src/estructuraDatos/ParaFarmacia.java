package estructuraDatos;

import estructuraDatos.Enumerados.Categoria;

/**
 *
 * @author Daniel Díaz González
 * @version 1.0
 */
public class ParaFarmacia extends Productos {

    private Categoria categoria;
    private int dosisUnidades;
    private double descuento;

    /**
     * Contructor de la clase ParaFarmacia
     *
     * @param codigo Código del producto de Parafarmacia
     * @param nombre Nombre del producto de Parafarmacia
     * @param descripcion Descripción del producto de Parafarmacia
     * @param precio Precio del producto de Parafarmacia
     * @param unidades Unidades del producto de Parafarmacia
     * @param categoria Categoria del producto de Parafarmacia
     * @param dosisUnidades Dosis del producto de Parafarmacia
     * @param descuento Descuento del producto de Parafarmacia
     */
    public ParaFarmacia(String codigo, String nombre, String descripcion, double precio, int unidades, Categoria categoria, int dosisUnidades, double descuento) {
        super(codigo, nombre, descripcion, precio, unidades);
        this.categoria = categoria;
        this.dosisUnidades = dosisUnidades;
        this.descuento = descuento;
    }

    /**
     * Constructor copia
     *
     * @param paraFarmacia Objeto Parafarmacia
     */
    public ParaFarmacia(ParaFarmacia paraFarmacia) {
        super(paraFarmacia.getCodigo(), paraFarmacia.getNombre(), paraFarmacia.getDescripcion(), paraFarmacia.getPrecio(), paraFarmacia.getUnidades());
        this.categoria = paraFarmacia.categoria;
        this.dosisUnidades = paraFarmacia.dosisUnidades;
        this.descuento = paraFarmacia.descuento;
    }

    /**
     *
     * @return Devuelve los datos de Parafarmacia
     */
    @Override
    public String toString() {
        String datosParaFarmacia = super.toString() + "\nCategoria: " + this.categoria + "\nDosis de las unidades: " + this.dosisUnidades + "\nDescuento: " + this.descuento;
        return datosParaFarmacia;
    }

    /**
     *
     * @return Devuelve los datos de Parafarmacia con un formato de guardado
     */
    public String datosParafarmacia() {
        String datosParaFarmacia = "Código: " + this.codigo + "&" + "Nombre: " + this.nombre + "&" + "Descripción: " + this.descripcion + "&" + "Precio: " + this.precio + "&" + "Unidades: " + this.unidades + "&" + "Categoria: " + this.categoria + "&" + "Dosis de las unidades: " + this.dosisUnidades + "&" + "Descuento: " + this.descuento;
        return datosParaFarmacia;
    }

    ///****************************Métodos getter****************************///
    /**
     *
     * @return Devuelve la categgoria del producto de Parafarmacia
     */
    public Categoria getCategoria() {
        return this.categoria;
    }

    /**
     *
     * @return Devuelve las dosis de cada producto
     */
    public int getDosisUnidades() {
        return this.dosisUnidades;
    }

    /**
     *
     * @return Devuelve el descuento de cada producto
     */
    public double getDescuento() {
        return this.descuento;
    }

    ///****************************Métodos setter****************************///
    /**
     *
     * @param categoria Nueva categoria del producto de Parafarmacia
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @param dosisUnidades Nuevas dosis para el producto
     */
    public void setDosisUnidades(int dosisUnidades) {
        this.dosisUnidades = dosisUnidades;
    }

    /**
     *
     * @param descuento Nuevo descuento del producto
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}
