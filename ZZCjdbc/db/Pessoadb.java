package br.com.abc.br.com.abc.javacore.ZZCjdbc.db;

import br.com.abc.br.com.abc.javacore.ZZCjdbc.classes.Pessoa;
import br.com.abc.br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Pessoadb {
    public void save(Pessoa pessoa, Connection conn){
        String sql = "INSERT INTO `dbii`.`pessoa` (`sexo`, `idade`, `renda`, `escolaridade`, `idioma`, `pais`, `localizador`) VALUES ('"+pessoa.getSexo()+"\n" +
                "', '"+pessoa.getIdade()+"\n" +
                "', '"+pessoa.getRenda()+"\n" +
                "', '"+pessoa.getEscolaridade()+"\n" +
                "', '"+pessoa.getIdioma()+"\n" +
                "', '"+pessoa.getPais()+"\n" +
                "', '"+pessoa.getLocalizacao()+"');\n";
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }





    }
}
