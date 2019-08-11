package _6Exceptions;

public class JammedTurkeyCage2 implements AutoCloseable {

	@Override
	public void close()  {
		System.out.println("guevo");
		
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage2 t = new JammedTurkeyCage2()) {
			throw new IllegalStateException("turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}
}
