package modelo;

public enum Periodo {

    PRIMEIRO_PERIODO("1° Semestre"),
    SEGUNDO_PERIODO("2° Semestre"),
    TERCEIRO_PERIODO("3° Semestre"),
    QUARTO_PERIODO("4° Semestre"),
    QUINTO_PERIODO("5° Semestre"),
    SEXTO_PERIODO("6° Semestre"),
    SETIMO_PERIODO("7° Semestre"),
    OITAVO_PERIODO("8° Semestre");

    private String descricao;

    Periodo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return String.format("%s", this.descricao);
    }
}
