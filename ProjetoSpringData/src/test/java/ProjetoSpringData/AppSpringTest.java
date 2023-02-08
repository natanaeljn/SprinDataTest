package ProjetoSpringData;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.InterfaceSpringTelefone;
import dao.InterfaceSpringUser;
import model.Telefone;
import model.UsuarioSpring;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringTest {
	
	@Autowired
	private InterfaceSpringUser interfaceSpringUser;
	@Autowired
	private InterfaceSpringTelefone interfaceSpringTelefone;
	
	@Test
	public void teste() {
		System.out.println("iniciou Spring");
	}
	/*
	@Test
	public void consultaBanco() {
		Optional<UsuarioSpring> usuarioSpring = interfaceSpringUser.findById(3L);
		usuarioSpring.get().getLogin();
		usuarioSpring.get().getSenha();
		for (Telefone telefone : usuarioSpring.get().getTelefones()) {
			System.out.println(telefone.getTipo() + ":" + telefone.getNumero());
		}
		
	}
	
	@Test
	public void insertTelefone() {
	Optional<UsuarioSpring> usuarioSpring=	interfaceSpringUser.findById(3L);
	Telefone telefone = new Telefone();
	telefone.setTipo("Celular");
	telefone.setNumero("479887231721");	
	telefone.setUsuarioSpring(usuarioSpring.get());
	interfaceSpringTelefone.save(telefone);
	
	}
	
	
	
	
	@Test
	public void insert() {
		UsuarioSpring usuarioSpring = new UsuarioSpring();
		usuarioSpring.setCpf("10429509012");
		usuarioSpring.setLogin("Aristoteles");
		usuarioSpring.setSenha("1213123");
		interfaceSpringUser.save(usuarioSpring);
		
	}
	
	
	@Test
	public void consultaBanco() {
		Optional<UsuarioSpring> usuarioSpring = interfaceSpringUser.findById(3L);
		usuarioSpring.get().getLogin();
		usuarioSpring.get().getSenha();
		System.out.println(usuarioSpring.get().getLogin());
		
	}
	
	@Test
	public void consultaTodosDoBanco() {
		Iterable<UsuarioSpring>lista = interfaceSpringUser.findAll();
		for (UsuarioSpring usuarioSpring : lista) {
			System.out.println(usuarioSpring.getLogin());
		}
		
	}
	
@Test
	public void testeUpdate() {
		Optional<UsuarioSpring> usuarioSpring = interfaceSpringUser.findById(3L);
		UsuarioSpring usuarioSpring2 = usuarioSpring.get();
		usuarioSpring2.setSenha("123456789");
		interfaceSpringUser.save(usuarioSpring2);
}
	
	
	@Test
	public void testeDeletar() {
		interfaceSpringUser.deleteById(2L);
		
	}
	
	
	@Test
	public void testeConsultaNome() {
		List<UsuarioSpring>list = interfaceSpringUser.buscaNome("natanael");
		for (UsuarioSpring usuarioSpring : list) {
			System.out.println(usuarioSpring.getLogin());
		}
	}
	
	@Test
	public void testeConsultaNomeParametro() {
		UsuarioSpring list = interfaceSpringUser.buscaNomePorParametro("natanael");
		System.out.println(list.getLogin());
	}
	
	@Test
	public void testeDeletar() {
		interfaceSpringUser.deletarPorLogin("natanael");
	}
	
	@Test
	public void testeUpdateParametro() {
		interfaceSpringUser.UpdateDeLogin("jose carlos", "jose");
	}
	*/
}
