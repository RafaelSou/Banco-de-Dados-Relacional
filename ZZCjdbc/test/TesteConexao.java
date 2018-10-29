package br.com.abc.br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.br.com.abc.javacore.ZZCjdbc.classes.Pessoa;
import br.com.abc.br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;
import br.com.abc.br.com.abc.javacore.ZZCjdbc.db.Pessoadb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
    public static void main(String[] args) {
        int a=750000000;
        Pessoadb pessoadb =new Pessoadb();
        Pessoa mypessoa =new Pessoa();

        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            for(int i=1;i<=a;i++){
                mypessoa.PopPessoa();
                pessoadb.save(mypessoa,conn);
                System.out.println(i);
            }
            ConexaoFactory.close(conn,stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
