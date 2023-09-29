package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JournalService implements IJournalService{

    ArrayList<JournalEntry> allEntries = new ArrayList<>();


    @Override
    public void save(JournalEntry journalEntry) {
        allEntries.add(journalEntry);

    }

    @Override
    public List<JournalEntry> fetchAll() {

        return allEntries;
    }
}
