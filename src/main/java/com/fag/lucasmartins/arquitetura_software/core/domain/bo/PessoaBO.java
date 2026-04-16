package com.fag.lucasmartins.arquitetura_software.core.domain.bo;

import com.fag.lucasmartins.arquitetura_software.core.domain.exceptions.DomainException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PessoaBO {

    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    public PessoaBO() {}

    public void validarMaiorDeIdade() {
        if (dataNascimento == null) {
            throw new DomainException("Data de Nascimento não pode estar vazia");
        }

        long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());

        if (idade < 18) {
            throw new DomainException("Idade mínima de 18 anos, Idade informada: " + idade);
        }
    }

    public void validarCpf() {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new DomainException("CPF obrigatório");
        }
        if (cpf.trim().length() != 11) {
            throw new DomainException("CPF inválido: deve conter 11 caracteres");
        }
    }

    public void validarEmail() {
        if (email == null || email.trim().isEmpty()) {
            throw new DomainException("E-mail obrigatório");
        }
        if (!email.contains("@")) {
            throw new DomainException("E-mail inválido: deve conter '@'");
        }
    }

    public void validarTelefone() {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new DomainException("Telefone obrigatório");
        }
        if (telefone.trim().length() != 11) {
            throw new DomainException("Telefone inválido: deve conter 11 caracteres (somente números)");
        }
    }

    public void validar() {
        validarMaiorDeIdade();
        validarCpf();
        validarEmail();
        validarTelefone();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}