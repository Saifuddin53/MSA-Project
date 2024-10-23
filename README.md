---

# **MSA Android challenge**

This Android application is designed to help users locate nearby shops at a hackathon based on specific search queries like pizza, juice, and more. The app is built using **Kotlin** and **Jetpack Compose**, with a focus on **Clean Architecture**. It utilizes **Koin** for dependency injection, **Ktor** for networking.

---

## **Foursquare API**

The application utilizes the **Foursquare API**, specifically the **Nearby Places API**. Foursquare provides a comprehensive location platform that enables developers to access a wide range of venue data, including categories, locations, tips, etc.

### **Nearby Places API**
The Nearby Places API allows users to search for venues near a specific location. By providing latitude and longitude coordinates, along with search queries, the API returns a list of relevant places, including their names, categories, distances, and more. This feature is essential for our App, as it enables users to discover shops in their vicinity based on their interests.

---

## **Architecture Overview**

The project follows **Clean Architecture**, which ensures a clear separation of concerns and makes the app easy to maintain and scale. Here is a brief overview of each layer:

1. **Domain Layer**:
   - **Entities**: Represents core business models, independent of any specific implementation details.
   - **Use Cases**: Encapsulate application-specific business rules by interacting with repositories.

2. **Data Layer**:
   - **Repositories**: Bridge the gap between the domain layer and data sources (API or local database).
   - **Network**: Manages network operations via **Ktor**, communicating with the backend API.

3. **Presentation Layer**:
   - **ViewModels**: Manage the state of the UI, calling use cases and processing the results.
   - **UI Components**: Built using **Jetpack Compose** for a modern, declarative UI approach.
     
4. **DI**:
   - **Koin**: Dependency injection library for easier object management.

### **Libraries Used**:
- **Kotlin**: Primary language for development.
- **Jetpack Compose**: Modern UI toolkit for Android.
- **Ktor**: HTTP client used for API calls.
- **Koin**: Simple dependency injection library for Kotlin and Jetpack Compose.
- **Room**: Persistence library for local storage.
- **StateFlow & Coroutines**: For managing asynchronous data flows and state updates.

---

## **Features**:
- **Nearby Shops Search**: Users can search for shops near their location by entering queries (e.g., "pizza", "juice").
- **Clean Architecture**: Follows Clean Architecture principles for separation of concerns and scalability.
- **Declarative UI**: Built entirely with Jetpack Compose for a modern UI experience.
- **Dependency Injection**: Koin is used to manage dependencies easily throughout the project.
- **Efficient Networking**: Ktor is used for handling network calls and querying external APIs.

---

## **Networking with Ktor**

For simplicity and readability, network requests are structured in a clean and minimal way using **Ktor**. Here's how API parameters are passed dynamically:

```kotlin
httpClient.get(
    urlString = constructUrl("/places/nearby")
) {
    header("Authorization", BuildConfig.API_KEY)

    // Add query parameters dynamically
    parameter("ll", "$latitude,$longitude")
    parameter("query", items) // For multiple queries like "pizza,juice"
    parameter("hacc", range)
}
```

- The `latitude`, `longitude`, `items` (search queries), and `range` are passed dynamically as query parameters, making the API request flexible for different searches.

```kotlin
shopDataSource
   .getNearbyShops(
      40.748817,
      -73.985428,
      pizza,juice",
      "2000"
   )
   .onSuccess { shops ->
      state.update {
      it.copy(
      isLoading = false,
      shops = shops
      )
   }
}
.onError { error ->
   _state.update { it.copy(isLoading = false) }
   _events.send(ShopListEvent.Error(error))
}

---

## **Video Recording**

This recording showcases how users can search for nearby shops and the overall user experience.

https://github.com/user-attachments/assets/bdf2e08b-e42b-42a0-881d-2f73dd6b66e6

