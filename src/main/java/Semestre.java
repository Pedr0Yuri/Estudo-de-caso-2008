//Um semestre possui 4 avaliações (estas avaliações devem ser informados no construtor da classe Semestre). As avaliações podem ser: Prova, Trabalho ou interdisciplinar. As avaliações podem ter pesos diferentes sendo que a soma dos pesos deve dar 7 (a definição dos pesos é feito na classe). A classe Semestre deve possuir a capacidade de informar se o peso das avaliações é válido (=7), a média e o resultado (APROVADO DU REPROVADO). Uma Avaliação deve ter a capacidade de informar a nota, peso e a a quantidade de pontos (peso nota). O peso de cada avaliação deve ser informado na definição da classe sendo que uma avaliação também pode ser composta por diversas notas, que geram uma ÚNICA nota para a avaliação. Ex: Um trabalho pode ser formada por 3 notas sendo que a nota final do trabalho é a soma destas notas dividido por 3.

//PROBLEMA

//Para avaliar seus alunos a disciplina de Programação Orientada a Objetos utiliza os seguinte critérios de avaliação:

//• 2 provas de peso 2;

//1 trabalho de peso 1, composto por 3 notas;

//1 interdisciplinar de peso 2, composto por 4 notas (3 notas de peso 2 e 1 nota de peso 4).

//Construs um programa seguindo o modelo 0.0. citado para resolver o problema apresentado


public class Semestre {
  private double pesoProva, pesoTrabalho, pesoInterdisciplinar;
  private double notaProva1, notaProva2, notaTrabalho1, notaTrabalho2, notaTrabalho3, notaInterdisciplinar1,notaInterdisciplinar2,notaInterdisciplinar3,notaInterdisciplinar4;
  public Semestre (double notaProva1, double notaProva2, double notaTrabalho1, double notaTrabalho2, double notaTrabalho3,double notaInterdisciplinar1, double notaInterdisciplinar2, double notaInterdisciplinar3, double notaInterdisciplinar4) {
    this.notaProva1 = notaProva1;
    this.notaProva2 = notaProva2;
    this.notaTrabalho1 = notaTrabalho1;
    this.notaTrabalho2 = notaTrabalho2;
    this.notaTrabalho3 = notaTrabalho3;
    this.notaInterdisciplinar1 = notaInterdisciplinar1;
    this.notaInterdisciplinar2 = notaInterdisciplinar2;
    this.notaInterdisciplinar3 = notaInterdisciplinar3;
    this.notaInterdisciplinar4 = notaInterdisciplinar4;
    this.pesoProva = 2.0;
    this.pesoTrabalho = 1.0;
    this.pesoInterdisciplinar = 2.0;
  }

  
  
  public double getMedia(){
    double notaTrabalho = (notaTrabalho1 + notaTrabalho2 + notaTrabalho3) / 3;
    double notaInterdisciplinar = (notaInterdisciplinar1 * 2 + notaInterdisciplinar2 * 2 + notaInterdisciplinar3 * 2 + notaInterdisciplinar4 * 4) / 10;
    return (notaProva1 * pesoProva + notaProva2 * pesoProva + notaTrabalho * pesoTrabalho + notaInterdisciplinar * pesoInterdisciplinar) /7;

  }
  
  
  public void getResultado () {
  if (getMedia() > 6.9){
    System.out.println("Aprovado");
  }
    else {
      System.out.println("Reprovado");
    }
  }
    
  }
 



