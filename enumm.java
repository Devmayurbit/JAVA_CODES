    /**
     * enumm
     */

    // enum Status{
    //         running , gym , walking , success;
    // }

    enum laptop{
        mackbook(6900),samsung(5555),vivobook(9372);
        private int price;
        private laptop() {
        }

        private laptop (int price){
            this.price = price;
            System.out.println("laptops " + this.name());
        }

        public int  getPrice() {
            return price;
        }

        // public int  setPrice(laptop price) {
        //     this.price = price;
        // }

        
        
    }


    public class enumm {

        public static void main(String[] args) {

            for(laptop lap :laptop.values()){
                System.out.println(lap + " : " + lap.getPrice());
            }
            // Status s = Status.running;
        
            // switch(s){
            //     case running:
            //         System.out.println("perfectly run");
            //     break;
            //     case gym:
            //     System.out.println("go hard !!");
            //     break;
            //     case walking:
            //     System.out.println(" >>> walk on my way______.......");
            //     break;
            //     default:
            //     System.out.println("gooo !!");
                
            // }


            // for(Status e : s){
            //     System.out.println( e + " : " + e.ordinal());
            // }
        }
    }