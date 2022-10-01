import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Cursos {
    
    private String nome;
    private List<Aula> aulas = new ArrayList<Aula>();
    private String instrutor;
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Cursos(String nome, String instrutor){

        this.nome = nome;
        this.instrutor = instrutor;

    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);   
     }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
       

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

     public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

    }

    public Set<Aluno> getAlunos(){

        return Collections.unmodifiableSet(alunos);
    }

    

    @Override
    public String toString() {
        
        return "[Curso: " + nome + " , tempo total: " + getTempoTotal() + ", aulas: " + this.aulas + " ]";
    }

    public boolean estaMatriculado(Aluno aluno) {
        
        return this.alunos.contains(aluno);   
     }

    public Aluno buscaMatricula(int numero) {
       if(!matriculaParaAluno.containsKey(numero)){

        throw new NoSuchElementException();
       }
        return matriculaParaAluno.get(numero);
  }
}

