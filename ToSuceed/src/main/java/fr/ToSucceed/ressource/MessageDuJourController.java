package fr.ToSucceed.ressource;

import fr.ToSucceed.entities.Contenu.MessageDuJour;
import fr.ToSucceed.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("message")
public class MessageDuJourController {
    private final MessageService messageService;

    @Autowired

    public MessageDuJourController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public List<MessageDuJour> getMessages(){return messageService.getMessages();}

    @PostMapping(path = "save")
    public void addNewMessage(@RequestBody MessageDuJour messageDuJour){
        messageService.addNewMessage(messageDuJour);
    }

    @DeleteMapping("delete/{id}")
    public void deleteMessage(@PathVariable("id")Integer id){
        messageService.deleteMessage(id);
    }

}
