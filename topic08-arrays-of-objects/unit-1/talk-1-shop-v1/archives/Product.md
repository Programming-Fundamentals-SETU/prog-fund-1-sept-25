# Product Class Diagram

```plantuml
@startuml
skinparam backgroundColor #f9f9f6
skinparam classBackgroundColor #fff6e5

class Product {
    .. Attributes ..
    - String productName
    - int productCode
    - double unitCost
    - boolean inCurrentProductLine
    .. Constructor ..
    + Product(String, int, double, boolean)
    .. Methods ..
    + String getProductName()
    + int getProductCode()
    + double getUnitCost()
    + boolean isInCurrentProductLine()
    + void setProductName(String)
    + void setProductCode(String)
    + void setUnitCost(double)
    + void setisInCurrentProductLine(boolean) 
    + String toString()
}

' skinparam classAttributeIconSize 0
' skinparam backgroundColor #C19A6B
' skinparam shadowing false
' skinparam classFontSize 14
@enduml
