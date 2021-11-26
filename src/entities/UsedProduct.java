package entities;

import java.util.Date;

public class UsedProduct extends Product {
    protected Date manufactureDate;

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
       return getName() + "(used)" + "$ " + getPrice() + "(" + "Manufacture Date: " + getManufactureDate() + ")";
    }
    
    
     
     
    
    
    
    
    
    
    
}
