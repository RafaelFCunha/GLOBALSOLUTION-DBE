package com.api.eletriccarcontrol.services;

import com.api.eletriccarcontrol.models.FiapGsUsuarioModel;
import com.api.eletriccarcontrol.repositories.FiapGsUsuarioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FiapGsUsuarioService {

     final FiapGsUsuarioRepository fiapGsUsuarioRepository;

     public FiapGsUsuarioService(FiapGsUsuarioRepository fiapGsUsuarioRepository) {
         this.fiapGsUsuarioRepository = fiapGsUsuarioRepository;
     }
    @Transactional
     public FiapGsUsuarioModel save(FiapGsUsuarioModel fiapGsUsuarioModel) {
         return fiapGsUsuarioRepository.save(fiapGsUsuarioModel);
     }

     public List<FiapGsUsuarioModel> findAll(){
         return fiapGsUsuarioRepository.findAll();
    }

    public Optional<FiapGsUsuarioModel> findById(UUID id){
        return fiapGsUsuarioRepository.findById(id);
    }

    @Transactional
    public void delete(FiapGsUsuarioModel fiapGsUsuarioModel){fiapGsUsuarioRepository.delete(fiapGsUsuarioModel);
    }
}
