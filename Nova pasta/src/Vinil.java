class Vinil extends Disco {
    private int rpm;

    public Vinil(int id, String nome, double preco, String artista, String genero, double rpm) {
        super(id, nome, preco, artista, genero);
        this.rpm = (int) rpm;
    }

    public Vinil(String nome, double preco, String artista, String genero, double peso) {}

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return super.toString() + ", RPM: " + rpm;
    }
}