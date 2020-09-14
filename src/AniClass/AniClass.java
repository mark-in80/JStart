package AniClass;

/*
this is class make for init class Compucter
 */
public class AniClass {
    public static void main(String[] args){
//        Compucter com = new Compucter();
//        com.i7.start();
//        com.i7.shut();
        // this is next string exe anon Class
        new Compucter(){
            void superComp(){
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}
