package CreacionPost;

public class Post {
    private String nombrePost;
    private String autor;
    private String foto;

    public Post(String nombrePost, String autor, String foto) {
        this.nombrePost = nombrePost;
        this.autor = autor;
        this.foto = foto;
    }

    public String getNombrePost() {
        return nombrePost;
    }

    public void setNombrePost(String nombrePost) {
        this.nombrePost = nombrePost;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

//    @Override
//    public String toString() {
//        return "{\"nombrePost\":\""+nombrePost+"\",\""+autor+"\":\"autor\",\""+foto+"\":\"foto\"}";
//    }

    @Override
    public String toString() {
        return "{" +
                "\"nombrePost\":\"" + nombrePost + "\"," +
                "\"autor\":\"" + autor + "\"," +
                "\"foto\":\"" + foto + "\"" +
                "}";
    }
}
