package com.api.eletriccarcontrol.controllers;

import com.api.eletriccarcontrol.dto.FiapGsUsuarioDto;
import com.api.eletriccarcontrol.models.FiapGsUsuarioModel;
import com.api.eletriccarcontrol.services.FiapGsUsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/fiap-gs-usuario")
public class FiapGsUsuarioController {

    final FiapGsUsuarioService fiapGsUsuarioService;

    public FiapGsUsuarioController(FiapGsUsuarioService fiapGsUsuarioService) {
        this.fiapGsUsuarioService = fiapGsUsuarioService;
    }

    @PostMapping
    public ResponseEntity<Object> saveFiapGsUsuario(@RequestBody @Valid FiapGsUsuarioDto fiapGsUsuarioDto){

        var fiapGsUsuarioModel = new FiapGsUsuarioModel();
        BeanUtils.copyProperties(fiapGsUsuarioDto, fiapGsUsuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(fiapGsUsuarioService.save(fiapGsUsuarioModel));
    }

    @GetMapping
    public ResponseEntity<List<FiapGsUsuarioModel>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsUsuarioService.findAll());
    }

    @GetMapping("/{nr_id_user}")
    public ResponseEntity<Object> getOneUser(@PathVariable(value="nr_id_user") UUID nr_id_user){
        Optional<FiapGsUsuarioModel> fiapGsUsuarioModelOptional = fiapGsUsuarioService.findById(nr_id_user);
        if(!fiapGsUsuarioModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não foi encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsUsuarioModelOptional.get());
    }

    @DeleteMapping("/{nr_id_user}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value="nr_id_user") UUID nr_id_user){
        Optional<FiapGsUsuarioModel> fiapGsUsuarioModelOptional = fiapGsUsuarioService.findById(nr_id_user);
        if(!fiapGsUsuarioModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não foi encontrado");
        }
        fiapGsUsuarioService.delete(fiapGsUsuarioModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado com sucesso");
    }

    @PutMapping("/{nr_id_user}")
    public ResponseEntity<Object> updateUser(@PathVariable(value="nr_id_user") UUID nr_id_user,
                                             @RequestBody @Valid FiapGsUsuarioDto fiapGsUsuarioDto){
        Optional<FiapGsUsuarioModel> fiapGsUsuarioModelOptional = fiapGsUsuarioService.findById(nr_id_user);
        if(!fiapGsUsuarioModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não foi encontrado");
        }
        var fiapGsUsuarioModel = new FiapGsUsuarioModel();
        BeanUtils.copyProperties(fiapGsUsuarioDto, fiapGsUsuarioModel);
        fiapGsUsuarioModel.setNr_id_user(fiapGsUsuarioModelOptional.get().getNr_id_user());
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsUsuarioService.save(fiapGsUsuarioModel));
    }
}

