package AniClass;
/*
this is classes have exe Class(1) -- Class(1(2))
 */
public class Compucter {
    static class Processor{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("Comp is start " + true);
        }

        public void shut(){
            isStart = false;
        }
    }

    static class RAM{
        private boolean isStart = false;

        public void start(){
            isStart = true;
        }

        public void shut(){
            isStart = false;
        }
    }
    Processor i7 = new Processor();
    RAM transfer = new RAM();
}
