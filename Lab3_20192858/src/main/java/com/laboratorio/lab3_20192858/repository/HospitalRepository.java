package com.laboratorio.lab3_20192858.repository;
import com.laboratorio.lab3_20192858.entity.Hospitales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospitales, Integer> {

//    List<Hospitales> findByCompanyName(String name);
//
//    List<Hospitales> findByCompanyNameOrPhone(String n, String p);

//    @Query(nativeQuery = true,value = "select * from shippers where CompanyName = ?1")
//    List<Hospitales> buscarPorNombre(String nombre);
//
//    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
//    List<Hospitales> buscarParcialPorNombre(String nombre);

}

