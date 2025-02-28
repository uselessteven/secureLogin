package com.secureLogin.modelo;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "administradores", schema = "ddbsec")
public class Administradores
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_admin;
    String nombre;
    String correo;
    String hash_password;
    String nivel_acceso;
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
