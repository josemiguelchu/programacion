import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un número entero positivo");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		if (!(0<n)) { System.out.println("Número positivo, porfavor");
		} else { System.out.println("N=" + n);
				for(int x=1;x<=n;x++) {
					for(int i=1;i<=n-x;i++) {
						System.out.print("\n");
					}
					for(int asterisco=1;asterisco<=x;asterisco++) {
							System.out.print("*");
						
					}
					
					}
			
			
				}
		}
	}


