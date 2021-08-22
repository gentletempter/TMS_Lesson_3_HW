package com.android.tms.documents;

import java.util.Date;

/**
 * Main document template
 */
public abstract class DocumentTemplate {
    public long documentNumber;
    public Date documentDate;

    public DocumentTemplate(long documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public DocumentTemplate() {
    }

    @Override
    public String toString() {
        return "Document № " + documentNumber + " from " + documentDate + " ";
    }
}
