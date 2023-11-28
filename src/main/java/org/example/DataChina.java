package org.example;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataChina implements InterpretadorData {

    private Date data;

    public DataChina(String entrada) {
        try {
            DateFormat formatoEntrada = new SimpleDateFormat("yyyy/MM/dd");
            this.data = formatoEntrada.parse(entrada);
        } catch (Exception e) {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    @Override
    public String interpretar() {
        DateFormat formatoSaida = new SimpleDateFormat("yyyy'年'MM'月'dd'日'", new Locale("zh", "CN"));
        return formatoSaida.format(this.data);
    }

}
