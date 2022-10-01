import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
    
    public static void main(String[] args) {
        
        Collection<String> alunos = new HashSet<>();
        
        alunos.add("Rodrigo");
        alunos.add("davi");
        alunos.add("nicco");
        alunos.add("sergio");
        alunos.add("paulo");
        alunos.add("rafaela");
        alunos.add("davi");

        boolean paulo = alunos.contains("paulo");
        System.out.println(paulo);
        alunos.remove("davi");

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            
            System.out.println(aluno);
        }

        alunos.forEach(aluno ->
        {
            System.out.println(aluno);
        });
    }
}
