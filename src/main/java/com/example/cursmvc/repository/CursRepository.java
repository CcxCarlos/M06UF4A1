package com.example.cursmvc.repository;


import com.example.cursmvc.model.Curs;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursRepository implements CrudRepository<Curs> {

	private List<Curs> cursos = new ArrayList<>();

	public CursRepository() {
		Curs accesADades = new Curs(1, "Modul 6","Acces a dades",
				"https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m06_/web/fp_dam_m06_htmlindex/index.html&quot");

		Curs programacioMultimedia = new Curs(2, "Modul 8","Programacio Multimedia",
				"https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m08_/web/fp_dam_m08_htmlindex/index.html&quot");

		cursos.add(accesADades);
		cursos.add(programacioMultimedia);
	}

	public List<Curs> findAll() {
		return cursos;
	}

}
