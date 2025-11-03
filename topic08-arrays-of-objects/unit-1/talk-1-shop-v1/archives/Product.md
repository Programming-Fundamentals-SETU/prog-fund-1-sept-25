```plantuml
@startuml
title Product Class Diagram

' Include the class directly
class Product {
    - String productName
    - int productCode
    - double unitCost
    - boolean inCurrentProductLine
    --
    + Product( String productName, int productCode, double unitCost, boolean inCurrentProductLine)
    + String getProductName()
    + int getProductCode()
    + double getUnitCost()
    + boolean isInCurrentProductLine()
    + void setProductName(String productName)
    + void setProductCode(String productCode)
    + void setUnitCose(double unitCost)
    + void setisInCurrentProductLine(boolean inCurrentProductLine) 
    + String toString()
}

skinparam classAttributeIconSize 0
skinparam backgroundColor #C19A6B
skinparam shadowing false
skinparam classFontSize 14
@enduml
