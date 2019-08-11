package _6Exceptions;

public class JammedTurkeyCage implements AutoCloseable{
	private static String name;
	
   public void close() throws IllegalStateException {
	   System.out.println("ants");
	   throw new IllegalStateException("Cage door does not close");
   }
   
   public JammedTurkeyCage(String name) {
		super();
		this.name = name;
	}

   public JammedTurkeyCage() {
	// TODO Auto-generated constructor stub
   }

   public static void main(String[] args) {
	   try (JammedTurkeyCage t1 = new JammedTurkeyCage("1");
			JammedTurkeyCage t2 = new JammedTurkeyCage("2")) {
			System.out.println("turkeys entered cages");
	   } catch (IllegalStateException e) {
			   System.out.println("caught: " + e.getMessage());
			   for (Throwable t: e.getSuppressed())
				   System.out.println(t.getMessage() + name);
      }
   }
}
