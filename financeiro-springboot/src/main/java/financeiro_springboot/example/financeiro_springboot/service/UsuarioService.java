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




    //CREATE
    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //READ
    public List<Usuario> buscarTodosUsuarios(){

        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario buscarPorNome(String nome){

        return usuarioRepository.findByNome(nome);
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    //UPDATE
    public Usuario atualizarNomePorId(Integer id, String nome) {

        Usuario usuario = buscarPorId(id);
        usuario.setNome(nome);
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarNomePorNome(String nome, String nomeNovo) {
        Usuario usuario = buscarPorNome(nome);
        usuario.setNome(nomeNovo);
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarNomePorEmail(String email, String nome) {
        Usuario usuario = buscarPorEmail(email);
        usuario.setNome(nome);
        return usuarioRepository.save(usuario);
    }






}
