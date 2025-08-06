package financeiro_springboot.example.financeiro_springboot.controller;

import financeiro_springboot.example.financeiro_springboot.model.Usuario;
import financeiro_springboot.example.financeiro_springboot.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //CREATE - USERS
    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }

    //READ - USERS
    @GetMapping
    public List<Usuario> listarTodosUsuarios(){
        return usuarioService.buscarTodosUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Integer id){
        return usuarioService.buscarPorId(id);
    }

    @GetMapping("/nome/{nome}")
    public Usuario buscarUsuarioPorNome(@PathVariable String nome) {
        return usuarioService.buscarPorNome(nome);
    }

    @GetMapping("/email/{email}")
    public Usuario buscarUsuarioPorEmail(@PathVariable String email) {
        return usuarioService.buscarPorEmail(email);
    }


    //UPDATE - NOME
    @PutMapping("/{id}")
    public Usuario atualizarNomePorId(@PathVariable Integer id,  @RequestBody Usuario usuario){
        return usuarioService.atualizarNomePorId(id, usuario.getNome());
    }

    @PutMapping("/nome/{nome}")
    public Usuario atualizarNomePorNome(@PathVariable String nome, @RequestBody Usuario usuario){
        return usuarioService.atualizarNomePorNome(nome, usuario.getNome());
    }

    @PutMapping("/email/{email}")
    public Usuario atualizarNomePorEmail(@PathVariable String email, @RequestBody Usuario usuario){
        return usuarioService.atualizarNomePorEmail(email, usuario.getNome());
    }







}
