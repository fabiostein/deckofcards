
To Execute the deck of cards
Follow the steps:
1) Clone the git repository
git clone https://github.com/fabiostein/deckofcards.git

2) Execute the gradl command do build and execute the project
gradle clean build jettyRunWar

3) Open the Browser and put follow URL, replacing the {number} per number Of cards that you want request.
http://localhost:8080/deckofcards/cards/{number]

E.g
You want to request 10 cards from the deck, So the url will be:
	http://localhost:8080/deckofcards/cards/10


	
Author;
Fabio Stein

