

public enum Shoes {
    Nike(8,100,9),
    Adidas(10,80,6),
    Puma(6,60,8),
    Jordan(10,150,10),
    Balenciaga(16,1000,7);



    // normal class - want to make an object of this class
    // already has another parent
    // functions like strings do
    // name will return string of enum


    private final int size;
    private final int materialCost;
    private final int rating;

    Shoes(int size, int materialCost, int rating) {
        this.size = size;
        this.materialCost = materialCost;
        this.rating = rating;
    }

    private int size(){return size;}
    private int materialCost(){return materialCost;}
    private int rating(){return rating;}


    static int calculateRetailPrice(Shoes name) {
        return name.size * name.materialCost;
    }

    static Shoes highestRating(Shoes aShoe, Shoes anotherShoe){
        if(aShoe.rating > anotherShoe.rating){
            System.out.println(aShoe);
            return aShoe;
        } else {
            return anotherShoe;
        }
    }

    public static void main(String[] args) {
        int nikeCost = Nike.materialCost();
        int pumaSize = Puma.size();
        int adidasSize = Adidas.rating();

        Shoes airForces = Shoes.Nike;

        System.out.println(calculateRetailPrice(Nike));
        System.out.println(calculateRetailPrice(Adidas));
        System.out.println(calculateRetailPrice(Puma));
        System.out.println(calculateRetailPrice(Jordan));
        System.out.println(calculateRetailPrice(Balenciaga));

        System.out.println("--------------------------------------");
        System.out.println("Highest rating");

        System.out.println(highestRating(Jordan,Nike));
        System.out.println(highestRating(Nike, Balenciaga));
        System.out.println(highestRating(Puma, Adidas));
    }
}
