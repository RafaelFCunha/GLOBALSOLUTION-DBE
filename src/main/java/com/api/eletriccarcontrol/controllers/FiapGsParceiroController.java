package com.api.eletriccarcontrol.controllers;

import com.api.eletriccarcontrol.dto.FiapGsUsuarioDto;
import com.api.eletriccarcontrol.models.FiapGsUsuarioModel;
import com.api.eletriccarcontrol.services.FiapGsParceiroService;
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
@RequestMapping("/fiap-gs-parceiro")
public class FiapGsParceiroController {
    final FiapGsParceiroService fiapGsParceiroService;

    public FiapGsParceiroController(FiapGsParceiroService fiapGsParceiroService) {
        this.fiapGsParceiroService = fiapGsParceiroService;
    }


    @PostMapping
    public ResponseEntity<Object> saveFiapGsParceiro(@RequestBody @Valid FiapGsParceiroDto fiapGsParceiroDto) {

        var fiapGsParceiroModel = new FiapGsParceiroModel();
        BeanUtils.copyProperties(fiapGsParceiroDto, fiapGsParceiroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(fiapGsParceiroService.save(fiapGsParceiroModel));
    }

    @GetMapping
    public ResponseEntity<List<FiapGsParceiroModel>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsParceiroService.findAll());
    }

    @GetMapping("/{nr_id_parceiro}")
    public ResponseEntity<Object> getOneUser(@PathVariable(value = "nr_id_parceiro") UUID nr_id_parceiro) {
        Optional<FiapGsParceiroModel> fiapGsParceiroModelOptional = fiapGsParceiroService.findById(nr_id_parceiro);
        if (!fiapGsParceiroModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parceiro não foi encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsParceiroModelOptional.get());
    }

    @DeleteMapping("/{nr_id_parceiro}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value = "nr_id_parceiro") UUID nr_id_parceiro) {
        Optional<FiapGsParceiroModel> fiapGsParceiroModelOptional = fiapGsParceiroService.findById(nr_id_parceiro);
        if (!fiapGsParceiroModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parceiro não foi encontrado");
        }
        fiapGsParceiroService.delete(fiapGsParceiroModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado com sucesso");
    }

    @PutMapping("/{nr_id_parceiro}")
    public ResponseEntity<Object> updateUser(@PathVariable(value = "nr_id_parceiro") UUID nr_id_parceiro,
                                             @RequestBody @Valid FiapGsUsuarioDto fiapGsUsuarioDto) {
        Optional<FiapGsUsuarioModel> fiapGsUsuarioModelOptional = fiapGsUsuarioService.findById(nr_id_parceiro);
        if (!fiapGsUsuarioModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parceiro não foi encontrado");
        }
        var fiapGsParceiroModel = new FiapGsParceiroModel();
        BeanUtils.copyProperties(fiapGsParceiroDto, fiapGsParceiroModel);
        fiapGsParceiroModel.setNr_id_parceiro(fiapGsParceiroModelOptional.get().getNr_id_parceiro());
        return ResponseEntity.status(HttpStatus.OK).body(fiapGsParceiroService.save(fiapGsParceiroModel));
    }
}

