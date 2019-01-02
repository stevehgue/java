import java.util.*;
public class Ex2{
  public static void main(String[] args){
    int valeurs[] = new int[20];
    int occurestab[] = new int[20];
    int i = 0;//indice de debut
    int j = valeurs.length - 1;//indice de fin
    Scanner lc = new Scanner(System.in);
    int nb;//saisie utilisateur
    int occurence = 0;//nombre d'occurence pour un nombre

    while (i < valeurs.length && j > 0 && i != j + 1){ //remplissage du tableau et demande des saisies des valeurs
      System.out.println("Veuillez saisir une valeure:");
      nb = lc.nextInt();
      if (nb >= 0){
        valeurs[i] = nb;
        i++;
      } else {
        valeurs[j] = nb;
        j--;
      }
    }
    System.out.println("Voici les valeurs que vous avez saisie");//affichage des valeurs saisies par l'utilisateur
    System.out.println(Arrays.toString(valeurs));
    System.out.println("Veuillez saisir un nombre afin de savoir combien de fois il apparait");//demande de saisir la valeur dont on veut voir le nombre d'occurence
    nb = lc.nextInt();
    for (i = 0, j = 0; i < valeurs.length; i++){//parsing du tableau pour le nombre d'occurence
      if (nb == valeurs[i]){
        occurence++;
        occurestab[j] = i;
        j++;
        System.out.println("le nombre que vous avez saisi apparat indice :" +i);
      }
    }
    System.out.println(Arrays.toString(occurestab));
    System.out.println("Il apparait donc "+occurence+" fois.");
    lc.close();
  }
}
