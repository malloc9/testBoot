package application.rest;

import application.domain.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.service.EntryService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @RequestMapping(value = "/add/{name}")
    public Entry addNewEntry(@PathVariable String name){
        Entry entry = new Entry();
        entry.setName(name);
        entry.setDate(new Date());
        entryService.saveEntry(entry);

        return entry;
    }

    @RequestMapping(value = "/listAll")
    public List<Entry> findAll(){
        System.out.println("controller - findAll");
        return entryService.findAll();
    }
}
