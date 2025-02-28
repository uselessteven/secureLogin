package com.secureLogin.service;

import com.secureLogin.modelo.Usuarios;
import java.util.List;

public interface IUsuariosService
{
    public List<Usuarios> listUsers();
    public Usuarios findById(Integer id_usuario);
    public Usuarios saveUser(Usuarios usuarios);
    public Usuarios updateUser(Usuarios usuarios);
    public void deleteUserById(Integer id_usuario);
}
