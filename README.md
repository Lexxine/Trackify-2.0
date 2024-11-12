# Trackify - Aplikacja do Śledzenia Historii Słuchania Spotify

## Opis Aplikacji
Trackify to aplikacja webowa, która umożliwia użytkownikom połączenie się z kontem Spotify i przeglądanie ich historii muzycznej, ulubionych artystów, gatunków oraz utworów. Aplikacja wykorzystuje integrację z API Spotify do pobierania danych o aktywności użytkownika i wyświetlania ich w intuicyjnym interfejsie. 

Aplikacja pozwala na logowanie za pomocą OAuth2 oraz bezpieczne przechowywanie danych sesji użytkownika. Użytkownicy mogą zobaczyć szczegółowe informacje na temat swojego gustu muzycznego oraz statystyki odnośnie przesłuchanej muzyki.

---

## Funkcje Aplikacji
- **Logowanie przez Spotify**: Bezpieczne logowanie z wykorzystaniem OAuth2.
- **Top artists**: Lista najczęściej słuchanych artystów(Top 20).
- **Artist's card**: "Karta artysty - wyświetla zdjęcie, nazwę artysty, liczbę obserwujących oraz popularność. Guzik "Learn more" umożliwia przekierowanie po id artysty do odpowiadającej strony na Spotify.
- **Top tracks**: Lista najczęściej słuchanych piosenek(Top 20).
- **Track's card**: "Karta utworu - wyświetla zdjęcie albumu, nazwę artysty, nazwę piosenki, nazwę albumu z którego pochodzi utwór, popularność, ilość piosenek w danym albumie oraz datę wydania utworu. Na karcie istnieje opcja 30 sekundowego odtworzenia "preview" piosenki. Guzik "Learn more" umożliwia przekierowanie do strony utworu na Spotify.
- **Top genres**: Lista najczęściej słuchanych gatunków muzycznych.
- **Link do formularza z prośbą o rozszerzone dane spotify**: Przekierowuje do strony, na której można poprosić spotify o swoje rozszerzone dane.
- **Prześlij plik z danymi**: Po dostaniu maila z rozszerzoną historią słuchania(format json) i pobraniu odpowiednich plików, pozwala na wprowadzenie ścieżki pliku `Streaming_History_Audio` i wyświetlenie w intuicyjnym interfejsie.
- **Instrukcja przesyłania ścieżki do pliku**: Instrukcja krok po kroku, jaką ścieżkę wpisać, żeby wyświetlić swoją rozszerzoną historię słuchania
- **Responsywny interfejs**: Dostosowany do urządzeń webowych.

---

## Technologie 
Aplikacja jest stworzona przy użyciu następujących technologii:
- **Java 17**
- **Spring Boot**: Framework dla aplikacji backendowej.
  - **Spring Security**: Używany do obsługi autoryzacji i uwierzytelniania.
  - **Spring Web**: Moduł do obsługi endpointów RESTowych.
  - **Spring OAuth2 Client**: Wykorzystany do integracji z autoryzacją OAuth2.
- **Thymeleaf**: Silnik szablonów używany do renderowania stron HTML.
- **Maven**: Narzędzie do zarządzania zależnościami i budowania projektu.
- **Frontend**:
  - **HTML/CSS/JavaScript**
  - **Gotowe Szablony Start Bootstrap:** Główny szablony frontendu został oparty na motywie New Age z platformy Start Bootstrap. Szablon został dostosowany do specyficznych wymagań aplikacji, aby zapewnić spójny i atrakcyjny wygląd.
- **Render**: Platforma Render służy do hostowania aplikacji Trackify, dostępnej pod adresem: https://trackify-2-0-1.onrender.com. Ze względu na tryb developerski aplikacja jest dostępna wyłącznie dla maksymalnie 25 wybranych użytkowników. Dostęp jest możliwy po wcześniejszym dodaniu adresu e-mail użytkownika do listy autoryzowanych osób na Spotify for Developers.

---

# Trackify - Spotify History Tracking Application

## Application Description
Trackify is a web application that allows users to connect to their Spotify accounts and view their music history, favorite artists, genres, and tracks. The app uses Spotify API integration to fetch user activity data and displays it in an intuitive interface.

The application enables login through OAuth2 and securely manages user session data. Users can view detailed information about their music preferences and listening statistics.

---

## Application Features
- **Spotify Login**: Secure login using OAuth2.
- **Top Artists**: List of the top 20 most listened-to artists.
- **Artist's Card**: Displays the artist’s image, name, follower count, and popularity. The "Learn more" button allows redirection to the artist's page on Spotify by ID.
- **Top Tracks**: List of the top 20 most played songs.
- **Track's Card**: Displays the album cover, artist's name, song title, album name, popularity, total tracks on the album, and release date. Includes a 30-second "preview" option for each song. The "Learn more" button redirects to the song's page on Spotify.
- **Top Genres**: List of the most listened-to music genres.
- **Extended Spotify Data Request Form Link**: Redirects to a page where users can request extended data from Spotify.
- **Upload Data File**: After receiving an email with extended listening history in JSON format from Spotify, users can upload the `Streaming_History_Audio` file and display the data in an intuitive interface.
- **File Path Upload Instructions**: Step-by-step instructions on how to enter the correct file path to display extended listening history.
- **Responsive Interface**: Optimized for web devices.

---

## Technologies 
The application is built using the following technologies:
- **Java 17**
- **Spring Boot**: Backend framework.
  - **Spring Security**: Used for authorization and authentication.
  - **Spring Web**: Module for handling REST endpoints.
  - **Spring OAuth2 Client**: Integrated for OAuth2 authorization.
- **Thymeleaf**: Template engine used for rendering HTML pages.
- **Maven**: Dependency management and project build tool.
- **Frontend**:
  - **HTML/CSS/JavaScript**
  - **Start Bootstrap Templates**: Main frontend templates are based on the New Age theme from Start Bootstrap, customized to meet the application's specific requirements for a cohesive and attractive look.
- **Render**: The Render platform hosts the Trackify application, available at [https://trackify-2-0-1.onrender.com](https://trackify-2-0-1.onrender.com). Due to development mode restrictions, the application is accessible only to up to 25 selected users. Access is granted once the user’s email is added to the authorized list on Spotify for Developers.

---

