package org.example;

public class PessoaVisitorXml implements PessoaVisitor{

    public String exibir(Pessoa pessoa){
        return pessoa.aceitar(this);
    }
    
    @Override
    public String exibirAluno(Aluno aluno) {
        return "<aluno>" +
                "<matricula>" + aluno.getMatricula() + "</matricula>" +
                "<nome>" + aluno.getNome() + "</nome>" +
                "<curso>" + aluno.getNomeCurso() + "</curso>" +
                "</aluno>";
    }
    
    @Override
    public String exibirProfessor(Professor professor) {
        return "<Professor>" +
                "<matricula>" + professor.getMatricula() + "</matricula>"+
                "<nome>" + professor.getNome() + "</nome>" +
                "<titulacao>" + professor.getTitulacao() + "</titulacao>" +
                "</Professor>";
    }
    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "<Funcionario>" +
                "<codigo>" + funcionario.getCodigo() +"</codigo>" +
                "<nome>" + funcionario.getNome() + "</nome>" +
                "<salario>" + funcionario.getSalario() +"</salario>" +
                "</Funcionario>";
    }
}
