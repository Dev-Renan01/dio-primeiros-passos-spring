package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.CommandLineRunner;
 import org.springframework.stereotype.Component;


@Component
public class SistemaDeMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() +
                 "\n E-mail: "+ remetente.getEmail() +
                "\n com telefones para contato: " + remetente.getTelefone());
        System.out.println("Parabéns, seu cadastro foi aprovado com sucesso!");
    }
}
