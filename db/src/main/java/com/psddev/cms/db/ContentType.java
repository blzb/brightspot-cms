package com.psddev.cms.db;

import java.util.ArrayList;
import java.util.List;

import com.psddev.dari.db.Record;

public class ContentType extends Record {

    @Indexed
    @Required
    private String displayName;

    @Indexed(unique = true)
    @Required
    private String internalName;

    private List<ContentField> fields;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    /**
     * @return Never {@code null}.
     */
    public List<ContentField> getFields() {
        if (fields == null) {
            fields = new ArrayList<ContentField>();
        }
        return fields;
    }

    /**
     * @param fields {@code null} to reset the list.
     */
    public void setFields(List<ContentField> fields) {
        this.fields = fields;
    }
}
