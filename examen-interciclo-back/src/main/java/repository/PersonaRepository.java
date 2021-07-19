package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
