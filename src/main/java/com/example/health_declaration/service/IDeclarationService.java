package com.example.health_declaration.service;

import com.example.health_declaration.entity.MedicalDeclaration;

import java.util.List;

public interface IDeclarationService {
    void save(MedicalDeclaration medicalDeclaration);
    List<MedicalDeclaration> findAll();
    MedicalDeclaration findById(String id);
}
