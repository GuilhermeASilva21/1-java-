package relacionamento_one_to_many.relacionamento_one_to_many.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relacionamento_one_to_many.relacionamento_one_to_many.converters.EnderecoConverter;
import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateClienteDto;
import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateEnderecoDto;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.ClienteEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.EnderecoEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.repositories.ClienteRepository;
import relacionamento_one_to_many.relacionamento_one_to_many.repositories.EnderecoRepository;
import relacionamento_one_to_many.relacionamento_one_to_many.services.ClienteService;
import relacionamento_one_to_many.relacionamento_one_to_many.services.EnderecoService;

@RestController
@RequestMapping("/api")
public class apiControllers {
     @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    EnderecoService enderecoService;

    @Autowired
    ClienteService clienteService;

    @PostMapping("/cliente")
    public ClienteEntity createCliente(@RequestBody ClienteEntity cliente){
        return clienteRepository.save(cliente);
    }

    @PostMapping("/endereco")
    public EnderecoEntity createBook(@RequestBody EnderecoEntity endereco){
        return enderecoRepository.save(endereco);
    }

    

    @GetMapping("/endereco/{id}")
    public CreateEnderecoDto getEndereco(@PathVariable long id){
        EnderecoEntity endereco = enderecoRepository.findById(id).orElse(null);
        if (endereco == null) return null;
        CreateEnderecoDto enderecoDTO = EnderecoConverter.entityToDto(endereco);
        return enderecoDTO;
    }
    
    @GetMapping("/cliente/{id}")
    public CreateClienteDto getenderecoBycliente(@PathVariable Long id) {
        ClienteEntity cliente = clienteRepository.findById(id).orElse(null);
        return ClienteConverter.entityToDto(cliente);
    }
}
