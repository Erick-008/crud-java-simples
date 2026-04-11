package com.erick.crud;

import com.erick.crud.model.Model;
import com.erick.crud.service.Service;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

       Model p1 = new Model();
        p1.setNome ("erick");
        p1.setIdade(17);
        p1.setId(123);

        Service servico = new Service();
        servico.create(p1);
        servico.read();
        servico.update(123);
        servico.delete(01);
    }
}
