class Jogador {

    // ***************************************************************************************
    // Atributos
    // ***************************************************************************************
    private int x;
    private int y;
    private int pontos;


    // ***************************************************************************************
    // Operações/Métodos
    // ***************************************************************************************
    
    // ============================================================
    // Getters e setters
    // ============================================================
    public int get_x() {
        return x;
    }

    public int get_y() {
        return y;
    }

    public void set_x(int x) {
        this.x = x;
    }

    public void set_y(int y) {
        this.y = y;
    }

    public int get_pontos() {
        return pontos;
    }

    public void set_pontos(int pontos) {
        this.pontos = pontos;
    }

    





    // ***************************************************************************************
    // Construtor
    // ***************************************************************************************
    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
        this.pontos = 0;
    }

    public void pontos(int get_x, int get_y) {

    }


}