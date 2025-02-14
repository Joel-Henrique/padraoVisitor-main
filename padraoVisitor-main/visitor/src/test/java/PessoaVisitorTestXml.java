import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaVisitorTestXml {
    @Test
    void deveExibirAlunoJson() {
        Aluno aluno = new Aluno(5, "Carlos", new Curso("Ciencias Exatas"));
        PessoaVisitorXml visitor = new PessoaVisitorXml();
        assertEquals("<aluno><matricula>5</matricula><nome>Carlos</nome><curso>Ciencias Exatas</curso></aluno>", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorJson() {
        Professor professor = new Professor(9, "Gustavo", "Mestrado");
        PessoaVisitorXml visitor = new PessoaVisitorXml();
        assertEquals("<Professor><matricula>9</matricula><nome>Gustavo</nome><titulacao>Mestrado</titulacao></Professor>", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioJson() {
        Funcionario funcionario = new Funcionario(2, "Joel", 1800.0f);
        PessoaVisitorXml visitor = new PessoaVisitorXml();
        assertEquals("<Funcionario><codigo>2</codigo><nome>Joel</nome><salario>1800.0</salario></Funcionario>", visitor.exibir(funcionario));
    }
}
