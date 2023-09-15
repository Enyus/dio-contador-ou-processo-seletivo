package desafio.processoSeletivo;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) throws Exception {
        //Método Principal
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for(String candidato: candidatos) {
            selecionarCandidatoPorSalarioPretendido(candidato);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    //Resolução do item 1:
    static void selecionarCandidatoPorSalarioPretendido(String candidato) {
        double salarioBase = 2000.0;
        double salarioPretendido = valorPretendido();

        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O(A) CANDIDATO(A) " + candidato);
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O(A) CANDIDATO(A) " + candidato + ", COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
