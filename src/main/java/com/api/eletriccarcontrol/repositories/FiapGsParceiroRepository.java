package com.api.eletriccarcontrol.repositories;

import com.api.eletriccarcontrol.models.FiapGsParceiroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FiapGsParceiroRepository extends JpaRepository<FiapGsParceiroModel, UUID> {
}
