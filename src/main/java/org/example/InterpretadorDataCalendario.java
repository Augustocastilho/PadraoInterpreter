package org.example;

public class InterpretadorDataCalendario implements InterpretadorData {

    private InterpretadorData interpretadorInicial;
    
    public InterpretadorDataCalendario(String contexto) {

        String data;

        if (contexto.contains("Brasil")) {
            data = contexto.replace("Brasil", "").trim();
            DataBrasil interpretador = new DataBrasil(data);
            interpretadorInicial = new Data(interpretador.interpretar());
        } else if (contexto.contains("EUA")) {
            data = contexto.replace("EUA", "").trim();
            DataEUA interpretador = new DataEUA(data);
            interpretadorInicial = new Data(interpretador.interpretar());
        } else if (contexto.contains("China")) {
            data = contexto.replace("China", "").trim();
            DataChina interpretador = new DataChina(data);
            interpretadorInicial = new Data(interpretador.interpretar());
        } else {
            throw new IllegalArgumentException("Contexto inválido");
        }
    }

    @Override
    public String interpretar() {
        return interpretadorInicial.interpretar();
    }



}
