public class Loops {
    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.whileLoop();        
    }

    private void implementingWileLoop(){
        // int i = 0;
        // while(i <= 10){
        //     System.out.println(i);
        //     i++;
        // }

        int i = 10;
        while(i >= 0){
            System.out.println(i);
            i--;
        }
    }

    public void whileLoop(){
        try {
            implementingWileLoop();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
