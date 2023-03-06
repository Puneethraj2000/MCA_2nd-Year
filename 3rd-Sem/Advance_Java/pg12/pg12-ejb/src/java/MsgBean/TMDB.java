/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MsgBean;

import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author mcacnj
 */
@MessageDriven(mappedName = "jms/tQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/tQueue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class TMDB implements MessageListener {

    public TMDB() {
    }
    @Resource
    private MessageDrivenContext mde;

    @Override
    public void onMessage(Message message) {
        TextMessage msg = null;
        try {
            if(message instanceof TextMessage){
                msg = (TextMessage)message;
                System.out.println("A message received in TMDB:"+msg.getText());
            }
            else{
                System.out.println("Message of wrong type:"+message.getClass().getName());
            }
        } catch (JMSException ex) {
            mde.setRollbackOnly();
        }
        catch(Throwable te){}
    }
}
