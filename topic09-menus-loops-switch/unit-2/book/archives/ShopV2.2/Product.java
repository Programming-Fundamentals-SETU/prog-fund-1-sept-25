/**
 * A scaled down version of a Product class
 *
 * @author Mairead Meagher, Siobhan Drohan
 * @version 2.2
 */
public class Product {
    private String productName = "";
    private int productCode = 9999;
    private double unitCost = 0;
    private boolean inCurrentProductLine = false;


    /**
     * Constructor for objects of class models.Product
     * @param productName Name of the product
     * @param productCode Code of the product
     * @param unitCost Unit cost of the product
     */
    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        if (productName.length()<= 20)
            this.productName = productName;
        else
            this.productName = productName.substring(0,20);
        setProductCode(productCode);
        setUnitCost(unitCost);
        this.inCurrentProductLine = inCurrentProductLine;
    }


    //-------
    //getters
    //-------
    /**
     * Returns the Product Name
     * @return productName
     */
    public String getProductName(){
        return productName;
    }

    /**
     * Returns the Unit Cost
     * @return unitCost
     */
    public double getUnitCost(){

        return unitCost;
    }

    /**
     * Returns the Product Code
     * @return productCode
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Returns a boolean indicating if the product is in the current product line
     * @return inCurrentProductLine
     */
    public boolean isInCurrentProductLine() {

        return inCurrentProductLine;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the Product Code to the value passed as a parameter
     * @param productCode The new Product Code
     */
    public void setProductCode(int productCode) {
        if ((productCode >= 1000) && (productCode <= 9999))
            this.productCode = productCode;
    }

    /**
     * Updates the Product Name to the value passed as a parameter
     * @param productName The new Product Name
     */
    public void setProductName(String productName) {
        if (productName.length() <= 20)
            this.productName = productName;
    }

    /**
     * Updates the Unit Cost to the value passed as a parameter
     * @param unitCost The new unit cost for the product
     */
    public void setUnitCost(double unitCost) {
        if (unitCost>=0)
            this.unitCost = unitCost;
    }

    /**
     * Updates the boolean indicating whether the product is in the current product line or not.
     * @param inCurrentProductLine Indicator that determines if the product is in the current product line or not.
     */
    public void setInCurrentProductLine(boolean inCurrentProductLine) {
        this.inCurrentProductLine = inCurrentProductLine;
    }

    /**
     * Builds a String representing a user-friendly representation of the object state
     * @return Details of the specific product
     */
    public String toString()
    {
        String yesOrNo;
        if (inCurrentProductLine)
            yesOrNo = "T";
        else yesOrNo = "F";
        return "Product description: " + productName
                + ", product code: " + productCode
                + ", unit cost: " + unitCost
                + ", currently in product line: " + yesOrNo;
    }

}