package jeudelavie;

public class JeuDeLaVie {

    //
    // Les 4 constantes demandées
    //
    public final static int LARGEUR = 128;
    public final static int HAUTEUR = 128;
    public final static int TAILLE_POINT_EN_PIXELS = 5;
    public final static int FPS = 30;

    //
    // La méthode demandée pour créer notre plateau du "jeu de la vie"
    //
    public static boolean[][] plateauDuJeuDeLaVie_creer() {
        return new boolean[HAUTEUR][LARGEUR];
    }

    //
    // La méthode demandée pour mettre un contenu aléatoire dans les cellules
    //
    public static void plateauDuJeuDeLaVie_contenuAleatoire(boolean[][] cells) {
        // Initialisation avec des valeurs aléatoires
        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells[0].length; y++) {
                cells[x][y] = (Math.random() < 0.5);
            }
        }
    }

    //
    // La méthode demandée pour compter le nombre de voisins vivants de l'une de nos cellules
    //
    public static int nbreDeVoisins(boolean[][] cells, int x, int y) {

        // Le nombre de voisins vivants (valeur initiale) de la cellule x/y
        int voisins = 0;

        // Les coordonnées x/y juste à gauche, juste à droite, juste au-dessus, juste en-dessous de x/y
        int x_gauche = x - 1;
        int x_droite = x + 1;
        int y_haut = y - 1;
        int y_bas = y + 1;

        if (x_gauche < 0) {
            x_gauche = cells.length - 1;
        }
        if (x_droite > (cells.length - 1)) {
            x_droite = 0;
        }

        if (y_haut < 0) {
            y_haut = cells[0].length - 1;
        }
        if (y_bas > (cells[0].length - 1)) {
            y_bas = 0;
        }

        // Calcul du nombre de voisins
        if (cells[x_gauche][y_haut]) {
            voisins++;
        }
        if (cells[x_gauche][y]) {
            voisins++;
        }
        if (cells[x_gauche][y_bas]) {
            voisins++;
        }
        if (cells[x][y_haut]) {
            voisins++;
        }
        if (cells[x][y_bas]) {
            voisins++;
        }
        if (cells[x_droite][y_haut]) {
            voisins++;
        }
        if (cells[x_droite][y]) {
            voisins++;
        }
        if (cells[x_droite][y_bas]) {
            voisins++;
        }

        return voisins;
    }

    //
    // La méthode demandée pour calculer le nouvel état du jeu d'après l'ancien
    //
    public static boolean[][] plateauDuJeuDeLaVie_calculerProchainEtat(boolean[][] cells) {

        // On commence par créer le plateau contenant le nouvel état
        boolean[][] newcells = new boolean[HAUTEUR][LARGEUR];

        //  On traite chaque cellule afin de :
        //    a) compter le nombre de voisins en vie puis
        //    b) tuer ou donner vie selon les règles
        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells[0].length; y++) {
                // Combien de voisins en vie a-t-elle ?
                int nbreVoisins = nbreDeVoisins(cells, x, y);
                // Son état actuel est-il vivant ?
                if (cells[x][y]) {
                    // Va-t-elle le reste ?
                    newcells[x][y] = (nbreVoisins == 2) || (nbreVoisins == 3);
                } else {
                    // La vie va-t-elle apparaître ?
                    newcells[x][y] = (nbreVoisins == 3);
                }
            }
        }

        return newcells;
    }

    public static void main(String[] args) {
        // Démarrer le jeu de la vie
        go();   // Cette méthode est dans la zone de code cachée, il ne faut rien toucher !!!
    }

// <editor-fold defaultstate="collapsed" desc="NE RIEN TOUCHER AU CODE CACHÉ ICI !!!">                          
    public static void go() {
        // Définir le look&feel visuel des fenêtres Swing
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

        // Créer une instance du jeu et le démarrer
        JeuDeLaVie jeuDeLaVie = new JeuDeLaVie();
        jeuDeLaVie.start();
    }

    public void start() {
        // On crée une tâche qui va créer une fenêtre (notre LifeFrame) et le rendre visible à l'écran
        // Ce LifeFrame contient le jPanel modifié qui affichera l'évolution du "jeu de la vie"
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LifeFrame().setVisible(true);
            }
        });

    }

    public class LifePanel extends javax.swing.JPanel {

        // Le contenu des cellules du jeu
        private boolean[][] etat;

        public LifePanel() {
            // Création des cellules du jeu de la vie
            this.etat = plateauDuJeuDeLaVie_creer();

            java.awt.Dimension dimensions = new java.awt.Dimension(LARGEUR * TAILLE_POINT_EN_PIXELS, HAUTEUR * TAILLE_POINT_EN_PIXELS);
            setPreferredSize(dimensions);
            setMinimumSize(dimensions);
            setMaximumSize(dimensions);

            // Initialisation avec des valeurs aléatoires
            plateauDuJeuDeLaVie_contenuAleatoire(etat);

            // L'ensemble du fond est noir
            setBackground(java.awt.Color.BLACK);

            // Créer un timer qui se chargera de calculer le prochain état et de l'afficher à la fréquence demandée
            // Si FPS = 2 c'est-à-dire 2x par seconde => 1000/2 = 500ms d'attente entre deux affichages
            javax.swing.Timer animation = new javax.swing.Timer(1000 / FPS, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // Cycle du jeu de la vie
                    etat = plateauDuJeuDeLaVie_calculerProchainEtat(etat);
                    // Redessiner le contenu
                    repaint();
                }
            });

            // Ajouter un écouteur pour les clicks dans la fenêtre pour arrêter/démarrer l'animation
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    if (animation.isRunning()) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }

                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {

                }
            });

            // Par défaut l'animation est dans l'état démarrée
            animation.start();
        }

        @Override
        public void paintComponent(java.awt.Graphics g) {
            // On demande au parent de se redessiner 
            super.paintComponent(g);
            // Cellule par cellule, les dessiner selon leur états
            for (int i = 0; i < etat.length; i++) {
                for (int j = 0; j < etat[0].length; j++) {
                    g.setColor(etat[i][j] ? java.awt.Color.GREEN : java.awt.Color.DARK_GRAY);
                    g.fillRect(j * TAILLE_POINT_EN_PIXELS, i * TAILLE_POINT_EN_PIXELS, TAILLE_POINT_EN_PIXELS - 1, TAILLE_POINT_EN_PIXELS - 1);
                }
            }
        }

    }

    public class LifeFrame extends javax.swing.JFrame {

        /**
         * Creates new form NewJFrame
         */
        public LifeFrame() {
            jLifePanel = new LifePanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Jeu de la vie - Module 403 - Paul Friedli 2017/2018");

            setResizable(false);
            setLayout(new java.awt.BorderLayout());
            add(jLifePanel, java.awt.BorderLayout.CENTER);
            pack();
            setLocationRelativeTo(null);  //Screen center
            setVisible(true);
        }

        private LifePanel jLifePanel;
    }

// </editor-fold>             
}
