package com.erick.crud.service;
import com.erick.crud.model.Model;

import java.util.ArrayList;


public class Service {

    //BANCO DE DADOS TEMPORARIO
    ArrayList<Model> usuarios = new ArrayList<>();


    //CREATE
    public void create(Model p) {

        if (p.getNome() == null || p.getNome().isEmpty()) {
            System.out.println("ERRO: preencha o nome!");
            return;
        }
        if (p.getIdade() <= 0) {
            System.out.println("ERRO: preencha sua idade!");
            return;
        }
        if (p.getId() <= 0) {
            System.out.println("ERRO: preencha seu id!");
            return;
        }
        System.out.println("Usuário criado com sucesso!");
        usuarios.add(p);
    }

    //READ
    public void read() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário foi encontrado!");
        } else {
            for (Model usuarios : usuarios) {
                System.out.println("Nome: " + usuarios.getNome());
                System.out.println("Idade: " + usuarios.getIdade());
                System.out.println("ID: " + usuarios.getId());
            }
        }
    }

    //UPDATE
    public void update(int id) {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário foi encontrado!");
            return;
        }
        if(id <= 0){
            System.out.println("ID inválido!");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getId() == id){

            encontrado = true;

            usuarios.get(i).setNome("Novo nome");
                System.out.println("Usuario atualizado com sucesso!");
                break;
            }
        }
        if (!encontrado){
            System.out.println("Usuário válido!");
        }
    }

    //DELETE
    public void delete(int id) {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário foi encontrado!");
        }
        if(id <= 0){
            System.out.println("ID inválido!");
        }
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getId() == id){
               usuarios.remove(i);
                System.out.println("Usuario removido com sucesso!");
                return;
            }
        }
    }
}
