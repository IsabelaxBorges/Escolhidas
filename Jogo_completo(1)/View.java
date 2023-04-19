import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;
public class View {
    Scanner scanner = new Scanner(System.in);
    // Scanner para ler a entrada 
    Scanner sc;

  // Scanner teclado = new Scanner (System.in); para cada posição ele pedir o enter




  

    // ***************************************************************************************
    // Operações/Métodos
    // ***************************************************************************************

    // ============================================================
    // Limpa informações anteriores do terminal para mostrar
    // o jogo novamente
    // ============================================================
    public void limpar_tela() {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

   

    // ============================================================
    // Desenha o mapa do jogo, considerando a posição do jogador
    // e quaisquer missões
    // ============================================================
    
    
    
    
    public void desenhar_mapa(String[][] mapa, int jogador_x, int jogador_y) {

        //System.out.println("Digite a tecla Enter Para iniciar ");
         //  teclado.nextLine();
         //A cada posição ele pede o Enter
            


            
     

    

            for (int y = 0; y < mapa.length; y++) {
                for (int x = 0; x < mapa[0].length; x++) {
    
                    /* Casp seja a posição do jogador */
                    if (jogador_y == y && jogador_x == x) {
                        System.out.print("@");
    
                    }
                    /* Caso seja a posição do início de uma missão */
                    else if (Controle.existe_missao(x, y)) {
                        System.out.print("M");
    
                    }
                    /* Caso não tenha nada no local */
                    else {
                        System.out.print(mapa[y][x]);
    
                    }
    
                }
                System.out.println();
            }
        
       
        
       
       
        
    }

    // ============================================================
    // Apresenta o texto de todas as missões ativas para o usuário
    // ============================================================
    public void mostrar_missoes_ativas(String missoes_ativas) {
        System.out.println(missoes_ativas);

    }

    // ============================================================
    // Obtém o input do usuário
    // ============================================================
    public String obter_direcao() {
        /* Pede um direção para andar */
        
       
        System.out.println("Digite 'q' para sair do jogo:"); 
        System.out.println("Digite uma direção: (W, A, S, D)"); 
        System.out.println("Placar: " + Controle.get_pontos());
        String entrada = sc.nextLine();
        

        /* Obtém a resposta */
        

        if (entrada.equalsIgnoreCase("q")) {
            System.exit(0);
        } 

        /* Retorna a entrada */
        return entrada;
    }
    

    public void mostrar_placar(String string) {        
        
        System.out.println(string);

    }

    

    

    // ============================================================
    // Mostra informações do jogador
    // ============================================================
    public void mostrar_infos(int x, int y) {
        
        /* Mostra a coordenada atual */
        System.out.println("Coordenada atual: (" + x + ", " + y + ")");
    }
    // ***************************************************************************************
    // Construtor
    // ***************************************************************************************
    public View() {
        /* Inicializa o Scanner */
        sc = new Scanner(System.in);
    }
}
