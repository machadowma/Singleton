package com.example.singleton;

public class Usuario {
    private static Usuario INSTANCE = null;
    private String login, nome;

    private Usuario(){
        login = "";
        nome = "";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Usuario getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new Usuario();

        return INSTANCE;
    }

    public String getLogin(){
        return login;
    }
    public String getNome(){
        return nome;
    }
    public void setLogin(String str){
        login = str;
    }
    public void setNome(String str){
        nome = str;
    }


}
