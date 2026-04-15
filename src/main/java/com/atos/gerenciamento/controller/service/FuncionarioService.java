/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.gerenciamento.controller.service;

import com.atos.gerenciamento.controller.model.FuncionarioBean;
import com.atos.gerenciamento.controller.repository.FuncionarioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioDAO repository;

    public List<FuncionarioBean> lerTodos() {
        return repository.lerTodos();

    }
    
    public FuncionarioBean lerId(int id){
        return repository.lerId(id);
        
    }
    
    
            
            
}
