package org.example;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataBrasil implements InterpretadorData {

    private Date data;

    public DataBrasil(String entrada) {
        try {
            DateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
            this.data = formatoEntrada.parse(entrada);
        } catch (Exception e) {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    @Override
    public String interpretar() {
        DateFormat formatoSaida = new SimpleDateFormat("d 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        return formatoSaida.format(this.data);
    }
}
