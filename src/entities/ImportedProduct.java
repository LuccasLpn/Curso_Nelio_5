package entities;
public class ImportedProduct extends Product{
    protected Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }
    
    public double totalPrice(){
        return price + getCustomsFee();
        
    }
    @Override
    
    public String priceTag(){
       return getName() + "$ " + totalPrice() + "(" + "Customs fee: $ " + getCustomsFee() + ")";
    }
    
}
