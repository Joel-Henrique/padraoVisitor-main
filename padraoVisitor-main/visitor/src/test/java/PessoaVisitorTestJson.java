import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaVisitorTestJson {
    @Test
    void deveExibirAlunoJson() {
        Aluno aluno = new Aluno(5, "Carlos", new Curso("Ciencias Exatas"));
        PessoaVisitorJson visitor = new PessoaVisitorJson();
        assertEquals("Aluno{matricula=5, nome='Carlos', curso=Ciencias Exatas}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorJson() {
        Professor professor = new Professor(9, "Gustavo", "Mestrado");
        PessoaVisitorJson visitor = new PessoaVisitorJson();
        assertEquals("Professor{matricula=9, nome='Gustavo', titulacao='Mestrado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioJson() {
        Funcionario funcionario = new Funcionario(2, "Joel", 1800.0f);
        PessoaVisitorJson visitor = new PessoaVisitorJson();
        assertEquals("Funcionario{codigo=2, nome='Joel', salario=5000.0}", visitor.exibir(funcionario));
    }
}
