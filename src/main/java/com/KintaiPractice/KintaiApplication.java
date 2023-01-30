package com.KintaiPractice;

import com.KintaiPractice.api.ApiComponentScanConfiguration;
import com.KintaiPractice.datasource.DatasourceComponentScanConfiguration;
import com.KintaiPractice.service.ServiceComponentScanConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		ApiComponentScanConfiguration.class,
		DatasourceComponentScanConfiguration.class,
		ServiceComponentScanConfiguration.class
})
public class KintaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KintaiApplication.class, args);
	}

}
