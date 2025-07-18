package com.biblioteca.nacional.Bibilioteca.msg;

public class MensagensJson {
    private static String json;
    public static String mensagemSucessoJson(){
        json = """
                    {
                    "result":true
                    }
                    
                    """;
        return  json;
    }
    public static String mensagemErroJson(String erro){
        json = """
                    {
                    "result":false,
                    "erro": %s
                    }
                    
                    """.formatted(erro);
        return  json;
    }

}
