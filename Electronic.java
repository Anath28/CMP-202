public interface Electronic {
    boolean onORoff = false;
    boolean on();
    boolean off();

    default void electronic(){
        if(onORoff){
           System.out.println("your static method is false");
        }
    }
}
