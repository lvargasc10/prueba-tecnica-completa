package pruebaTecnica.servicio.tipoDocumentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({"pruebaTecnica.common.tipoDocumento.model"})
public class ServicioTipoDocumentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTipoDocumentosApplication.class, args);
	}

}
