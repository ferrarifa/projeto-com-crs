/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.gerenciamento.controller;


import com.atos.gerenciamento.controller.model.FuncionarioBean;
import com.atos.gerenciamento.controller.repository.FuncionarioDAO;
import com.atos.gerenciamento.controller.service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Aluno
 */
@Controller
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService service;
    
    
    @GetMapping("/funcionarios")
    public String getFuncionarios(Model model){
        List<FuncionarioBean> lista = service.lerTodos();
        model.addAttribute("lista", lista);
        return "funcionarios";
    }
    
    
    @GetMapping("/perfil")
    public String perfil (@RequestParam int id, Model model){
        FuncionarioBean funcionario = service.lerId(id);
        model.addAttribute("funcionario", funcionario);
        return "perfil";
    }
    
}
