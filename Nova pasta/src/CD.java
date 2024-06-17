class CD extends Disco {
    private int numeroDeFaixas;

    public CD(int id, String nome, double preco, String artista, String genero, int numeroDeFaixas) {
        super(id, nome, preco, artista, genero);
        this.numeroDeFaixas = numeroDeFaixas;
    }

	public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Faixas: " + numeroDeFaixas;
    }
}