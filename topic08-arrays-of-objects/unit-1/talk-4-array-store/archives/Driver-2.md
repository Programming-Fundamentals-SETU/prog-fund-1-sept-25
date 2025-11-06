# Store Class Diagram

```plantuml
@startuml
skinparam backgroundColor #f9f9f6
skinparam classBackgroundColor #fff6e5

class Driver  {
     .. Attributes ..
    - store : Store
    - input : Scanner = new Scanner(System.int)
     .. Constructor ..

    + Store(int numItems)
    .. Methods ..
    + void : main(String[] )
    - void : processOrder()
    - void : addProduct()
    - void : printProducts() 
    - void : printCurrentProducts()
    - void : printAverageProductPrice()
    - void : printCheapestProduct()
    - void : printProductsAboveAPrice()
}
@enduml
