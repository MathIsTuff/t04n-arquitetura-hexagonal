package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

public class PessoaDTOMapper {
    public PessoaDTOMapper() {}

    public static PessoaBO toBo(PessoaDTO pessoaDTO) {
        PessoaBO bo = new PessoaBO();
        bo.setNomeCompleto(pessoaDTO.getNomeCompleto());
        bo.setCpf(pessoaDTO.getCpf());
        bo.setDataNascimento(pessoaDTO.getDataNascimento());
        bo.setEmail(pessoaDTO.getEmail());
        bo.setTelefone(pessoaDTO.getTelefone());
        return bo;
    }

    public static PessoaDTO toDto(PessoaBO pessoaBO) {
        final PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNomeCompleto(pessoaBO.getNomeCompleto());
        pessoaDTO.setDataNascimento(pessoaBO.getDataNascimento());
        pessoaDTO.setCpf(pessoaBO.getCpf()); 
        pessoaDTO.setEmail(pessoaBO.getEmail()); 
        pessoaDTO.setTelefone(pessoaBO.getTelefone()); 
        
        return pessoaDTO;
    }
}