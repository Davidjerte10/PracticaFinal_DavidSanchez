import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import controlador.UsuariosController;
import modelo.Usuarios;

public class Test1 {
    
    @Test
    public void testLogin() {
        UsuariosController usuariosController = new UsuariosController();
        
        String correoPrueba = "correoinventado@gmail.com";
        
        // Llamada al método login para iniciar sesión con el correo de prueba
        Usuarios usuario = usuariosController.login(correoPrueba);
        
        // Verificar que el usuario devuelto no sea nulo
        assertNotNull(usuario, "No se encontró ningún usuario con el correo proporcionado");
    }
}

