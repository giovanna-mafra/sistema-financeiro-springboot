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

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarTodosUsuarios(){
        return usuarioService.buscarTodosUsuarios();
    }

    @GetMapping("/{id}")
    public  Usuario buscarUsuarioPorId(@PathVariable Integer id){
        return usuarioService.buscarPorId(id);
    }




}
