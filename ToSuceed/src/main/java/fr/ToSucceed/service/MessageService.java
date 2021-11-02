package fr.ToSucceed.service;

import fr.ToSucceed.dao.Contenu.IMessageDuJour;
import fr.ToSucceed.entities.Contenu.MessageDuJour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final IMessageDuJour iMessageDuJour;

    @Autowired
    public MessageService(IMessageDuJour iMessage) {
        this.iMessageDuJour = iMessage;
    }

    public List<MessageDuJour> getMessages() {
        return iMessageDuJour.findAll();
    }

    public MessageDuJour addNewMessage(MessageDuJour messageDuJour) {
        Optional<MessageDuJour> messageOptional = iMessageDuJour.findMessageDuJourById(messageDuJour.getId());
        if (messageOptional.isPresent()){
            throw new IllegalStateException("ID taken");
        }
        return iMessageDuJour.save(messageDuJour);
    }

    public void deleteMessage(Integer messageID){

        boolean exists = iMessageDuJour.existsById(messageID);
        if(!exists){
            throw new IllegalStateException("Message with id "+messageID+" does not exist");
        }
        iMessageDuJour.deleteById(messageID);
    }

}
