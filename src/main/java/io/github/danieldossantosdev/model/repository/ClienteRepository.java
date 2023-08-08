package io.github.danieldossantosdev.model.repository;

import io.github.danieldossantosdev.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
