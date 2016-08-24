package org.ocp.chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zoo {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {

			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin");
			service.execute(() -> System.out.println("Start Inventory"));
			service.execute(() -> {
				for (int i = 0; i < 4; i++) {
					System.out.println("Iventory " + i);

				}
			});
			service.execute(() -> System.out.println("End Inventory"));
			System.out.println("End");

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(service !=null )service.shutdown();
		}
	}

}
