package Utilitarios;
import java.util.Properties;

import javax.mail.Address; 
import javax.mail.Message; 
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class enviarEmail {
	
	
	 static Session session; //declarar como um atributo de classe e static(global)
	
	private  String destinario;
    private int codigo;
	
	
	
	
	
	
public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



public String getDestinario() {
		return destinario;
	}



	public void setDestinario(String destinario) {
		this.destinario = destinario;
	}


              




public  static void enviarGmail(String destinatario, int codigo){
	System.out.println("Valor que veio do destinatario: ");

	Properties props = new Properties();
    /** Par�metros de conex�o com servidor Gmail */
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                     protected PasswordAuthentication getPasswordAuthentication() 
                     {
                           return new PasswordAuthentication("italobrunosantos@gmail.com", "brasil2012");
                     }
                });
    /** Ativa Debug para sess�o */
    session.setDebug(true);
    try {

          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress("italobrunosantos@live.com")); //Remetente

          Address[] toUser = InternetAddress //Destinat�rio(s)
                     .parse(destinatario);  
          message.setRecipients(Message.RecipientType.TO, toUser);
          //FORMATAR UMA PAGINA HTML
          message.setSubject("WAKA : Solicita��o de Recupera��o de Senha");//Assunto
          message.setText("Codigo de Recupera��o de Senha: "+codigo);
          /**M�todo para enviar a mensagem criada*/
          Transport.send(message);
          System.out.println("Feito!!!");
     } catch (MessagingException e) {
    	 System.out.println(e);
          throw new RuntimeException(e);
         
          
    }
}
}