import java.util.ArrayList;
import java.util.Collections;

public class TesteLista {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String aula1 = " conhecendo mais de listas";

        String aula2 = "modelando a clase aula";
        String aula3 = "trabalhando com cursos e Sets";

         ArrayList<String> aulas = new ArrayList<>();

         aulas.add(aula1);
         aulas.add(aula2);
         aulas.add(aula3);

         

         System.out.println(aulas);

         aulas.remove(0);

         System.out.println(aulas);

        aulas.forEach(aula ->
        {
            System.out.println(aula);
        }
    ); //lambdas
           

        String primeiraAula = aulas.get(0);
        System.out.println(primeiraAula);

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("aula :" + aulas.get(i));
        }  

        aulas.add("aumento nosso conhecimento");
        
        Collections.sort(aulas);
        System.out.println(aulas);

                

        
         }


        
         
   
    }

