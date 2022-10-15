import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        //Vérification de la validitée de la carte
        for(int i = 0; i < carte.length; ++i) {
            int idxDebut = 0;
            int current = 0;

            while(((carte[i][idxDebut] == 0) || (carte[i][idxDebut] == 1)) && (idxDebut < carte.length)) {
                ++idxDebut;
                current = carte[i][idxDebut];
            }

            if((carte[i][idxDebut] != 0) && (carte[i][idxDebut] != 1)) {
                System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                System.out.print(current);System.out.print("' trouvée en position [");
                System.out.print(i);
                System.out.print("][");
                System.out.print(idxDebut);
                System.out.println("]");
                break;
            }
        }

        //Comblage des étangs dans la carte

        for(int i = 0; i < carte.length; ++i) {
            int idxDebut = 0;

            while(carte[i][idxDebut] == 0) {
                ++idxDebut;
            }
            int idxFin = (carte[i].length-1);

            while(carte[i][idxFin] == 0) {
                --idxFin;
            }

            for(int j = idxDebut; j <= idxFin; ++j) {
                carte[i][j] = 1;
            }
        }

        //Calcul superficie
                //calcul clotûre bordures

        int compteur = 0;
        int compteur3 = 0;
        for(int i = 0; i < carte.length; ++i) {

            if(carte[i][carte[i].length-1] == 1)
                ++compteur;

            if(carte[i][0] == 1)
                ++compteur;

            if(i == 0) {
                int idxDebut = 0;
                int idxFin = (carte[i].length-1);
                int compteur2 = 0;

                while(carte[i][idxDebut] == 0) {
                    ++idxDebut;
                }

                while(carte[i][idxFin] == 0) {
                    --idxFin;
                    ++compteur2;
                }

                compteur3 += ((carte[i].length) - compteur2 - idxDebut);
            }

            if(i == (carte.length-1)) {
                int idxDebut = 0;
                int idxFin = (carte[i].length-1);
                int compteur2 = 0;

                while(carte[i][idxDebut] == 0) {
                    ++idxDebut;
                }

                while(carte[i][idxFin] == 0) {
                    --idxFin;
                    ++compteur2;
                }

                compteur3 += ((carte[i].length) - compteur2 - idxDebut);
            }

        }
        int bordure = compteur3 + compteur;

        if(carte[0][0] == 0) {
            bordure += 2;
        }
        if(carte[carte.length-1][0] == 0) {
            bordure += 2;
        }
        if(carte[0][carte[0].length-1] == 0) {
            bordure += 2;
        }
        if(carte[carte.length-1][carte[28].length-1] == 0) {
            bordure += 2;
        }


                //Centre

        int centre = 0;
        for(int i = 1; i < carte.length-1; ++i) {
            for(int j = 1; j < (carte.length-1); ++j) {

                if(carte[i][j] == 1) {
                    if(carte[i][j-1] == 0) {
                        ++centre;
                    }
                    if(carte[i][j+1] == 0) {
                        ++centre;
                    }
                    if(carte[i-1][j] == 0) {
                        ++centre;
                    }
                    if(carte[i+1][j] == 0) {
                        ++centre;
                    }
                }
            }
        }

                //Métres de clotures
        int cloture = centre + bordure;
        double metreCloture = 2.5 * cloture;




        System.out.print("Il vous faut ");
        System.out.print(metreCloture);
        System.out.println(" mètres de clôture pour votre terrain.");








        //System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
        //System.out.print("' trouvée en position [");
        //System.out.print("][");
        //System.out.println("]");

        //System.out.println("Votre carte du terrain n'a pas le bon format :");
        //System.out.print("bord extérieur entrant trouvé en position [");
        //System.out.print("][");
        //System.out.println("]");

        //System.out.print("Il vous faut ");
        //System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
