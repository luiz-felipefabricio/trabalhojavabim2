class Disco extends Produto {
    private String artista;
    private String genero;

    public Disco(int id, String nome, double preco, String artista, String genero) {
        super(id, nome, preco);
        this.artista = artista;
        this.genero = genero;
    }

    public Disco() {}

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artista: " + artista + ", Gênero: " + genero;
    }

	public static void add(Vinil vinil) {
		
	}

	public static void add(CD cd) {
		
	}
}