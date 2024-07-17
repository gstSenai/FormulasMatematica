public class Professor {
    private String nome;
    private String senha;
    private String senhaProfessores = "senha123";

    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaProfessores() {
        return senhaProfessores;
    }

    public void setSenhaProfessores(String senhaProfessores) {
        this.senhaProfessores = senhaProfessores;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                "senha='" + senha + '\'' +
                '}';
    }
}
