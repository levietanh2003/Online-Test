# Online Test [mvvmclean]



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

The Application is split into a three layer architecture inorder to provide clean separation of concerns - making the code easier to navigate and maintain.
- Data - Layer that holds APIs, Database, Cache
- Domain - Layer that holds Use Cases, and Model Objects. Business logic happens here.
- Application - Layer that holds presentation, Android components, Viewmodels, Dagger components/modules handles Dependency Injection, etc. MVVM exists at this layer.

![Data Flow Diagram](media/arch-flow.png)

The three layered architectural approach is majorly guided by clean architecture which provides
a clear separation of concerns with its Abstraction Principle.

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
</p>

