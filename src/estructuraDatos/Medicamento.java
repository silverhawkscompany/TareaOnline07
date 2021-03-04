package estructuraDatos;

import estructuraDatos.Enumerados.TipoMedicamento;

/**
 *
 * @author Daniel Díaz González
 * @version 1.0
 */
public class Medicamento extends Productos {

    private TipoMedicamento tipoMedicamento;
    private String comoTomar;
    private String efectosAdversos;

    /**
     * Contructor de la clase Medicamentos
     *
     * @param codigo Código del Medicamento
     * @param nombre Nombre del Medicamento
     * @param descripcion Descripción del Medicamento
     * @param precio Precio del Medicamento
     * @param unidades Unidades del Medicamento
     * @param tipoMedicamento Tipo del Medicamento
     * @param comoTomar Como tomar el Medicamento
     * @param efectosAdversos Efectos adversos del Medicamento
     */
    public Medicamento(String codigo, String nombre, String descripcion, double precio, int unidades, TipoMedicamento tipoMedicamento, String comoTomar, String efectosAdversos) {
        super(codigo, nombre, descripcion, precio, unidades);
        this.tipoMedicamento = tipoMedicamento;
        this.comoTomar = comoTomar;
        this.efectosAdversos = efectosAdversos;
    }

    /**
     * Constructor copia
     *
     * @param medicamento Objeto Medicamento
     */
    public Medicamento(Medicamento medicamento) {
        super(medicamento.getCodigo(), medicamento.getNombre(), medicamento.getDescripcion(), medicamento.getPrecio(), medicamento.getUnidades());
        this.tipoMedicamento = medicamento.tipoMedicamento;
        this.comoTomar = medicamento.comoTomar;
        this.efectosAdversos = medicamento.efectosAdversos;
    }

    /**
     *
     * @return Devuelve los datos del Medicamento
     */
    @Override
    public String toString() {
        String datosMedicamento = super.toString() + "\nTipo del medicamento: " + this.tipoMedicamento + "\nToma del medicamento: " + this.comoTomar + "\nEfectos adversos: " + this.efectosAdversos;
        return datosMedicamento;
    }

    /**
     *
     * @return Devuelve los datos del Medicamento con un formato de guardado
     */
    public String datosMedicamentos() {
        String datosMedicamento = "Código: " + this.codigo + "&" + "Nombre: " + this.nombre + "&" + "Descripción: " + this.descripcion + "&" + "Precio: " + this.precio + "&" + "Unidades: " + this.unidades + "&" + "Tipo del medicamento: " + this.tipoMedicamento + "&" + "Toma del medicamento: " + this.comoTomar + "&" + "Efectos adversos: " + this.efectosAdversos;
        return datosMedicamento;
    }

    ///****************************Métodos getter****************************///
    /**
     *
     * @return Devuelve el tipo de medicamento
     */
    public TipoMedicamento getTipoMedicamento() {
        return this.tipoMedicamento;
    }

    /**
     *
     * @return Devuelve como tomar un medicamento
     */
    public String getComoTomar() {
        return this.comoTomar;
    }

    /**
     *
     * @return Devuelve los efectos adversos de los medicamentos
     */
    public String getEfectosAdversos() {
        return this.efectosAdversos;
    }

    ///****************************Métodos setter****************************///
    /**
     *
     * @param tipoMedicamento Nuevo tipo de medicamento
     */
    public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    /**
     *
     * @param comoTomar Nueva forma de tomar un medicamento
     */
    public void setComoTomar(String comoTomar) {
        this.comoTomar = comoTomar;
    }

    /**
     *
     * @param efectosAdversos Nuevos efectos adeversos para los medicamentos
     */
    public void setEfectosAdversos(String efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

}
