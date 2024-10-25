// Classe Aluno
class Aluno {
    private String nome;
    private String email;

    // Construtor
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Método para retornar o nome
    public String leNome() {
        return nome;
    }

    // Método para retornar o email
    public String leEmail() {
        return email;
    }
}

// Classe principal
public class CadastroAlunos {
    public static void main(String[] args) {
        // Criando um array de Alunos com 4 elementos
        Aluno[] cadastro = new Aluno[4];
        
        // Inicializando o array com os dados dos alunos
        cadastro[0] = new Aluno("Gabriel", "Biel@Yahoo.com");
        cadastro[1] = new Aluno("Fabio", "fabinho@outlook.com");
        cadastro[2] = new Aluno("Felipe", "felipinho@Gmail.com");
        cadastro[3] = new Aluno("Yasmin", "Mimi@Globo.com");
        
        // Imprimindo a lista de alunos cadastrados
        for (Aluno aluno : cadastro) {
                    System.out.println("| aluno: " + aluno.leNome() + " | e-mail: " + aluno.leEmail());
                    System.out.println(); 
        }
    }
}
