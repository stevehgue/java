import java.util.*;
public class Ex1{//remplit un tableau avec un nombre de valeures demandées à l'utilisateur, calcule la somme, la moyenne, donne la valeure maximale et minimal
  public static void main(String[] args){
    int valeurs[] = new int[10];
    int i = 1;
    int max = 0;
    int somme = 0;
    int nbSaisi = 0;
    Scanner lectureClavier = new Scanner(System.in);
    int saisie = 0;
    int min = 0;
    System.out.println("Veuillez saisir une valeure:");
    saisie = lectureClavier.nextInt();
    if (saisie == 0)
      return;
    valeurs[0] = saisie;
    max = saisie;
    min = saisie;
    while (i < 10){
      System.out.println("Veuillez saisir une valeure");
      saisie = lectureClavier.nextInt();
      if (saisie == 0)
        break;
      else if (saisie > max)
        max = saisie;
      else if (saisie < min)
        min = saisie;
      valeurs[i] = saisie;
      i++;
    }
    nbSaisi = i;
    i = 0;
    System.out.println("Voici les valeures que vous avez saisi.");
    while (i < nbSaisi){
      System.out.println(valeurs[i]);
      somme += valeurs[i];
      i++;
    }
    System.out.println("Voici la somme des valeures que vous avez saisi: "+somme);
    System.out.println("Voici la valeure maximale que vous avez saisi: " + max);
    System.out.println("Voici la valeure minimal que vous avez saisi: " + min);
    if (nbSaisi == 0)
          return;
    else
      System.out.println("Voici la moyenne des nombres que vous avez saisi: " +(somme / nbSaisi));
    lectureClavier.close();
  }
}
