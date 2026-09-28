package com.panaderia.controller;

import com.panaderia.model.Producto;
import com.panaderia.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> listar(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto){
        return repo.save(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto){

        Producto existente = repo.findById(id).orElse(null);

        if(existente != null){
            existente.setNombre(producto.getNombre());
            existente.setDescripcion(producto.getDescripcion());
            existente.setPrecio(producto.getPrecio());
            existente.setCantidadDisponible(producto.getCantidadDisponible());
            return repo.save(existente);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        repo.deleteById(id);
    }
}