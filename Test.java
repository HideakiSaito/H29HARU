/**
 * Test
 */
public class Test {

    /**
     * main()
     * @param args
     */
    public static void main(String[] args) {
        //とりあえずハロー
        printUzai("Hello World!");
    }

    /**
     * 出力するウザイぐらい
     * @param message
     */
    public static void printUzai(String message){
            for(int i=0;i<99;i++){
                System.out.println(i + ":" + message) ;
            }
    }
}