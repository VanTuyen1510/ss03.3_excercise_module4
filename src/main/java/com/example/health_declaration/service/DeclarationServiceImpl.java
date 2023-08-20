package com.example.health_declaration.service;

import com.example.health_declaration.entity.MedicalDeclaration;
import com.example.health_declaration.repository.DeclarationRepositoryImpl;
import com.example.health_declaration.repository.IDeclarationRepository;

import java.util.List;

public class DeclarationServiceImpl implements IDeclarationService{
    private IDeclarationRepository declarationRepository = new DeclarationRepositoryImpl();
    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        declarationRepository.save(medicalDeclaration);
    }

    @Override
    public List<MedicalDeclaration> findAll() {
        return declarationRepository.findAll();
    }

    @Override
    public MedicalDeclaration findById(String id) {
        return declarationRepository.findById(id);
    }
}
