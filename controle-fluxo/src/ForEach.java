public class ForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        /*
         * 1. String aluno : alunos -> De forma abreviada é criada uma variável nome
         * obtendo um elemento do vetor a cada ocorrência.
         * 
         * 2. A impressão de cada aluno é realizada.
         */
    }
}
