package com.shoestore.shoes.repository;

import com.shoestore.shoes.domain.Shoes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ShoesRepository extends JpaRepository<Shoes, Integer>{
    //buscar por sexo
    @Query("from Shoes v where v.sexshoes = ?1 order by v.name")
    List<Shoes> findBySex(String tipe);
    
    //buscar por marca
    @Query("from Shoes v where v.mark = ?1 order by v.name")
    List<Shoes> findByMark(String mark);
    
    //buacar por talle
}
