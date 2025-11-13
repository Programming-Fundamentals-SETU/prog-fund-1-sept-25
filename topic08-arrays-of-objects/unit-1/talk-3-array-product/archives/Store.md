# Store Class Diagram

```plantuml
@startuml
skinparam backgroundColor #f9f9f6
skinparam classBackgroundColor #fff6e5

class Store {
     .. Attributes ..
    - total : int total = 0
    - products : Product[]
     .. Constructor ..
    + Store(int numItems)
    .. Methods ..
    - boolean isFull()
    - boolean isEmpty()
    + boolean : addProduct(Product product)
    + String : listProducts()
}
@enduml
