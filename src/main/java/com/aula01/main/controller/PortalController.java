/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula01.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class PortalController {
    
    @GetMapping("/portal")
    public String abrirporal() {
        return "portal";
    }
    @GetMapping("/servico")
    public String abrirservico() {
        return "servico";
    }
    @GetMapping("/contato")
    public String abrircontato() {
        return "contato";
    }
}
