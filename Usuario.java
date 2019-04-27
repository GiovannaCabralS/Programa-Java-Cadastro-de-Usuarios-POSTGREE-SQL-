package UsuarioClass;

public class Usuario {
    Long id;
    String nome,
           email,
           telefone,
           endereco,
           d_nasc;

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getD_Nasc() 
    {
        return d_nasc;
    }

    public void setData_nascimento(String d_nasc) 
    {
        this.d_nasc = d_nasc;
    }

    public String getData() 
    {
        throw new UnsupportedOperationException("Erro: Não suportado.");
    }
};