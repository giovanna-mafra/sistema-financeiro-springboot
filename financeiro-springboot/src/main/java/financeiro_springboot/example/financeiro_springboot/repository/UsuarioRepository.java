package financeiro_springboot.example.financeiro_springboot.repository;

import financeiro_springboot.example.financeiro_springboot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
