package Supermarket;


import java.util.Scanner;


public class MainSuperMarché {

    public static void main(String[] args) {



        Scanner clavier = new Scanner(System.in);


        System.out.println("Bienvenue à votre Supermarché en ligne");
        System.out.println();
        System.out.println("Pour faire vos courses consulter nos différents Rayons puis écrivez Caddie dans la console pour remplir votre panier");
        System.out.println();
        System.out.println("Voici nos différents rayons : Fruits,Légumes,Viandes,Boissons,Poissons,Bonbons,Utilitaires ");
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
                        System.out.println("Poulets,Jambon,Steak de Boeufs,Merguez");
                        break;
                    case "Boissons":
                        System.out.println("Eau Plates,Eau Pétillantes,Cocas");
                        break;
                    case "Poissons":
                        System.out.println("Colins,Saumons,Sardines,Thons");
                        break;
                    case "Bonbons":
                        System.out.println("Dragibus,Réglisses,Cremeux");
                        break;
                    case "Utilitaires":
                        System.out.println("Sopalins,mouchoire,Feuilles");
                }
            }
            System.out.println("Merci de Remplir vottre caddie en indiquant le nom de l'article voulu");

            System.out.println("Une fois votre Panier remplit Ecrivez Payez dans la console pour procéder au réglement");


            while (!articles.equals("Payer")) {

                articles = clavier.nextLine();

                switch (articles) {
                    case "Fraises":
                        System.out.println("Prix fraises unitaires = 1E");
                        System.out.print("Combien de fraises voulez vous ?");

                        //rfraises = fraises * nfraises;
                        Article fraise = new Article();
                        fraise.nom = "fraise";
                        fraise.prix = 1.0;
                        fraise.qty = clavier.nextInt();

                        panier.getArticles().add(fraise);


                        System.out.println("Fraises = " + fraise.qty + " Prix = " + fraise.getPrixTotal());

                        break;
                    case "Melons":
                        System.out.println("Prix melons unitaires = 3E");
                        System.out.print("Combien de melons voulez vous ?");
                        Article melons = new Article();
                        melons.nom = "Melons";
                        melons.prix = 3.0;
                        melons.qty = clavier.nextInt();

                        System.out.println("Fraises = " + melons.qty + " Prix = " + melons.getPrixTotal());

                        panier.getArticles().add(melons);


                        break;

                    case "Pommes":
                        System.out.println("Prix pommes unitaires = 2E");
                        System.out.print("Combien de fraises voulez vous ?");


                        Article pommes = new Article();
                        pommes.nom = "Pommes";
                        pommes.prix = 2.0;
                        pommes.qty = clavier.nextInt();

                        System.out.println("Pommes = " + pommes.qty + " Prix = " + pommes.getPrixTotal());

                        panier.getArticles().add(pommes);

                        break;

                    case "Abricots":
                        System.out.println("Prix pommes unitaires = 2E");
                        System.out.print("Combien de fraises voulez vous ?");

                        //rfraises = fraises * nfraises;
                        Article abricots = new Article();
                        abricots.nom = "Abricots";
                        abricots.prix = 2.0;
                        abricots.qty = clavier.nextInt();

                        System.out.println("Pommes = " + abricots.qty + " Prix = " + abricots.getPrixTotal());

                        panier.getArticles().add(abricots);

                    case "Péches":
                        System.out.println("Prix pommes unitaires = 3E");
                        System.out.print("Combien de fraises voulez vous ?");

                        Article peches = new Article();
                        peches.nom = "Péches";
                        peches.prix = 3.0;
                        peches.qty = clavier.nextInt();

                        System.out.println("Péches = " + peches.qty + " Prix = " + peches.getPrixTotal());

                        panier.getArticles().add(peches);


                    case "Poires":
                        System.out.println("Prix poires unitaires = 3E");
                        System.out.print("Combien de poires voulez vous ?");

                        Article poires = new Article();
                        poires.nom = "Poires";
                        poires.prix = 3.0;
                        poires.qty = clavier.nextInt();

                        System.out.println("Poires = " + poires.qty + " Prix = " + poires.getPrixTotal());

                        panier.getArticles().add(poires);


                        break;

                    case "Aubergines":
                        System.out.println("Prix  aubergines  unitaires = 3E");
                        System.out.print("Combien d'auberignes voulez vous ?");

                        Article aubergines = new Article();
                        aubergines.nom = "Aubergines";
                        aubergines.prix = 2.5;
                        aubergines.qty = clavier.nextInt();

                        System.out.println("Aubergines = " + aubergines.qty + " Prix = " + aubergines.getPrixTotal());

                        panier.getArticles().add(aubergines);

                        break;

                    case "Tomates":
                        System.out.println("Prix  tomates  unitaires = 3E");
                        System.out.print("Combien de tomates voulez vous ?");

                        Article tomates = new Article();
                        tomates.nom = "Aubergines";
                        tomates.prix = 2.5;
                        tomates.qty = clavier.nextInt();

                        System.out.println("Aubergines = " + tomates.qty + " Prix = " + tomates.getPrixTotal());

                        panier.getArticles().add(tomates);


                        break;

                    case "Carrotes":
                        System.out.println("Prix  carrotes  unitaires = 3E");
                        System.out.print("Combien de carrotes voulez vous ?");

                        Article carottes = new Article();
                        carottes.nom = "Aubergines";
                        carottes.prix = 2.5;
                        carottes.qty = clavier.nextInt();

                        System.out.println("Carottes = " + carottes.qty + " Prix = " + carottes.getPrixTotal());

                        panier.getArticles().add(carottes);



                        break;

                    case "Patates":
                        System.out.println("Prix  patates  unitaires = 0.5E");
                        System.out.print("Combien de patates voulez vous ?");

                        Article patates = new Article();
                        patates.nom = "Patates";
                        patates.prix = 0.5;
                        patates.qty = clavier.nextInt();

                        System.out.println("Patates = " + patates.qty + " Prix = " + patates.getPrixTotal());

                        panier.getArticles().add(patates);

                        break;

                    case "Poulets":
                        System.out.println("Prix  poulets  unitaires = 8E");
                        System.out.print("Combien de poulets voulez vous ?");

                        Article poulets = new Article();
                        poulets.nom = "Patates";
                        poulets.prix = 8.0;
                        poulets.qty = clavier.nextInt();

                        panier.getArticles().add(poulets);

                        System.out.println("Poulets = " + poulets.qty + " Prix = " + poulets.getPrixTotal());

                        break;

                    case "Jambon":
                        System.out.println("Prix  tranche jambon : 0.3E ");
                        System.out.print("Combien de tranche de jambon voulez vous ?");

                        Article jambons = new Article();
                        jambons.nom = "Jambons";
                        jambons.prix = 2.5;
                        jambons.qty = clavier.nextInt();

                        System.out.println("Tranche de jambons = " + jambons.qty + " Prix = " + jambons.getPrixTotal());

                        panier.getArticles().add(jambons);

                        break;

                    case "Steak de Boeufs":
                        System.out.println("Prix  Steak  unitaires = 1.5E");
                        System.out.print("Combien de Steak  voulez vous ?");

                        Article steak = new Article();
                        steak.nom = "Patates";
                        steak.prix = 1.5;
                        steak.qty = clavier.nextInt();

                        System.out.println(" Steak = " + steak.qty + " Prix = " + steak.getPrixTotal());

                        panier.getArticles().add(steak);

                        break;

                    case "Meguez":
                        System.out.println("Prix  Merguez = 1E");
                        System.out.print("Combien de Merguez  voulez vous ?");

                        Article merguez = new Article();
                        merguez.nom = "Merguez";
                        merguez.prix = 1.0;
                        merguez.qty = clavier.nextInt();

                        System.out.println(" Merguez = " + merguez.qty + " Prix = " + merguez.getPrixTotal());

                        panier.getArticles().add(merguez);



                        break;

                    case "Eau Plate":
                        System.out.println("Prix  Eau Plate 1L = 0.3E");
                        System.out.print("Combien de Bouteille   voulez vous ?");

                        Article eau = new Article();
                        eau.nom = "Eau Plate";
                        eau.prix = 0.3;
                        eau.qty = clavier.nextInt();

                        System.out.println(" Bouteilles d'eau = " + eau.qty + " Prix = " + eau.getPrixTotal());

                        panier.getArticles().add(eau);

                        break;

                    case "Eau Pétillante":
                        System.out.println("Prix  Eau pétillante 1L = 0.4E");
                        System.out.print("Combien de Bouteille   voulez vous ?");

                        Article eaup = new Article();
                        eaup.nom = "Eau Plate";
                        eaup.prix = 0.4;
                        eaup.qty = clavier.nextInt();

                        System.out.println(" Bouteilles d'eau pétilanntes= " + eaup.qty + " Prix = " + eaup.getPrixTotal());

                        panier.getArticles().add(eaup);

                        break;

                    case "Cocas":
                        System.out.println("Prix  Coca 1L = 1E");
                        System.out.print("Combien de Bouteille   voulez vous ?");

                        Article cocas = new Article();
                        cocas.nom = "Eau Plate";
                        cocas.prix = 1;
                        cocas.qty = clavier.nextInt();

                        System.out.println(" Bouteilles de Cocas= " + cocas.qty + " Prix = " + cocas.getPrixTotal());

                        panier.getArticles().add(cocas);

                        break;

                    case "Colins":
                        System.out.println("Prix  200g Colins  = 2.5E ");
                        System.out.print("Combien de Colins   voulez vous ?");

                        Article colins = new Article();
                        colins.nom = "Colins";
                        colins.prix = 2.5;
                        colins.qty = clavier.nextInt();

                        System.out.println(" Tranche 200G de Colins = " + colins.qty + " Prix = " + colins.getPrixTotal());

                        panier.getArticles().add(colins);

                        break;

                    case "Saumons":
                        System.out.println("Prix  200g saumons  = 3.5E ");
                        System.out.print("Combien de saumons  voulez vous ?");

                        Article saumons = new Article();
                        saumons.nom = "Saumons";
                        saumons.prix = 2.5;
                        saumons.qty = clavier.nextInt();

                        System.out.println(" Tranche 200G de saumons = " + saumons.qty + " Prix = " + saumons.getPrixTotal());

                        panier.getArticles().add(saumons);

                        break;

                    case "Sardines":
                        System.out.println("Prix  boites Sardines  = 3E ");
                        System.out.print("Combien de boites  voulez vous ?");

                        Article sardines = new Article();
                        sardines.nom = "Sardines";
                        sardines.prix = 2.5;
                        sardines.qty = clavier.nextInt();

                        System.out.println(" Tranche 200G de saumons = " + sardines.qty + " Prix = " + sardines.getPrixTotal());

                        panier.getArticles().add(sardines);

                        break;

                    case "Thons":
                        System.out.println("Prix  Piéce 300G Thon  = 3E ");
                        System.out.print("Combien de tranche voulez vous ?");

                        Article thons = new Article();
                        thons.nom = "Thons";
                        thons.prix = 3;
                        thons.qty = clavier.nextInt();

                        System.out.println(" Tranche 300G Thon = " + thons.qty + " Prix = " + thons.getPrixTotal());

                        panier.getArticles().add(thons);

                        break;

                    case "Dragibus":
                        System.out.println("Prix  sachet dragibus  = 2E ");
                        System.out.print("Combien de sachet voulez vous ?");

                        Article dragibus = new Article();
                        dragibus.nom = "Dragibus";
                        dragibus.prix = 2;
                        dragibus.qty = clavier.nextInt();

                        System.out.println(" Sachet de dragibus = " + dragibus.qty + " Prix = " + dragibus.getPrixTotal());

                        panier.getArticles().add(dragibus);

                        break;

                    case "Réglisses":
                        System.out.println("Prix  sachet Réglisses  = 1E ");
                        System.out.print("Combien de sachet voulez vous ?");

                        Article reglisses = new Article();
                        reglisses.nom = "Réglisses";
                        reglisses.prix = 1;
                        reglisses.qty = clavier.nextInt();

                        System.out.println(" Sachets de réglisses = " + reglisses.qty + " Prix = " + reglisses.getPrixTotal());

                        panier.getArticles().add(reglisses);

                        break;

                    case "Crémeux":
                        System.out.println("Prix  paquets cremeux  = 1.5E ");
                        System.out.print("Combien de paquets voulez vous ?");

                        Article cremeux = new Article();
                        cremeux.nom = "Réglisses";
                        cremeux.prix = 1.5;
                        cremeux.qty = clavier.nextInt();

                        System.out.println(" Paquets de cremeux = " + cremeux.qty + " Prix = " + cremeux.getPrixTotal());

                        panier.getArticles().add(cremeux);

                        break;
                    case "Feuilles":
                        System.out.println("Prix  paquets 100 Feuilles  = 1E ");
                        System.out.print("Combien de paquets voulez vous ?");

                        Article feuilles = new Article();
                        feuilles.nom = "Feuilles";
                        feuilles.prix = 1;
                        feuilles.qty = clavier.nextInt();

                        System.out.println(" Paquets de feuilles = " + feuilles.qty + " Prix = " + feuilles.getPrixTotal());

                        panier.getArticles().add(feuilles);

                        break;

                    case "Sopalins":
                        System.out.println("Prix  paquets 6 Sopalins = 2E ");
                        System.out.print("Combien de paquets voulez vous ?");

                        Article sopalins = new Article();
                        sopalins.nom = "Sopalins";
                        sopalins.prix = 1.5;
                        sopalins.qty = clavier.nextInt();

                        System.out.println(" Paquets de sopalins = " + sopalins.qty + " Prix = " + sopalins.getPrixTotal());

                        panier.getArticles().add(sopalins);

                        break;

                    case "Mouchoirs":
                        System.out.println("Prix  paquets de mouchoirs  = 1E ");
                        System.out.print("Combien de paquets voulez vous ?");

                        Article mouchoirs = new Article();
                        mouchoirs.nom = "Réglisses";
                        mouchoirs.prix = 1;
                        mouchoirs.qty = clavier.nextInt();

                        System.out.println(" Paquets de cremeux = " + mouchoirs.qty + " Prix = " + mouchoirs.getPrixTotal());

                        panier.getArticles().add(mouchoirs);

                        break;


                }

        }


            double prixTotal =0;





            System.out.println("Votre cadie a pour valeur : " + panier.valeurCadie());


    }
}



















