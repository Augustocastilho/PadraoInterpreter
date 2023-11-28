package org.example;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataEUA implements InterpretadorData {

    private Date data;

    public DataEUA(String entrada) {
        try {
            DateFormat formatoEntrada = new SimpleDateFormat("mm/dd/yyyy");
            this.data = formatoEntrada.parse(entrada);
        } catch (Exception e) {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    @Override
    public String interpretar() {
        DateFormat formatoSaida = new SimpleDateFormat("MMMM d'th', yyyy", new Locale("en", "US"));
        return formatoSaida.format(this.data);
    }

}
