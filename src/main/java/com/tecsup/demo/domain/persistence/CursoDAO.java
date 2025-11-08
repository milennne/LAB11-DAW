package com.tecsup.demo.domain.persistence;

import com.tecsup.demo.domain.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoDAO extends JpaRepository<Curso, Integer> {
}