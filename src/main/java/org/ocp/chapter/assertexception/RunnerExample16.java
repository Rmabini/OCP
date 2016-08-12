package org.ocp.chapter.assertexception;

public class RunnerExample16 {

	static class Walk implements AutoCloseable {

		@Override
		public void close() throws Exception {

			throw new RuntimeException("snow");

		}

	}

	public static void main(String[] args) {
		try (Walk walk = new Walk(); Walk walk2 = new Walk() ) {
			throw new RuntimeException("rain");

		} catch (Exception e) {
           System.out.println(e.getMessage() + " "+e.getSuppressed().length);
		}

	}

}
