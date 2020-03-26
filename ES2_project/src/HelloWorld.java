
public class HelloWorld {

	/**
	 * @param
	 */
	public String start() {
		String hello = "Hello World!";
		System.out.println(hello);
		return (hello);
	}
	
	
	/**
	 * @param i
	 * @return
	 */
	public int cenasHelloWorld(int i) {
		System.out.println("c");
		return i + 1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld test = new HelloWorld();
		test.start();
	}

}
