import java.util.Date;
public class pessoa {
public int idade;
public String nome;
public String cpf;
public int telefone;
public Date data_nascimento;

public pessoa (String nome, String cpf, int telefone,Date data_nascimento) {
this.nome = nome;
this.cpf = cpf;
this.telefone = telefone;
this.data_nascimento = data_nascimento;
 }
 }

class funcionario extends pessoa{
public float salario;
public String beneficios;
public String folga;
public Date horario;

funcionario (float salario, String folga, Date horario,String beneficios,
String nome, String cpf, int telefone, Date data_nascimento,int pagamento) {
    super (nome, cpf, telefone, data_nascimento);
this. salario = salario;
this.beneficios = beneficios;
this.folga = folga;
this.horario = horario;
}
}

class cliente extends pessoa {
public float gastos;
public int mesa;
public int horario;

cliente (float gastos, int mesa, int horario,String cpf,int telefone,
Date data_nascimento, String nome) {
super ( nome, cpf, telefone, data_nascimento);
this.gastos = gastos;
this.mesa = mesa;
this.horario = horario;
}
}

class caixa extends funcionario {
public float conta;
public int pagamento;

caixa (float conta,int pagamento,float salario, String folga, Date horario, String beneficios, String nome, String cpf,int telefone, Date data_nascimento ){
   super (nome,cpf, telefone, data_nascimento);
this.conta = conta;
this.pagamento = pagamento;
}
} 
