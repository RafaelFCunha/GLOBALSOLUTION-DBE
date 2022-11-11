package com.api.eletriccarcontrol.services;

import com.api.eletriccarcontrol.models.FiapGsParceiroModel;
import com.api.eletriccarcontrol.repositories.FiapGsParceiroRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FiapGsParceiroService {

     final FiapGsParceiroRepository Parceiro;

     public FiapGsParceiroService(FiapGsParceiroRepository fiapGsParceiroRepository) {
         this.fiapGsParceiroRepository = fiapGsParceiroRepository;
     }
    @Transactional
     public FiapGsParceiroModel save(FiapGsParceiroModel fiapGsParceiroModel) {
         return fiapGsParceiroRepository.save(fiapGsParceiroModel);
     }

     public List<FiapGsParceiroModel> findAll(){
         return fiapGsParceiroRepository.findAll();
    }

    public Optional<FiapGsUsuarioModel> findById(UUID id){
        return fiapGsParceiroRepository.findById(id);
    }

    @Transactional
    public void delete(FiapGsParceiroModel fiapGsParceiroModel){fiapGsParceiroRepository.delete(fiapGsParceiroModel);
    }
}
