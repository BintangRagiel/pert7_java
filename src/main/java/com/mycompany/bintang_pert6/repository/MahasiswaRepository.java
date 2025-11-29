/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bintang_pert6.repository;

import com.mycompany.bintang_pert6.model.ModelMahasiswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bintang
 */
@Repository
public class MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer>{
    @Autowired
    private MahasiswaRepository repository;
    
    public void addMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }
    
    public ModelMahasiswa getMhs(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }
    
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }
    
    public List<ModelMahasiswa> getAllMahasiswa() {
        return repository.findAll();
    }

}
