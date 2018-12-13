# Lean primer

_Sami Nurmivaara_

_[Alkuperäisteos](http://www.jpattonassociates.com/the-new-backlog/)_

_Kirjoittajat: Jeff Patton_

Tekstissä tarjotaan ketterässä sovelluskehityksessä käytetyn tasaisen backlogin korvaajaksi tarinakarttaa (Story map). Artikkelissa ei käsitellä DEEP-backlogeja joka on tällä kurssilla tutuksi käynyt konsepti saman aiheen parista, johon en kuitenkaan tässä referaatissa vedä vertauksia, koska se ei ole artikkelin aiheena.

## Referaatti
***

Jeff Patton aloittaa kirjoituksensa kuvailemalla miksi perinteinen tasainen backlog ei oikeastaan toimi. Syyksi kuvataan tapa jossa ensin muodostetaan jokin visio suuremmasta kuvasta, jonka jälkeen pilkotaan tämä visio pienempiin aktiviteetteihin ja siitä vielä yksittäisiin ominaisuuksiin. Vertauskuvana voidaan käyttää ideaa puusta, lehtikasasta ja lehdillä täytetystä jätesäkistä.

Puu koostuu puun rungosta, joka kuvaa sovelluksen tavoitteita ja ideoita. Isot oksat ovat sovelluksen käyttäjät. Pienemmät oksat ja risut ovat ominaisuuksia jotka käyttäjät tarvitsevat ja lehdet yksittäisiä käyttäjätarinoita (User stories) joita voidaan laittaa yksittäisiin sovelluskehityksen sykleihin (esim. Sprintteihin).

![Puu](http://www.jpattonassociates.com/wp-content/uploads/2008/10/fall_tree.jpg)

Tämän jälkeen kehitystiimi rikkoo tämän kokonaiskuvan vain yksittäisiin käyttäjätarinoihin, ikään kuin keräävät puusta lehdet pois ja hylkäävät/tuhoavat itse puun.

![Lehdet](http://www.jpattonassociates.com/wp-content/uploads/2008/10/pile_of_leaves.jpg)

Jonka jälkeen nämä käyttäjätarinat tungetaan jätesäkkiin, josta ne kyllä löytyvät, mutta konteksti ei ole enää ihmiselle intuitiivisessa muodossa.

![Jätesäkki](http://www.jpattonassociates.com/wp-content/uploads/2008/10/trash_bag.jpg)

### Tarinakartta

Koko tämän prosessin korvaajaksi tarjotaan ideaa eräänlaisesta kartasta, johon sovelluksen koko idea, käyttäjien tarpeet ja käyttäjätarinat saadaan lisättyä visuaalisesti helposti ymmärrettävään muotoon.

![Story map](http://www.jpattonassociates.com/wp-content/uploads/2008/10/story_map_diagram.png)

Kartan ylimmältä riviltä löytyvät "suuret tarinat", joita halutaan kutsuakin käyttäjien aktiviteeteiksi, termi joka lainataan käyttäjäkokemusasiantuntijoilta ("UX people") Larry Constantinelta ja Don Normaalta. Yksittäinen aktiviteetti on jokin iso asia, mitä käyttäjä haluaa tehdä. Jotain mikä sisältää monta askelta, mutta ei välttämättä selkeää suoritusjärjestystä. Sähköpostisovelluksessa tämä voisi olla esimerkiksi "Käyttäjä haluaa hallita sähköpostiaan" tai "Ylläpitäjä haluaa konfiguroida sähköpostipalvelimen". Aktiviteeteile voidaan kirjoittaa myös kuvaava tarina, kuten: "Konsulttina haluan hallita sähköpostejani, jotta voin pitää yhteyttä asiakkaisiin, työkavereihin ja ystäviini"

Aktiviteet sitten pilkotaan pienempiin tarinoihin kuten "lähetä vietsi", "lue viesti", "poista viesti" jne. Syystä X tekstissä halutaan määritellä nämä käyttäjätehtäviksi, koska ne ovat tehtäviä joita käyttäjät tekevät.

Tämän jälkeen jaotellaan tarinat kokojärjestyksessä ylhäältä alas. Tehtävät myös jaetaan käyttäjän käyttämisprosessin mukaisesti kronologisesti vasemmalta oikealle.

### Sovelluksen rakenne

Jokaisella sovelluksella on rakenne, jota voi visualisoida eräänlaisena luurangon selkärankana ja kylkiluina. Tarkoituksena on, että tarinakartan toiseksiylimmät tarinat ovat sellaisia, jotka toteuttamalla saadaan prototyyppi - MVP - aikaan. Selkärankana toimii sovelluksen suurimmat tehtävät, joista sitten lähtee kylkiluita joihin jaotellaan tehtävän toteuttamisen vaativat pienemmät tarinat tärkeysjärjestyksessä. Tämä mahdollistaa projektin kokonaiskuvan ymmärtämisen vilkaisulla - jos joku haluaa tietää ohjelman perustoiminnan riittää kulkea ylin rivi läpi ja tarkennuksia pyydettäessä voi sitten tarvittaessa edetä listaa alaspäin.

![Walking skeleton map](http://www.jpattonassociates.com/wp-content/uploads/2008/10/backbone_and_skeleton.png)