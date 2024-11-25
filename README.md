# Online Test 

## Challenge_1

An Android app consuming [GitHub Trending API](https://fastforex.readme.io/reference/introduction) to display the current trending
Github repositories. It has been built using kotlin with clean architecture principles, Repository Pattern and MVVM
pattern as well as Architecture Components.


## Table of Contents

- [Architecture Blueprint](#architecture)
- [Features](#features)
- [Libraries](#libraries)
- [Extras](#extras)
- [Screenshots](#screenshots)

## Architecture
### Fragment
  - Represents the View layer in MVVM.
  - Responsible for displaying data to the user and receiving user input.
  - Observes data from the ViewModel and updates the UI accordingly.
### ViewModel
  - Acts as a bridge between the View (Fragment) and the Repository.
  - Holds and manages UI-related data in a lifecycle-conscious way.
 Fetches data from the Repository and exposes it to the Fragment via LiveData.
### Repository
  - The single source of truth for the application.
  - Handles data operations and abstracts the logic of whether data should be fetched from the local database (LocalService) or the remote API (RemoteService).
  - Returns data in the form of ModelJson or NetworkResult.
### LocalService
  - Manages data stored in the Room Database.
  - Communicates with the DAO (Data Access Object) layer to perform database operations.
  - Converts data entities into app-friendly formats.
### RemoteService
  - Handles communication with remote APIs using Retrofit.
  - Parses responses using Moshi for JSON serialization/deserialization.
  - Returns data as Retrofit Response objects or processed ModelJson.
### Database
  - Uses Room for local storage.
  - Includes:  Defines the structure of the database table.
  - Entity: Defines the structure of the database table.
  - DAO: Provides methods for database queries.
### API
  - Provides remote data via HTTP requests.
  - Communicates with RemoteService using Retrofit.


## Features
 
 - Supports users to convert all currencies.
 - Handle users without network or API on error

## Libraries

Following are the Libraries used:

- [Material Design](https://material.io/develop/android/docs/getting-started/) - Google material design UIs.
- [Dagger2](https://github.com/google/dagger) - Dependency Injection lib with large community support.
- [Retrofit](https://square.github.io/retrofit/) - Network Http Client
- [Jetpack](https://developer.android.com/jetpack)
  - [Viewmodel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Channel between use cases and UI
  - [Data Binding](https://developer.android.com/topic/libraries/data-binding) - For binding of UI components in layouts to data sources, and coroutines support.
- [Moshi](https://github.com/square/moshi) - Data, Model & Entity JSON Parser that understands Kotlin non-nullable and default parameters
- [okhttp-logging-interceptor](https://github.com/square/okhttp/blob/master/okhttp-logging-interceptor/README.md) - logs HTTP request and response data.
- [Mockito](https://site.mockito.org/) - Mocking framework used in unit tests.
- [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Library Support for coroutines, provides `runBlocking` coroutine builder used in tests
- [Room Persistence Library](https://developer.android.com/topic/libraries/architecture/room) - Robust database access while harnessing the full power of SQLite

## Extras

#### Gradle Dependencies

- dependencies.gradle - Centralized versioning of gradle dependencies in a global file
- Version.properties - App version details

#### Resource Values

- Fonts
- Dimension & String Values
- Themes & Styles
- Network Config

## Screenshots

- Architecure

<img width="1755" alt="kienTrucHeThong" src="https://github.com/user-attachments/assets/b98e5251-4162-456c-84e8-e7bdba573bd2">

##

- App Screens

<p float="center">
  <img src="https://github.com/user-attachments/assets/4d8df9a9-ce72-4d7e-b84e-6eccff257af2" title="Home" width="285" />
  <img src="https://github.com/user-attachments/assets/4d8df9a9-ce72-4d7e-b84e-6eccff257af2" title="Currency List" width="285" /> 
  <img src="https://github.com/user-attachments/assets/08ed548e-1b6d-4993-9baf-e70b0991e04a" title="Home" width="285" />
  <img src="https://github.com/user-attachments/assets/98b16fe5-9faa-49c3-99af-7c4434f69986" title="Convert from VND to USD" width="285" />
  <img src="https://github.com/user-attachments/assets/fcd460ef-0003-4af7-b6ef-6c2acdee669f" title="Convert from USD to VND" width="285" />
  <img src="https://github.com/user-attachments/assets/b9e9188a-3919-465d-9404-419723be4f47" title="Chart Bar convert from USD to VND 3DAY" width="285" />
  <img src="https://github.com/user-attachments/assets/a537bddb-8704-48d6-ab3f-dad54768978d" title="Chart Bar convert from USD to VND 6DAY" width="285" />
  <img src="https://github.com/user-attachments/assets/0c79150d-f44a-4fd6-adaa-74973ed981f7" title="Chart Bar convert from USD to VND 9DAY" width="285" />
  <img src="https://github.com/user-attachments/assets/848de741-400d-426e-92cd-13d76f6f99a7" title="Chart Bar convert from USD to VND 12DAY" width="285" />
</p>

## Challenge_2

- Link: https://drive.google.com/drive/folders/19ABlcX7wrQBsUNedV_0ZiGMBnFKMFztt?usp=sharing
