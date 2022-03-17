package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Nota {

    private Diciplina diciplina;
    private Bimestre bimestre;
    private List<BigDecimal> notaPrimeiroBimestre = new ArrayList<>();
    private List<BigDecimal> notaSegundoBimestre = new ArrayList<>();

    public Nota(Diciplina diciplina) {
        this.diciplina = diciplina;
    }

    public Diciplina getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplina = diciplina;
    }

    public Bimestre getBimestre() {
        return bimestre;
    }

    public void setBimestre(Bimestre bimestre) {
        this.bimestre = bimestre;
    }

    public List<BigDecimal> getNotaPrimeiroBimestre() {
        return this.notaPrimeiroBimestre;
    }

    public void setNotaPrimeiroBimestre(BigDecimal notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre.add(notaPrimeiroBimestre);
    }

    public List<BigDecimal> getNotaSegundoBimestre() {
        return this.notaSegundoBimestre;
    }

    public void setNotaSegundoBimestre(BigDecimal notaSegundoBimestre) {
        this.notaSegundoBimestre.add(notaSegundoBimestre);
    }

    @Override
    public String toString() {
        return String.format("Diciplina %s, notas 1° Bimestre: %s, notas 2° Bimestre: %s\n"
                , this.diciplina, this.notaPrimeiroBimestre, this.notaSegundoBimestre);
    }
}
