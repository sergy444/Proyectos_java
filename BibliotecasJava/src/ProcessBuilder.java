import java.lang.*;
class ProcessBuilder {
    public static void main( String ... args ) throws java.io.IOException , InterruptedException {
        System.out.println(" Este es Java ");
        new ProcessBuilder("./algo.cmd" ).start().waitFor();
        System.out.println("Se acabó la ejecución" );
    }
}
