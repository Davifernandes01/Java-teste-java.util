import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAluno {
    
    public static void main(String[] args) {
        
        Cursos javaColecoes = new Cursos("Domininado as Colecoes do java", "Paulo silveira");

  
         javaColecoes.adiciona(new Aula(      "Trabalhando com arrayList", 21)); 

         javaColecoes.adiciona(new Aula("Criando uma aula", 20));
  
         javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

         Aluno a1 = new Aluno("davi", 1);
         Aluno a2  = new Aluno("rada", 4352);
         Aluno a3 = new Aluno("minos", 6);

         javaColecoes.matricula(a1);
         javaColecoes.matricula(a2);
         javaColecoes.matricula(a3);

         System.out.println("todos os alunos matriculados: " );

         
         Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> interador = alunos.iterator();

        while(interador.hasNext()){
          Aluno proximo = interador.next();
          System.out.println(proximo);
        }

        Aluno depois = interador.next();


         System.out.println( a1 + " ,esta matriculado ?: ");
         System.out.println(javaColecoes.estaMatriculado(a1));

         Aluno turini = new Aluno("rada", 4352);

         System.out.println("e esse aqui ? ");
         System.out.println(javaColecoes.estaMatriculado(turini));

         System.out.println(a2.equals(turini));

         System.out.println(a2.hashCode() == turini.hashCode());
    }
}
