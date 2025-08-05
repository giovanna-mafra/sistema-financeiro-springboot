package financeiro_springboot.example.financeiro_springboot.service;

import financeiro_springboot.example.financeiro_springboot.model.Usuario;
import financeiro_springboot.example.financeiro_springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios(){

        return usuarioRepository.findAll();
    }


    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

}
