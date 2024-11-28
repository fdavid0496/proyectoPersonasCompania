package co.davles.personascompania.models;

public class Empleado extends Persona {
    private Double remuneracion;
    private Integer empleadoId;

    private static Integer ultimoId = 0;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++Empleado.ultimoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public static Integer getUltimoId() {
        return ultimoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        double aumento = this.remuneracion * ((double) porcentaje / 100);
        this.remuneracion += aumento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nremuneracion=" + remuneracion +
                ",\nempleadoId=" + empleadoId;
    }
}
