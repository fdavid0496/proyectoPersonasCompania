package co.davles.personascompania.models;

public class Cliente extends Persona {
    private Integer clienteId;

    private static Integer ultimoId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public static Integer getUltimoId() {
        return ultimoId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nclienteId=" + clienteId;
    }
}
