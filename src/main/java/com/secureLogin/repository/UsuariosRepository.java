package com.secureLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.secureLogin.modelo.Usuarios;

import java.util.Optional;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>
{
}
