package builderPattern;

import org.w3c.dom.ls.LSOutput;

public class Test {


    public static void main(String[] args) {
        Offer2 amazonOffer2=new Offer2.OfferBuilder("Amazon")
                .base(120000)
                .signOn(80000)
                .stock(100000).build();
        System.out.println(amazonOffer2);
        System.out.println(amazonOffer2.toString());


    }
}
