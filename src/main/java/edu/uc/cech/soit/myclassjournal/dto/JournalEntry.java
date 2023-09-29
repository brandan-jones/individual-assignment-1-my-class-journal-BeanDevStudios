package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;
import lombok.Getter;

@Getter
public @Data
class JournalEntry {

    private String notes;
    private String date;

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
