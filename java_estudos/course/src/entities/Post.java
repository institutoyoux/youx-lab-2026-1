package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Post {
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    public Post() {

    }

    public Post(LocalDateTime momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    private List<Comentario> comentarios = new ArrayList<>();

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {

        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // 2. Cria o StringBuilder para montar o texto de forma limpa
        StringBuilder sb = new StringBuilder();

        sb.append(titulo).append("\n");
        sb.append(curtidas).append(" Likes - ").append(fmt.format(momento)).append("\n");
        sb.append(conteudo).append("\n");
        sb.append("Comentarios: \n");



        for (Comentario c : comentarios) {
            sb.append(c).append("\n");
        }

        return sb.toString();
    }

}
