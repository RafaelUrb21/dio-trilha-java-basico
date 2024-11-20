public class For {
    public static void main(String[] args) throws Exception {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) {
            System.out.println("nome do aluno é: " + aluno);
        }

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Alunos no indice i " + i + " é " + alunos[i]);
        }
    }
}
