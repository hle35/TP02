/**
 * This package tests
 */
package tp2;

/**
 * @author HLE35
 *
 */
public class Tp2 {

	/**
     * @param args the command line arguments
	 */
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : tp2.Tp2 arg1 arg2");
        } else {
            System.out.println(args[1]);
        }
	}
}
