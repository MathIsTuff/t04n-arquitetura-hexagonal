package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;

public class PessoaMapper {
    public PessoaMapper(){}

    public static PessoaEntity toEntity(PessoaBO pessoaBO){
        PessoaEntity entity = new PessoaEntity();
        entity.setNomeCompleto(pessoaBO.getNomeCompleto());
        entity.setCpf(pessoaBO.getCpf());
        entity.setDataNascimento(pessoaBO.getDataNascimento());
        entity.setEmail(pessoaBO.getEmail());
        entity.setTelefone(pessoaBO.getTelefone());

        return entity;
    }
    public static PessoaBO toBO(PessoaEntity pessoaEntity){
        PessoaBO bo = new PessoaBO();
        bo.setNomeCompleto(pessoaEntity.getNomeCompleto());
        bo.setCpf(pessoaEntity.getCpf());
        bo.setDataNascimento(pessoaEntity.getDataNascimento());
        bo.setEmail(pessoaEntity.getEmail());
        bo.setTelefone(pessoaEntity.getTelefone());
        return bo;
    }

}
