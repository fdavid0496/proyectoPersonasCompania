package co.davles.personascompania;

import co.davles.personascompania.models.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente objGerente = new Gerente("David",
                "Marín",
                "1234-1",
                "Carrera 6ta #10-38 - Antigua",
                2500000.0);

        objGerente.setPresupuesto(10000000.0);

        System.out.println(objGerente);
    }
}
