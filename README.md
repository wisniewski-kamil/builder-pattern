
# Programowanie zaawansowane - Testy

Na zaliczenie ćwiczeń z przedmiotu Programowanie zaawansowane postawnoiłem zaopatrzeć w testy projekt zaliczeniowy z przedmiotu Wzorce projektowe.

Właściwy projekt jest implementacją wzorca builder w języku Java na przykładzie programu do wyboru kofiguracji samochodu (np. pod kątem zakupu)

Struktura programu składa dzieli się na 3 główne elementy:
* klasa Main służąca do wypisania tekstowego interfejsu użytkownika oraz uruchomienia procesu konfiguracji samochodu
* klasy obiektów oraz działania programu
* klasy typów danych (Enumy)

W testy zostału zaopatrzone klasy drugiego rodzaju, czyli obiektów i działania programu

## Schemat działania programu

Po uruchomieniu klasa Main wyświetla tekstowy interfejs programu razem z kilkoma opcjami do wyboru. Po wybraniu opcji innej niż "wyjście" Main wywołuje odpowiednią metodę z klasy CarBuildingDirector która odpowiada za przeprowadzenie procesu konfiguracji posługując się builderem samochodu zaimplementowanego w klasie CarBuilder. Wyświetlane są w konsoli pytania o preferencje użytkownika, a zadaniem użytkownika jest wpisanie swojej preferencji. CarBuildingDirector zbiera te odpowiedzi używając metod statycznych z klasy InputReader które zbierają odpowiedzi użytkownika ze standardowego wejścia, przetwarzają je na odpowiedni typ oraz powtarzają proces jeśli użytkownik popełnił błąd.
Po przejściu procesu kofiguracji przy użyciu CarBuilder'a budowany jest obiekt klasy Car i gotowa konfiguracja prezentowana jest w formie tekstowej używając metody toString z klasy Car oraz pośrednio także toString z klasy GearBox.

## Scenariusze testów

Scenariusze testów są w tym przypadku bardzo proste ponieważ do przetestowania tego typu aplikacji wystarczają testy jednostkowe. Testy zakłądają takie sceriusze jak sprawdzenie poprawności oczekiwanego wyniku w zalezności od różnych czynników takich jak np. popełnienie błędu przez użytkownika i konieczność ponownego wpisaniu preferencji.

## Wykorzystane narzędzie i biblioteki

Do samego napisania programu oraz testów został użyty program IntelliJ Community Edition w wersji 2023.1.1 z pomocą Maven'a, natomiast język Java był w wersji 20. 
Do napisania testów użyłem biblioteki JUnit w wersji 4.13.

## Problemy i ich rozwiązania

W trakcie pisania testów dla klas CarBuildingDirector oraz InputReader napotkałem jeden problem. Obie te klasy posługują się Scannerem do zebrania inputu od użytkownika. Moim pierwotnym pomysłem było użycie Mockito do zasymulownaia danych dostarczonych przez użytkownika jednak w trakcie pisania testów okazało się ze Mockito nie może zostać użyty do zamockowania działa klasy Scanner ze względu na to że Scanner jest klasą finalną. W związku z tym aby przeprowadzić odpowiednie testy metod z tych klas użyłem czysto Javovego rozwiązania i dostarczyłem do testowanych klas Scanner z predefiniowanym inputem dla każdego testu z osobna.

