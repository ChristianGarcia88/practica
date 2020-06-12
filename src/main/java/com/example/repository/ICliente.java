package com.example.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.model.Cliente;

public interface ICliente extends   CrudRepository<Cliente, Integer> {

}
