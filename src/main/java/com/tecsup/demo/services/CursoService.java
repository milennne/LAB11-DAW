package com.tecsup.demo.services;

import com.tecsup.demo.domain.entities.Curso;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CursoService {

    public void grabar(Curso curso);
    public void eliminar(int id);
    public Curso buscar(Integer id);
    public List<Curso> listar();
}
