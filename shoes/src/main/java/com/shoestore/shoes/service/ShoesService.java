package com.shoestore.shoes.service;

import com.shoestore.shoes.domain.Shoes;
import com.shoestore.shoes.repository.ShoesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class ShoesService {
    private final ShoesRepository shoesRepository;

    public ShoesService(ShoesRepository shoesRepository) {
        this.shoesRepository = shoesRepository;
    }
    //mostrar todo
    public List<Shoes> all(){
        return shoesRepository.findAll();
    }
    //mostrar shoes by id
    public Optional<Shoes> byId(int id){
        return shoesRepository.findById(id);
    }
    //mostrar por sexo
    public List<Shoes> bySex(String tipe){
        return shoesRepository.findBySex(tipe);
    }
    //mostrar por marca
    public List<Shoes> byMark(String mark){
        return shoesRepository.findByMark(mark);
    }
    //mostrar por talle
    
    //cargar nueva zapatilla
    public boolean save(Shoes shoe){
        shoesRepository.save(shoe);
        return true;
    }
    //actualizar zapatilla
    public boolean update(Shoes shoe){
        shoesRepository.save(shoe);
        return true;
    }
    //borrar zapatilla
    public boolean delete(int id){
        shoesRepository.deleteById(id);
        return true;
    }
}
