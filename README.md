# Projet-open-food-fact-benoit-gueheneux
Application de gestion de produits nutritionnels. 
Ce programme lit les données de produits dans un fichier CSV et les insère dans une base de données relationnelle.
# Emplacement des données
Le fichier CSV doit se situer dans un répertoire "donnees/" sur la racine du projet.
# Connection a la base de données
Configurez le fichier "persistence.xml" afin de vous connecter à votre propre base de données.
Par défaut, la base de données est une base de donnée MySQL localhost sur le port 3306 de 
nom=projet 
avec un acces 
user=projet 
mdp=projet.
Par défaut, le programme écrasera la database si elle existe pour la recréer entièrement.
