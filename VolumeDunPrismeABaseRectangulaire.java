//////////
//
// V2
// Le 10 mars 2021
// Volume d'un prisme a base rectangulaire
public class VolumeDunPrismeABaseRectangulaire {
    public static void main(String args[]) {
        
    // formule: Lxlxh
    /* Legende:
    a= longueur
    b=largeur
    c=hauteur */
    
    int a = 8;
    int b = 4;
    int c = 6;
    double volume = a*b*c;
    
    //imprimer a l'ecran 
      System.out.println("Le volume d'un prisme a base rectangulaire est " + volume);
    }
}