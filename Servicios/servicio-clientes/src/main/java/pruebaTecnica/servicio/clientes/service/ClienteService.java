package pruebaTecnica.servicio.clientes.service;

import java.util.List;

import pruebaTecnica.common.clientes.model.Cliente;
import pruebaTecnica.common.service.controller.CommonService;

public interface ClienteService extends CommonService<Cliente> {
	List<Cliente> buscarClienteDocumento(String numeroDocumento);
}
