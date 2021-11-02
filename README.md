# ToSucceed.com

##Description

L'objectif de ce site web est de fournir une plateforme de cours en ligne, allant de l'école primaire au collège.
Il contiendra les éléments suivants :

- Plusieurs sections, proposant différents cours payants, dans différentes manières
- Un espace pour s'inscrire/se connecter (mode admin/mode client), avec un système de confirmation par mail
- Un espace personnel afin de consulter son profil (informations personnelles, cours consultés)
- Des moyens de communication entre les clients et les propriétaires du site
- Des rubriques sur la page d'accueil (citation du jour, conseil du jour, histoire du jour...)
- Un accès aux réseaux sociaux 



Afin de créer ce service web, nous utiliserons le framework Spring Boot de Java.

Nous utiliserons une base de données PostgreSql ou Mysql.



Voici une ébauche du site :

![Aucune description disponible.](https://scontent-cdg2-1.xx.fbcdn.net/v/t1.15752-9/243190875_1298246010605636_3773968241045923314_n.png?_nc_cat=108&ccb=1-5&_nc_sid=ae9488&_nc_ohc=fZjPDIr-fT0AX8hO08-&_nc_ht=scontent-cdg2-1.xx&oh=49a2d7849520ef204ee64ea3fbc69e50&oe=618D77E9)

Voici une ébauche du diagramme UML :

![Aucune description disponible.](https://scontent-cdg2-1.xx.fbcdn.net/v/t1.15752-9/245163936_595822478225150_5257693332386759412_n.png?_nc_cat=107&ccb=1-5&_nc_sid=ae9488&_nc_ohc=Q3BgBzmbzUwAX9vh5_W&_nc_ht=scontent-cdg2-1.xx&oh=cc629e054275506207a3a5b2133aed3e&oe=618CDCFA)


##Diagrammes UML : 

###Définition des cas d’utilisation et diagramme des cas d'utilisation : 

	- Tous les utilisateurs : S’inscrire/Se Connecter
	
	
	- Etudiant :
		* S’abonner
		* Consulter cours (si accès)
			Sélectionner la classe 
			Sélectionner la matière 
		* Laisser un avis
		* Envoyer un message au professeur
		* Envoyer une question dans la FAQ
		
	
	- Professeur:
		* Publier du contenu :
		* Cours
		* Répondre aux avis 
		* Répondre aux étudiants en privé
		* Répondre aux questions de la FAQ  
	
	
	- Administrateur : 
		* Accès à une page administration du site qui comprend des statistiques
		* nombre d’étudiants et professeurs inscrits
		* cours les plus visités, les mieux notés
		* nombre d’heures passées sur la plateforme par jour…..
		* Publier Phrase du jour
		* Possibilité de changer le front et le back du site
		
Diagrammes des cas d'utilisation : 

<img width="639" alt="Capture d’écran 2021-11-02 à 20 48 52" src="https://user-images.githubusercontent.com/86744698/139962581-ef0ae711-146e-44c4-a9c3-f2657f5d80ad.png">


### Définition des classes et Diagrammes des classes:

Liste des classes :

	- Personnes
	- Admin
	- Elève
	- Professeur 
	- Abonnement
	- Cours
	- Commentaire 
	- Message_du_jour

Diagramme des classes :

![image](https://user-images.githubusercontent.com/90780614/139962118-f0fb302a-05fe-488f-93d9-677e020aede1.png)


