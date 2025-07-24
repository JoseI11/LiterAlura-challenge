package com.example.LiteraAlura.service;

import com.example.LiteraAlura.model.Libros;
import com.example.LiteraAlura.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    // Inyección por constructor (forma recomendada)
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Método para listar todos los libros
    public void listarLibros() {
        List<Libros> libros = libroRepository.findAll();
        libros.forEach(System.out::println);
    }

    // Método para listar libros filtrados por idioma
    public void listarLibrosPorIdioma(String idioma) {
        List<Libros> librosFiltrados = libroRepository.findByLenguajesContaining(idioma);
        librosFiltrados.forEach(System.out::println);
    }
}
