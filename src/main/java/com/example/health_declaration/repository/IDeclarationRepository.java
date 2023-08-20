package com.example.health_declaration.repository;

import com.example.health_declaration.entity.MedicalDeclaration;

import java.util.List;

public interface IDeclarationRepository {
   void save(MedicalDeclaration medicalDeclaration);
   List<MedicalDeclaration> findAll();
   MedicalDeclaration findById(String id);
}
