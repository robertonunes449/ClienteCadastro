package com.roberto.CadastroClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.CadastroClientes.domain.Clientes;


@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{

}
