# Lean primer

_Sami Nurmivaara_

_[Alkuperäisteos](http://www.leanprimer.com/downloads/lean_primer.pdf)_

_Kirjoittajat: Craig Larman ja Bas Vodde_

Lean Primer on kattava pintaraapaisu Lean -ajattelumallista.

Teoksessa edetään ensin esittelemällä Leanin kaksi tärkeintä periaatetta, tai "pilarit" kuten Leanissa määritellään. Suomennettuna nämä koko järjestelmän perusperiaatteet ovat "Jatkuva kehitys" ja "Ihmisten kunnioittaminen". Aihe pysyy pinnalla oikeastaan koko teoksessa, koska kirjoittajien mielestä useilla menee ohi Leanin tarkoitus olla *ajattelu- ja toimintamalli* konkreettisen *työkaluvalikoiman* sijasta.

Kirjassa käytetään hyvin lainauksia, vertauskuvia ja visualisointia apuna kokonaisuuden esittelyssä. Hauskana yksityiskohtana voi huomata sivulla 16 alamainintana "We avoid Japanese terms unless no English term works", joka ei mielestäni suurimman osan ajasta tunnu olevan tilanne. Teos tuntuu osittain pieneltä japanintunnilta, mikä ei mielestäni tosin ole huono asia.

Teos on virkistävän pohtiva ja filosofinen, välttäen yleiset "Tee näin niin liiketoimintasi menestyy"-kikat. Sanoma on enemmänkin valistava ja vaihtoehtoja tarjoava, joka jättää sopivan määrän pohtimista ja pääteltävää lukijalle. Teos vaihtelee esittelemisen, yleisten harhakäsitysten korjauksen ja itsekriittisen pohdinnan välillä sujuvasti, kuitenkin toisinaan hieman kompastuen lyhenne ja lainasanaviidakkoonsa.

## Referaatti
***

### Lean

Tiivistettynä Lean Primer:in tarkoituksena on selvittää lukijalle Lean-ajattelumallin (jatkossa pelkästään Lean) periaatteita, korjata yleisiä virhekäsityksiä ja kannustaa omaan ajattelemiseen ja tulkintaan aiheesta.

Lean on Toyotan luoman Toyota Wayn pohjalta muotoiltu prosessinhallinta ja kehitysmalli. Leanin perusperiaatteita on kaksi: jatkuva kehittyminen ja ihmisten kunnioittaminen. Teoksessa keskitytään paljon muistuttamaan että erilaiset hallinnon työkalut _eivät_ ole osa Leania.

> Reducing lean thinking to kanban, queue management and other tools is like reducing a  working  democracy  to  voting.

Lean onkin siis enemmän jopa filosofinen ajattelu- ja käyttäytymismalli, jonka tulee lähteä jokaisesta työntekijästä yrityksen johtajasta yksittäisen tuotantolinjan yksittäiseen työntekijään. Esimerkkinä Toyotalla uudet työntekijät käyvät läpi kattavan koulutuksen jossa heidät opetetaan tarkastelemaan omaa toimintaansa ja miettimään kuinka sitä voisi parantaa, jatkuvan kehittymisen hengessä. Teoksessa käytetään näistä havainnosta sanaa _kaizen_, joka on japania ja kääntyy kirjaimellisesti parannukseksi, edistykseksi tai jalostukseksi. Mielestäni on melkein mielekästä säilyttää nämä kaikki sanat mukaan, koska kaikki niistä pätevät. Esimerkki _kaizen_-hetkestä voisi olla esimerkiksi sovelluskehitys-sprintin jälkeinen retrospekti ja sen aikana tehdyt havainnot ja parannusideat.

> Kaizen is both a personal mindset and a practice. As a mindset, it suggests _“My work is to do my work and to improve my work”_ and _“continuously improve for its own sake.”_

Yksi Leanista erityisesti mainituista ideoista on "jätteen" vähentäminen. Tämä ei kuitenkaan ole yksi peruspilareista, vaikka se usein onkin yksi tärkeimpiä keinoja kehittymiseen. Jäte määritellään Leanissa prosesseina jotka vievät resursseja, mutta eivät lisää _arvoa_. Arvo taas määritellään tekoina tai ajatuksina jotka luovat tuotteen josta _asiakas_ on valmis maksamaan. Asiakas voi olla loppykäyttäjä, työkaveri, toinen toimittaja tai mitä tahansa. Kuten tästä huomataan, on monet asiat Leanissa melko moniosaisia ja paljon määrittelyä sisältäviä.

Lean sisältää myös 14 periaatetta, joiden tarkempi avaaminen ei yksinkertaisesti ole mielekästä saatika edes mahdollista lyhyen referaatin aikana. Tämä myös rikkoisi Leanin periaatetta, jossa henkilöiden pitää _sisäistää_ ajattelumallit, sen sijaan että ne olisivat asioita jotka voidaan vain "käskeä" ja "ottaa käyttöön". nämä ovat:

> Principle #1 – “Base your management decisions on a long-term philosophy, even at the expense of shortterm financial goals.”
>
> Principle #2 – “Move toward flow; move to ever-smaller batch sizes and cycle times to deliver value fast & expose weakness.”
>
> Principle #3 – “Use pull systems; decide as late as possible.”
>
> Principle #4 – “Level the work — reduce variability and over-burden to remove unevenness.”
>
> Principle #5 – “Build a culture of stopping and fixing problems; teach everyone to methodically study problems.”
>
> Principle #6 – “Master norms(practices) to enable kaizen and employee empowerment. ”
>
> Principle #7 – “Use simple visual management to reveal problems and coordinate.”
>
> Principle #8 – “Use only well-tested technology that serves your people and process. ”
>
> Principle #9 – “Grow leaders from within who thoroughly understand the work, live the philosophy, and teach it to others.”
>
> Principle #10 – “Develop exceptional people and teams who follow your company’s philosophy.”
>
> Principle #11 – “Respect your extended network of partners by challenging them to grow and helping them improve.”
>
> Principle #12 – “Go see for yourself at the real place of work to really understand the situation and help.”
>
> Principle #13 – “Make decisions slowly by consensus, thoroughly considering all options; implement decisions rapidly.”
>
> Principle #14 – “Become and sustain a learning organization through relentless reflection and kaizen.”

Leanissa esiintyvä ajatus virrasta (flow) tarkoittaa arvon tuottamista asiakkaalle ilman viivettä.

Leanin perusperiaatteet ovat syntyneet ja jalostuneet erityisesti tuotteiden valmistamista varten, entä sitten kun tehdään tuotekehitystä?

Tätä varten on vielä yksinkertainen aate: _"Outlearn the competition"_. Tämä voidaan jakaa yksinkertaistettuna siihen, että luodaan enemmän hyödyllistä tietoa ja opitaan paremmin kuin kilpailijat. Tämä voidaan vielä jalostaa talousmielessä helpommin ymmärrettäväksi luodun tiedon arvon lisäämiseksi ja tiedon tuottamisen hinnan laskemiseksi. Tätä varten on jälleen useita periaatteita, kuten työn rytmitys, tiedon uudelleenkäyttö, samanaikainen tuotekehitys yms.

### Loppupäätelmä

Voidaan huomata, että Lean on yksinkertaisen "tee näin"-mallin sijasta moniosainen systeemi, joka koskettaa koko yrityksen toimintaa ja osa-alueita, kuten: tuotekehitystä, myyntiä, tuotantoa, palveluita ja henkilöstöpalveluita.

> Lean applies to the enterprise.

Lean onkin yksinkertaisten työkalujen sijaan yrityksen järjestelmä joka nojaa pätevien johtaja-opettajien Lean-ajattelumallin päälle rakentuvalle kokonaisvaltaiselle toiminnalle, joka tapahtuu aina jatkuva kehitys ja ihmisten kunnioittaminen edellä.

> Many good American companies have respect for individuals, and practice kaizen and other [lean] tools. But what is important is having all the elements together as a system. It must be practiced every day in a very consistent manner...