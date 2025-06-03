package dio.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaDeMensagem implements CommandLineRunner {
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefone}")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome +
                "\n E-mail: "+ email +
                "\n com telefones para contato: " + telefone);
        System.out.println("Parabéns, seu cadastro foi aprovado com sucesso!");
    }
}
