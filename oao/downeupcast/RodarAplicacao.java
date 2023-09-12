package oao.downeupcast;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // downcast - dará erro porque o vendedor (a subclasse) possui características que funcionário (a superclasse) não tem (herda)
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
