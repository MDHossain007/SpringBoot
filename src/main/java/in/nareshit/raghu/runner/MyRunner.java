package in.nareshit.raghu.runner;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyRunner implements CommandLineRunner {

	private static org.slf4j.Logger log = LoggerFactory.getLogger(MyRunner.class);
	@Override
	public void run(String... args) throws Exception {
		int a=10;
		try
		{
		log.info("started");
		System.out.println("MyRunner class testing for git hub"+a);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		log.info("Ented");

	}

}
