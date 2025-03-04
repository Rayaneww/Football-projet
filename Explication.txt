1. Classe Match
La classe Match contient la méthode main où tout le programme est exécuté. Elle est utilisée pour tester le fonctionnement des autres classes.

Création d'un objet Score (match PSG - OM) :

L'objet psg_om est une instance de la classe Score qui représente le score d'un match.
Ensuite, des actions sont effectuées sur cet objet comme le démarrage du match (psg_om.commencer()), l'ajout de buts pour chaque équipe (butEquipe1(), butEquipe2()), et la fin du match (psg_om.termine()).
Après chaque action, le statut du match et le score sont affichés.
Création d'objets Equipe et EquipeArray :

Equipe : Un tableau d'équipes avec un nombre fixe de joueurs. Les joueurs peuvent être ajoutés ou retirés de l'équipe.
EquipeArray : Une autre implémentation qui utilise un ArrayList pour gérer dynamiquement les joueurs de l'équipe.
Les joueurs sont ajoutés et retirés, puis affichés à l'aide de toLongString().

2. Classe Equipe
La classe Equipe représente une équipe de football avec un nom, un sigle, et un tableau de joueurs.

Attributs :
nom : Nom complet de l'équipe.
sigle : Sigle de l'équipe (ex : PSG pour Paris Saint-Germain).
joueurs : Un tableau de chaînes de caractères représentant les joueurs de l'équipe.
Méthodes :

arivee(String j) : Ajoute un joueur à l'équipe. La taille du tableau est augmentée, et l'élément joueur est ajouté à la fin.
depart(String j) : Retire un joueur de l'équipe. Un nouveau tableau est créé sans le joueur retiré, et l'ancien tableau est remplacé par le nouveau.
toString() : Retourne une chaîne contenant le nom et le sigle de l'équipe.
toLongString() : Affiche un tableau avec les joueurs de l'équipe. Le sigle est affiché dans une case, suivi de chaque joueur dans une case sous forme de tableau formaté.

3. Classe EquipeArray
La classe EquipeArray fonctionne de manière similaire à la classe Equipe, mais elle utilise un ArrayList pour stocker les joueurs. Cela permet une gestion plus flexible des joueurs (ajouter ou retirer des joueurs sans avoir à redimensionner un tableau manuellement).

Attributs :

nom : Nom de l'équipe.
sigle : Sigle de l'équipe.
joueurs : Une ArrayList<String> qui stocke les joueurs.
Méthodes :

arivee(String j) : Ajoute un joueur à l'ArrayList.
depart(String j) : Retire un joueur de l'ArrayList.
toString() : Retourne le nom et le sigle de l'équipe.
toLongString() : Affiche un tableau avec les joueurs de l'équipe, formaté comme dans la classe Equipe.
4. Classe Score
La classe Score gère le score d'un match. Elle permet de suivre l'état du match (en cours, à venir, ou terminé) ainsi que les buts de chaque équipe.

Attributs :

etat : Un caractère représentant l'état du match : 'a' (à venir), 'c' (en cours), 't' (terminé).
butsEq1 : Nombre de buts de la première équipe.
butsEq2 : Nombre de buts de la deuxième équipe.
Méthodes :

getStatut() : Retourne l'état actuel du match.
getButsEquipe1() et getButsEquipe2() : Retourne les buts respectifs des deux équipes.
butEquipe1() et butEquipe2() : Ajoutent un but pour l'équipe 1 ou l'équipe 2 respectivement, mais uniquement si le match est en cours (etat == 'c').
afficherbuts() : Retourne une chaîne représentant le score actuel sous la forme butsEq1:butsEq2.
commencer() : Modifie l'état du match pour indiquer qu'il est en cours ('c').
termine() : Modifie l'état du match pour indiquer qu'il est terminé ('t').
