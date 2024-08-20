// ALUNOS : PEDRO YURI DE OLIVEIRA GÓES E GEOVANI MACHADO CARDEAL
public class Main {
  public static void main(String[] args) {
    Semestre semestre = new Semestre(7.0, 7.0,7.0, 7.0 , 7.0, 7.0, 7.0, 7.0, 7.0);
//(notaProva1, notaProva2, notaTrabalho1, notaTrabalho2, notaTrabalho3, notaInterdisciplinar1, notaInterdisciplinar2, notaInterdisciplinar3,  notaInterdisciplinar4)
    
    System.out.println("Média: " + semestre.getMedia());
    semestre.getResultado();
  }


}



