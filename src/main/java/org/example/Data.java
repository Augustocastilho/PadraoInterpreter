package org.example;

public class Data implements InterpretadorData{

    private String data;

    public Data(String entrada) {
        this.data = entrada;
    }

    @Override
    public String interpretar() {
        return this.data;
    }

    public String getData(){
        return this.data;
    }
}
