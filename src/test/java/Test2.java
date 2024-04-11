import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controlador.UsuariosController;
import modelo.Usuarios;

public class Test2 {
    
    @Test
    public void testRegistroEInicioSesion() {
        UsuariosController usuariosController = new UsuariosController();
        
        // Simula el registro de un nuevo usuario
        usuariosController.registrarUsuario("Nombre", "Apellidos", "usuario@ejemplo.com", "contraseña");
        
        // Simula el inicio de sesión con las credenciales registradas
        Usuarios usuario = usuariosController.login("usuario2@ejemplo.com");
        
        // Verifica que el usuario devuelto no sea nulo
        assertNotNull(usuario, "No se encontró ningún usuario con el correo registrado");
    }
}
