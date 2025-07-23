package com.rodrigofisch.hexagonal.architecture.application.ports.out;

public interface SendCpfValidationOutputPort {

    void send(String cpf);
}
