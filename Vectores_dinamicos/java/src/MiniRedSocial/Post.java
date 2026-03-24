package MiniRedSocial;

public class Post {
    private String nomPost;
    private String autor;
    private String foto;

    public Post(String nomPost, String autor, String foto) {
        this.nomPost = nomPost;
        this.autor = autor;
        this.foto = foto;
    }

    public String getNomPost() {
        return nomPost;
    }

    public void setNomPost(String nomPost) {
        this.nomPost = nomPost;
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
}
