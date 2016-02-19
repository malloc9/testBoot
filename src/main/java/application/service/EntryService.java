package application.service;

import application.domain.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import application.repository.EntryRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> findAll(){
        return entryRepository.findAll();
    }

    public void saveEntry(Entry entry){
        entryRepository.save(entry);
    }
}
