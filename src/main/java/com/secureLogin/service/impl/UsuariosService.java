package com.secureLogin.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import com.secureLogin.repository.UsuariosRepository;
import com.secureLogin.service.IUsuariosService;
import org.springframework.stereotype.Service;
import com.secureLogin.modelo.Usuarios;

import java.util.List;

@Service
public class UsuariosService implements IUsuariosService
{
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuarios> listUsers()
    {
        return this.usuariosRepository.findAll();
    }

    @Override
    public Usuarios findById(Integer id_usuario)
    {
        return this.usuariosRepository.findById(id_usuario).orElseThrow(() -> new RuntimeException("Usuario no encontrado por id: " + id_usuario));
    }

    @Override
    public Usuarios saveUser(Usuarios usuarios)
    {
        if (usuariosRepository.findById(usuarios.getId_usuario()).isPresent())
        {
            throw new RuntimeException("El correo ya esta registrado");
        }
        usuarios.setHash_password(passwordEncoder.encode(usuarios.getHash_password()));
        usuarios.setRole("USER");
        return usuariosRepository.save(usuarios);
    }

    @Override
    public Usuarios updateUser(Usuarios usuarios)
    {
        return this.usuariosRepository.save(usuarios);
    }

    @Override
    public void deleteUserById(Integer id_usuario)
    {
        this.usuariosRepository.deleteById(id_usuario);
    }
}
