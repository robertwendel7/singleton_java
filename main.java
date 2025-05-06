package Singletom;
public class ConfigurationManager{
    private static ConfigurationManager instancia;
    private String servidor;
    private String porta;

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        if( instancia == null){
            instancia = new ConfigurationManager();
        }
        return instancia;
    }

    public void setConfig(String key, String value){
        if(key == "servidor"){
            this.servidor = value;
        }else if (key == "porta"){
            this.porta = value;
        }
        
    }

    public String getConfig(String key){
        if(key == "servidor"){
            return servidor;
        }else if (key == "porta"){
            return porta;
        }
        return "Desconhecido";
    }

    public void showConfigs(){
        if(servidor != null){
            System.out.println("Servidor: " + servidor);
        }
        if(porta != null){
            System.out.println("Porta: " + porta);
        }
    }

    public static void main(String[] args){
        ConfigurationManager c = new ConfigurationManager();
        ConfigurationManager c1 = new ConfigurationManager();
        c.setConfig("servidor", "3000");
        c1.setConfig("servidor", "8080");
        c.showConfigs();
        c1.showConfigs();

    
    }
}