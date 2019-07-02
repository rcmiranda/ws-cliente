package br.com.aeksistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aeksistemas.model.Cliente;
import br.com.aeksistemas.repository.ClienteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping()
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<Cliente> listarPorId(@PathVariable long id) {
		return clienteRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Cliente createContato(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Cliente> update(@PathVariable("id") long id, @RequestBody Cliente cliente) {
		return clienteRepository.findById(id).map(record -> {
			record.setId(cliente.getId());
			record.setCpf(cliente.getCpf());
			record.setNome(cliente.getNome());
			record.setBairro(cliente.getBairro());
			record.setCep(cliente.getCep());
			record.setCidade(cliente.getCidade());
			record.setComplemento(cliente.getComplemento());
			record.setDataNascimento(cliente.getDataNascimento());
			record.setEmail(cliente.getEmail());
			record.setEstado(cliente.getEstado());
			record.setLogradouro(cliente.getLogradouro());
			Cliente updated = clienteRepository.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		return clienteRepository.findById(id).map(record -> {
			clienteRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
