package Supermarket;


import java.sql.SQLType;
import java.util.Scanner;


public class MainSuperMarché {

    public static void main(String[] args) {


        Scanner clavier = new Scanner(System.in);


        System.out.println("Bienvenue à votre Supermarché en ligne.");
        System.out.println();
        System.out.println("Voici nos différents rayons : Fruits,Légumes,Viandes,Boissons,Poissons,Bonbons,Utilitaires,Réductions.");
        System.out.println("N.B : Vous pouvez consulter nos articles remisés en inscrivant Réductions dans la console. ");
        System.out.println();
        System.out.println("Pour faire vos courses consulter nos différents Rayons puis une fois vos Rayons consulté  écrivez Caddie dans la console pour pouvoir remplir votre Caddie.");
        System.out.println();
        System.out.print("Veuillez Ecrire le Rayon que vous souhaitez consulter:");

        Panier panier = new Panier();


        String choix = "rayons";
        String articles = "jus de pommes";





        while (!choix.equals("Caddie")) {
            choix = clavier.nextLine();
            switch (choix) {

                case "Fruits":
                    System.out.println("Fraises,Melons,Pommes,Abricots,Péches,Poires");
                    break;
                case "Légumes":
                    System.out.println("Aubergines,Tomates,Carottes,Patates");
                    break;
                case "Viandes":
                    System.out.println("Poulets,Jambons,Steaks,Merguez");
                    break;
                case "Boissons":
                    System.out.println("Eau,Eau Pétillantes,Cocas");
                    break;
                case "Poissons":
                    System.out.println("Colins,Saumons,Sardines,Thons");
                    break;
                case "Bonbons":
                    System.out.println("Dragibus,Réglisses,Cremeux");
                    break;
                case "Utilitaires":
                    System.out.println("Sopalins,Mouchoirs,Feuilles");
                    break;
                case "Réductions":
                    System.out.println("Fraises -50%, Jambons -30%,Cocas -20%, Colins -10%");
                    break;
            }
        }



        System.out.println("Merci de Remplir vottre Caddie en indiquant le nom de l'article voulu.");

        System.out.println("Une fois votre Caddie remplit Ecrivez Payer dans la console pour procéder au réglement.");


        while (!articles.equals("Payer")) {

            articles = clavier.nextLine();


            switch (articles) {
                case "Fraises":
                    System.out.println("Prix fraises unitaires = 1E (-50%)");
                    System.out.print("Combien de fraises voulez-vous ?");

                    //rfraises = fraises * nfraises;
                    Article fraise = new Article("fraise", clavier.nextInt(), 1, 0.5);
                    panier.getArticles().add(fraise);

                    System.out.println("Fraises = " + fraise.getQty() + " Prix  = " + fraise.getPrixTotal() +
                            "E Prix remisé = " + fraise.getPrixtotalreduction() + "E");

                    break;
                case "Melons":
                    System.out.println("Prix melons unitaires = 2E");
                    System.out.print("Combien de melons voulez vous ?");

                    Article melons = new Article("melons", clavier.nextInt(), 2, 0);

                    System.out.println("Melons = " + melons.getQty() + " Prix = " + melons.getPrixTotal() + "E" );

                    panier.getArticles().add(melons);


                    break;

                case "Pommes":
                    System.out.println("Prix pommes unitaires = 0.4E");
                    System.out.print("Combien de pommes voulez vous ?");


                    Article pommes = new Article("pommes", clavier.nextInt(), 0.4, 0);


                    System.out.println("Pommes = " + pommes.getQty() + " Prix = " + pommes.getPrixTotal()+ "E");

                    panier.getArticles().add(pommes);

                    break;

                case "Abricots":
                    System.out.println("Prix abricots unitaires = 0.3E");
                    System.out.print("Combien d'abricots voulez-vous ?");

                    //rfraises = fraises * nfraises;
                    Article abricots = new Article("abrictos", clavier.nextInt(), 0.3, 0);

                    System.out.println("Abricots = " + abricots.getQty() + " Prix = " + abricots.getPrixTotal()+ "E");

                    panier.getArticles().add(abricots);

                    break;

                case "Péches":
                    System.out.println("Prix péches unitaires = 1.5E");
                    System.out.print("Combien de péches voulez vous ?");

                    Article peches = new Article("peches", clavier.nextInt(), 1.5, 0);

                    System.out.println("Péches = " + peches.getQty() + " Prix = " + peches.getPrixTotal()+ "E");

                    panier.getArticles().add(peches);

                    break;


                case "Poires":
                    System.out.println("Prix poires unitaires = 0.7E");
                    System.out.print("Combien de poires voulez vous ?");

                    Article poires = new Article("poires", clavier.nextInt(), 0.7, 0);

                    System.out.println("Poires = " + poires.getQty() + " Prix = " + poires.getPrixTotal()+ "E");

                    panier.getArticles().add(poires);


                    break;

                case "Aubergines":
                    System.out.println("Prix  aubergines  unitaires = 0.8E");
                    System.out.print("Combien d'auberignes voulez vous ?");

                    Article aubergines = new Article("aubergines", clavier.nextInt(), 0.8, 0);

                    System.out.println("Aubergines = " + aubergines.getQty() + " Prix = " + aubergines.getPrixTotal()+ "E");

                    panier.getArticles().add(aubergines);

                    break;

                case "Tomates":
                    System.out.println("Prix  tomates  unitaires = 0.5E");
                    System.out.print("Combien de tomates voulez vous ?");

                    Article tomates = new Article("tomates", clavier.nextInt(), 0.5, 0);

                    System.out.println("Tomates = " + tomates.getQty() + " Prix = " + tomates.getPrixTotal()+ "E");

                    panier.getArticles().add(tomates);


                    break;

                case "Carottes":
                    System.out.println("Prix  carrotes  unitaires = 0.7E");
                    System.out.print("Combien de carrotes voulez vous ?");

                    Article carottes = new Article("carottes", clavier.nextInt(), 0.7, 0);

                    System.out.println("Carottes = " + carottes.getQty() + " Prix = " + carottes.getPrixTotal()+ "E");

                    panier.getArticles().add(carottes);

                    break;

                case "Patates":
                    System.out.println("Prix  patates  unitaires = 0.1E");
                    System.out.print("Combien de patates voulez vous ?");

                    Article patates = new Article("patates", clavier.nextInt(), 0.1, 0);

                    System.out.println("Patates = " + patates.getQty() + " Prix = " + patates.getPrixTotal()+ "E");

                    panier.getArticles().add(patates);

                    break;

                case "Poulets":
                    System.out.println("Prix  poulets  unitaires = 8E");
                    System.out.print("Combien de poulets voulez vous ?");

                    Article poulets = new Article("poulets", clavier.nextInt(), 8, 0);

                    panier.getArticles().add(poulets);

                    System.out.println("Poulets = " + poulets.getQty() + " Prix = " + poulets.getPrixTotal()+ "E");

                    break;

                case "Jambons":
                    System.out.println("Prix  tranche jambon : 0.3E (-30%)");
                    System.out.print("Combien de tranche de jambon voulez vous ?");

                    Article jambons = new Article("jambons", clavier.nextInt(), 0.3, 0.7);

                    System.out.println("Tranche de jambons = " + jambons.getQty() + " Prix = " + jambons.getPrixTotal() +
                            "E Prix remisé = " + jambons.getPrixtotalreduction()+ "E");

                    panier.getArticles().add(jambons);

                    break;

                case "Steaks":
                    System.out.println("Prix  Steak  unitaires = 1.5E");
                    System.out.print("Combien de Steak  voulez vous ?");

                    Article steak = new Article("steak", clavier.nextInt(), 1.5, 0);

                    System.out.println(" Steak = " + steak.getQty() + " Prix = " + steak.getPrixTotal()+ "E");

                    panier.getArticles().add(steak);

                    break;

                case "Merguez":
                    System.out.println("Prix  Merguez = 1E");
                    System.out.print("Combien de Merguez  voulez vous ?");

                    Article merguez = new Article("merguez", clavier.nextInt(), 1, 0);

                    System.out.println(" Merguez = " + merguez.getQty() + " Prix = " + merguez.getPrixTotal()+ "E");

                    panier.getArticles().add(merguez);


                    break;

                case "Eau":
                    System.out.println("Prix  Eau  1L = 0.3E");
                    System.out.print("Combien de Bouteilles   voulez vous ?");

                    Article eau = new Article("eau", clavier.nextInt(), 0.3, 0);

                    System.out.println(" Bouteilles d'eau = " + eau.getQty() + " Prix = " + eau.getPrixTotal()+ "E");

                    panier.getArticles().add(eau);

                    break;

                case "Eau Pétillantes":
                    System.out.println("Prix  Eau pétillantes 1L = 0.4E");
                    System.out.print("Combien de Bouteilles   voulez vous ?");

                    Article eaup = new Article("eaup", clavier.nextInt(), 0.4, 0);

                    System.out.println(" Bouteilles d'eau pétilanntes= " + eaup.getQty() + " Prix = " + eaup.getPrixTotal()+ "E");

                    panier.getArticles().add(eaup);

                    break;

                case "Cocas":
                    System.out.println("Prix  Coca 1L = 1E (-20%)");
                    System.out.print("Combien de Bouteilles   voulez vous ?");

                    Article cocas = new Article("Cocas", clavier.nextInt(), 1, 0.8);

                    System.out.println(" Bouteilles de Cocas= " + cocas.getQty() + " Prix = " + cocas.getPrixTotal() +
                            "E Prix remisé = " + cocas.getPrixtotalreduction()+ "E");

                    panier.getArticles().add(cocas);

                    break;

                case "Colins":
                    System.out.println("Prix tranche de Colins  = 2.5E (-10%) ");
                    System.out.print("Combien de tranches de Colins   voulez vous ?");

                    Article colins = new Article("Colins", clavier.nextInt(), 2.5, 0.9);

                    System.out.println(" Tranche 200G de Colins = " + colins.getQty() + " Prix = " + colins.getPrixTotal() +
                            "E Prix remisé = " + colins.getPrixtotalreduction()+ "E");

                    panier.getArticles().add(colins);

                    break;

                case "Saumons":
                    System.out.println("Prix  200g saumons  = 3.5E ");
                    System.out.print("Combien de saumons  voulez vous ?");

                    Article saumons = new Article("Saumons", clavier.nextInt(), 3.5, 0);

                    System.out.println(" Tranche 200G de saumons = " + saumons.getQty() + " Prix = " + saumons.getPrixTotal()+ "E");

                    panier.getArticles().add(saumons);

                    break;

                case "Sardines":
                    System.out.println("Prix  boites Sardines  = 3E ");
                    System.out.print("Combien de boites  voulez vous ?");

                    Article sardines = new Article("Sardines", clavier.nextInt(), 3, 0);

                    System.out.println(" Boites de sardines= " + sardines.getQty() + " Prix = " + sardines.getPrixTotal()+ "E");

                    panier.getArticles().add(sardines);

                    break;

                case "Thons":
                    System.out.println("Prix  Piéce 300G Thon  = 3E ");
                    System.out.print("Combien de tranche voulez vous ?");

                    Article thons = new Article("Thons", clavier.nextInt(), 3, 0);

                    System.out.println(" Tranche 300G Thon = " + thons.getQty() + " Prix = " + thons.getPrixTotal()+ "E");

                    panier.getArticles().add(thons);

                    break;

                case "Dragibus":
                    System.out.println("Prix  sachet de dragibus  = 2E ");
                    System.out.print("Combien de sachet voulez vous ?");

                    Article dragibus = new Article("Dragiubs", clavier.nextInt(), 2, 0);

                    System.out.println(" Sachet de dragibus = " + dragibus.getQty() + " Prix = " + dragibus.getPrixTotal()+ "E");

                    panier.getArticles().add(dragibus);

                    break;

                case "Réglisses":
                    System.out.println("Prix  sachet Réglisses  = 1E ");
                    System.out.print("Combien de sachet voulez vous ?");

                    Article reglisses = new Article("Réglisses", clavier.nextInt(), 1, 0);


                    System.out.println(" Sachets de réglisses = " + reglisses.getQty() + " Prix = " + reglisses.getPrixTotal()+ "E");

                    panier.getArticles().add(reglisses);

                    break;

                case "Cremeux":
                    System.out.println("Prix  paquets cremeux  = 1.5E ");
                    System.out.print("Combien de paquets voulez vous ?");

                    Article cremeux = new Article("Cremeux", clavier.nextInt(), 1.5, 0);


                    System.out.println(" Paquets de cremeux = " + cremeux.getQty() + " Prix = " + cremeux.getPrixTotal()+ "E");

                    panier.getArticles().add(cremeux);

                    break;
                case "Feuilles":
                    System.out.println("Prix  paquets 100 Feuilles  = 1E ");
                    System.out.print("Combien de paquets voulez vous ?");

                    Article feuilles = new Article("feuilles", clavier.nextInt(), 1, 0);

                    System.out.println(" Paquets de feuilles = " + feuilles.getQty() + " Prix = " + feuilles.getPrixTotal()+ "E");

                    panier.getArticles().add(feuilles);

                    break;

                case "Sopalins":
                    System.out.println("Prix  paquets 6 Sopalins = 2E ");
                    System.out.print("Combien de paquets voulez vous ?");

                    Article sopalins = new Article("Sopalins", clavier.nextInt(), 2, 0);

                    System.out.println(" Paquets de sopalins = " + sopalins.getQty() + " Prix = " + sopalins.getPrixTotal()+ "E");

                    panier.getArticles().add(sopalins);

                    break;

                case "Mouchoirs":
                    System.out.println("Prix  paquets de mouchoirs  = 1E ");
                    System.out.print("Combien de paquets voulez vous ?");

                    Article mouchoirs = new Article("mouchoirs", clavier.nextInt(), 1, 0);

                    System.out.println(" Paquets de mouchoirs = " + mouchoirs.getQty() + " Prix = " + mouchoirs.getPrixTotal()+ "E");

                    panier.getArticles().add(mouchoirs);

                    break;


            }

        }



        System.out.println("Votre Caddie a pour valeur : " + panier.valeurCadie()+"E");



    }
}



















