package com.api.eletriccarcontrol.repositories;

import com.api.eletriccarcontrol.models.FiapGsUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FiapGsUsuarioRepository  extends JpaRepository<FiapGsUsuarioModel, UUID> {
}
