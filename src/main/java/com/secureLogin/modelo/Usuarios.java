package com.secureLogin.modelo;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "usuarios", schema = "ddbsec")
public class Usuarios
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_usuario;
    String nombre;
    String correo;
    String hash_password;
    LocalDateTime fecha_creacion;
    String role;

    public void prePersist()
    {
        if (this.fecha_creacion == null)
        {
            this.fecha_creacion = LocalDateTime.now();
        }
    }
}
