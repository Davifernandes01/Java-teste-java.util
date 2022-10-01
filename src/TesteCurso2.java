import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
    
    public static void main(String[] args) {
        
        Cursos javaColecoes = new Cursos("Domininado as Colecoes do java", "Paulo silveira");


       javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 21)); 

       javaColecoes.adiciona(new Aula("Criando uma aula", 20));

       javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

       

       List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
       
       
        
       List<Aula> aulas = new ArrayList<>(aulasImutaveis);

       Collections.sort(aulas);
       System.out.println(aulas);

       System.out.println(javaColecoes.getTempoTotal());

       System.out.println(javaColecoes);

   
    }
}