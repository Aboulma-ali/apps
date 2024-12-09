import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {

        ProduitImpl PI = new ProduitImpl();
        Produit P = PI.saisie();
        System.out.println("Information Produit :");
        PI.affiche(P);

    }
}