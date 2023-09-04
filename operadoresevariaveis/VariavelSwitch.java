package operadoresevariaveis;

public class VariavelSwitch {

    public static void main (String[] args) {
        
        switchMes();

    }

        private static void switchMes() {
    
        String mes = "dezembro";
        
        switch (mes) {
            case "dezembro":
                System.out.println("Férias");    
            break;
        
            default:
                System.out.println("Mês indefinido");
            break;
        }

    }
    

}