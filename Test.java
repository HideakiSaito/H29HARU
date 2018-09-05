/**
 * Test ok
 */
public class Test {

    /**
     * main()
     * @param args
     */
    public static void main(String[] args) {
        //toriaezu hello
        //printUzai("Hello World!");
        Uzai uza = new Uzai();
        uza.Hello();
        uza.Bye();
    }

    /**
     * uzee korehatukawa
     * @param message
     */
    public static void printUzai(String message){
            for(int i=0;i<5;i++){
                System.out.println(i + ":" + message) ;
            }
    }
}
