# Exercices de Programmation Multi-Threads en Java

Ce projet contient deux exercices illustrant des concepts de programmation multi-threads en Java. Chaque exercice met en œuvre une approche spécifique pour gérer l'exécution parallèle.

---

## Exercice 1 : Affichage de Threads avec la classe `Runnable`

### **Description**
Ce programme crée une classe `Talkative` qui implémente l'interface `Runnable`. Chaque instance de `Talkative` affiche 100 fois un identifiant unique dans un environnement multi-threads.

### **Étapes du programme**
1. Une classe `Talkative` contient un attribut entier défini dans son constructeur.
2. La méthode `run` affiche 100 fois la valeur de cet attribut.
3. Dans la méthode principale (`main`), 10 threads sont créés et démarrés, chacun exécutant une instance unique de `Talkative`.

### **Conclusion**
L'exécution des threads illustre un aspect essentiel c'est à dire le non-déterminisme, car l'ordre d'accès au CPU est imprévisible.

---

## Exercice 2 : Somme parallèle avec gestion de synchronisation

### **Description**
Ce programme calcule la somme des éléments d'une liste d'entiers en utilisant plusieurs threads. Chaque thread traite une plage spécifique d'indices, et les résultats partiels sont combinés pour obtenir la somme totale. Une synchronisation est utilisée pour éviter les conflits lors de l'accès à la variable partagée.

### **Étapes du programme**

#### **Classe `Sommeur`**
1. La classe `Sommeur` implémente l'interface `Runnable` et représente une tâche responsable de calculer la somme des éléments d'une sous-liste.
3. La méthode `run()` :
    - Calcule la somme partielle des éléments dans la plage spécifiée.
    - Protège la mise à jour de la variable `somme` à l'aide d'un bloc `synchronized` pour éviter des accès concurrents.

#### **Classe `Main`**
1. Une liste d'entiers est divisée en des plages :
2. Ensemble threads sont créés et démarrés avec des instances de la classe `Sommeur`.
3. La méthode `join()` est utilisée pour attendre que tous les threads terminent leur exécution.
4. La somme totale des éléments est affichée en utilisant la méthode `getSomme()`.

