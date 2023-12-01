package generator;
import dice.Dice;
import java.util.ArrayList;

public class CharacterGen {

    Data data = new Data();

    
    int[] attributes = new int[5]; // AGI, INT, VIG, PRE, FOR
    String fullName = "";
    ArrayList<Object> origin = new ArrayList<>();
    String charClass = "";
    ArrayList<String> skills = new ArrayList<>();


    public String[] genOrigin(){
        int resultado = Dice.rollDice(24, false) - 1;
        String[] finalOrigin = Data.origins[resultado];

        origin.add(finalOrigin[0]);
        origin.add(finalOrigin[3]);

        skills.add(finalOrigin[1]);
        skills.add(finalOrigin[2]);

        return finalOrigin;
    } 

    public void genClass(){ //Colocar pra retornar String
        switch((String) origin.get(0)){
            case "Acadêmico":
                data.classData[0][1] = 3;
                break;
            case "Agente de Saúde":
            //-------------
                break;
            case "Amnésico":
            //-------------
                break;
        }
    }
    
}


class Data{
    static String[][] mascNames = new String[][] {
        {"Carlos", "Mateus", "Teodoro"},
        {"Neto", "Tomás", "Reginaldo"},
        {"Tadeu", "Joaquim", "José"},
        {"Ângelo", "Heitor", "Alceu"},
        {"Douglas", "Geraldo", "Lorenzo"},
        {"Eric", "Alfredo", "Diogo"},
        {"Alex", "Samuel", "Cícero"},
        {"Álvaro", "Adriano", "Érico"},
        {"Reinaldo", "Igor", "Guilherme"},
        {"Sérgio", "Osvaldo", "Evandro"},
        {"Cássio", "Hugo", "Vicente"},
        {"Júlio", "Valdomiro", "Benedito"},
        {"Nicolas", "Conrado", "Nelson"},
        {"Armando", "Sebastião", "Renan"},
        {"Cauã", "Jorge", "Davi"},
        {"Vítor", "Roberto", "Arthur"},
        {"Mauro", "Arnoldo", "Saulo"},
        {"Henrique", "Breno", "Antenor"},
        {"Fabrício", "Renato", "Túlio"},
        {"Giovane", "Aurélio", "Osmar"}
    };
    static String[][] femNames;
    static String[] appearance;
    static String[] personality;
    static String[][] origins = new String[][] { // Origem, Pericia1, Pericia2, Poder
        {"Acadêmico", "Ciências", "Investigação", "Saber é Poder"},
        {"Agente de Saúde", "Intuição", "Medicina", "Técnica Medicinal"},
        {"Amnésico", null, null, "Vislumbres do Passado"},
        {"Artista", "Artes", "Diplomacia", "Magnum Opus"},
        {"Atleta", "Atletismo", "Fortitude", "110%"},
        {"Criminoso", "Crime", "Furtividade", "O Crime Compensa"},
        {"Cultista Arrependido", "Enganação", "Ocultismo", "Traços do Outro Lado"},
        {"Desgarrado", "Fortitude", "Sobrevivência", "Calejado"},
        {"Engenheiro", "Profissão", "Tecnologia", "Ferramentas Favoritas"},
        {"Executivo", "Diplomacia", "Profissão", "Processo Otimizado"},
        {"Investigador", "Investigação", "Percepção", "Faro para Pistas"},
        {"Lutador", "Acrobacia", "Iniciativa", "Mão Pesada"},
        {"Magnata", "Diplomacia", "Pilotagem", "Patrocinador da Ordem"},
        {"Mercenário", "Iniciativa", "Tática", "Posição de Combate"},
        {"Militar", "Atletismo", "Pontaria", "+1 de dano à distância"},
        {"Operário", "Fortitude", "Profissão", "Ferramentas da Profissão"},
        {"Policial", "Percepção", "Pontaria", "Patrulha"},
        {"Religioso", "Religião", "Vontade", "Acalentar"},
        {"Servidor Público", "Intuição", "Vontade", "Espírito Cívico"},
        {"Teórico da Conspiração", "Investigação", "Ocultismo", "Eu Já Sabia"},
        {"T.I.", "Investigação", "Tecnologia", "Motor de Busca"},
        {"Trabalhador Rural", "Adestramento", "Sobrevivência", "Desbravador"},
        {"Trambiqueiro", "Crime", "Enganação", "Impostor"},
        {"Universitário", "Atualidades", "Investigação", "Empenho"}
    };

    Object[][] classData = new Object[][] {
        {"Combatente", (Integer) 1},
        {"Especialista", (Integer) 1},
        {"Ocultista", (Integer) 1},
    };
}