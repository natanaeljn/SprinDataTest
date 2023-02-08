package dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.UsuarioSpring;

@Repository
public interface InterfaceSpringUser extends CrudRepository<UsuarioSpring, Long>{

	/*este %?1% faz referencia ao parametro passado, no caso so tem um entao sera 1*/
	@Query(value= " select p from UsuarioSpring p where p.login like %?1%")
	public List<UsuarioSpring>buscaNome(String login);
	
	@Query(value= " select p from UsuarioSpring p where p.login = :paramnome")
	public UsuarioSpring buscaNomePorParametro(@Param("paramnome")String paramnome);
	
	
	@Modifying
	@Transactional
	@Query(value= " delete from UsuarioSpring u where u.login = ?1")
	public void deletarPorLogin(String login);
	
	@Modifying
	@Transactional
	@Query(value= " update  UsuarioSpring u set u.login = ?1 where u.login= ?2 ")
	public void UpdateDeLogin(String loginNovo,String login);
	
}
