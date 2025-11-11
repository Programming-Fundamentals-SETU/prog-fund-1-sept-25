
# Library Management System

```plantuml
@startuml
skinparam backgroundColor #f9f9f6
skinparam classBackgroundColor #fff6e5
title Library Management System

class Book {
    .. Attributes ..
  - String title
  - String author
  - String isbn
  - boolean onLoan
  - double rating
    .. Constructor ..
  + Book(String, String, String)
  .. Methods ..
  + setTitle(String)
  + setAuthor(String)
  + setIsbn(String)
  + getTitle(): String
  + getAuthor(): String
  + getIsbn(): String
  + borrowBook()
  + returnBook()
  + setRating(double)
  + getRating(): double
  + toString(): String
}



@enduml
