package com.example.cursmvc.service;

import com.example.cursmvc.model.Curs;
import com.example.cursmvc.repository.CursRepository;
import com.example.cursmvc.repository.EstudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CursService implements CrudService<Curs> {
	@Autowired
	private CursRepository repositori;
	@Autowired
	private EstudiantRepository estudiantRepository;
	
	public CursService(CursRepository cursRepository) {
		repositori = cursRepository;
	}
	
	public List<Curs> list() {
		List<Curs> listaCursos = repositori.findAll();
		for (Curs curs : listaCursos) curs.setEstudiants(estudiantRepository.getEstudiantsPerCurs(curs.getCursId()));
		return listaCursos;
	}

	public Curs create(Curs t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Curs> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Curs t, int id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
