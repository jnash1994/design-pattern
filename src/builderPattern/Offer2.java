package builderPattern;

public class Offer2 {
//required parameter
private  String companyName;
private int base;
private int stock;
private int signOn;
//optional parameter
private double annualBonus;

private Offer2(OfferBuilder offerBuilder){
    this.companyName=offerBuilder.companyName;
    this.base=offerBuilder.base;
    this.stock=offerBuilder.stock;
    this.signOn=offerBuilder.signOn;
}

    public String getCompanyName() {
        return companyName;
    }

    public int getBase() {
        return base;
    }

    public int getStock() {
        return stock;
    }

    public int getSignOn() {
        return signOn;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public String toString() {
        return "Offer2{" +
                "companyName='" + companyName + '\'' +
                ", base=" + base +
                ", stock=" + stock +
                ", signOn=" + signOn +
                ", annualBonus=" + annualBonus +
                '}';
    }

    public static class OfferBuilder{
        //required parameter
     private  String companyName;
     private int base;
     private int stock;
     private int signOn;
     //optional parameter
     private double annualBonus;

        public OfferBuilder(String companyName) {
            this.companyName = companyName;
        }

        public OfferBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public OfferBuilder base(int base) {
            this.base = base;
            return this;
        }
        public OfferBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }
        public OfferBuilder signOn(int signOn) {
            this.signOn = signOn;
            return this;
        }

        public OfferBuilder annualBonus(double annualBonus){
            this.annualBonus=annualBonus;
            return this;
        }
        public Offer2 build(){
            return  new Offer2(this);
        }



    }



}
