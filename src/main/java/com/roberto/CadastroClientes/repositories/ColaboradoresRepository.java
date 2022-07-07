package com.roberto.CadastroClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.CadastroClientes.domain.Colaboradores;

@Repository
public interface ColaboradoresRepository extends JpaRepository<Colaboradores, Integer>{

}
