public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User("adm", "adm@gmail.com", "senha secreta do adm");
        String[] subtittles1 = { "O que é Java?", "Classes:" };
        String[] contents1 = {
                "Java é uma linguagem multiplataforma, orientada a objetos e centrada em rede que pode ser usada como uma plataforma em si. É uma linguagem de programação rápida, segura e confiável para codificar tudo, desde aplicações móveis e software empresarial até aplicações de big data e tecnologias do servidor.",
                "Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto.",
                "" };
        Subject subject1 = new Subject("java", subtittles1, contents1);

        System.out.println("FALHANDO LOGIN:");
        user1.login("adm@gmail.com", "senha errada");
        System.out.println("logado = " + user1.getStatus());
        System.out.println("vizualizações de '" + subject1.getTittle()+"': " + subject1.getViews());
        System.out.println("exp = " + user1.getExp());

        AccessSubject access = new AccessSubject(user1, subject1);
        System.out.println(access.access());

        System.out.println();

        System.out.println("LOGIN BEM SUCEDIDO:");
        user1.login("adm@gmail.com", "senha secreta do adm");
        System.out.println("logado = " + user1.getStatus());
        System.out.println(access.access());
        System.out.println("exp = " + user1.getExp());
        System.out.println("vizualizações de '" + subject1.getTittle()+"': " + subject1.getViews());

        System.out.println();

        System.out.println("LOGOUT:");
        user1.logout();
        System.out.println("logado = " + user1.getStatus());

    }
}
