package pruebaTecnica.servicio.clientes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pruebaTecnica.common.clientes.model.Cliente;
import pruebaTecnica.common.service.controller.CommonServiceImp;
import pruebaTecnica.servicio.clientes.repository.ClienteRepository;

@Service
public class ClienteServiceImpl extends CommonServiceImp<Cliente,ClienteRepository> implements ClienteService {	
	
	
	@Override	
	public List<Cliente> buscarClienteDocumento(String numeroDocumento){
		return repository.buscarClienteDocumento(numeroDocumento);	
	}

}
