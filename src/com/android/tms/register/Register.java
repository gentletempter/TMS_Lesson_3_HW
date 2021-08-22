package com.android.tms.register;

import com.android.tms.documents.DocumentTemplate;

/**
 * A class that implements saving a documents and displaying information about it
 * */
public class Register implements IRegister {

    public DocumentTemplate[] docsRegister = new DocumentTemplate[10];

    @Override
    public void saveDocumentInRegister(DocumentTemplate document) {
        for (int i = 0; i < docsRegister.length; i++) {
            if (docsRegister[i] == null) {
                docsRegister[i] = document;
                return;
            }
        }
    }

    @Override
    public String getDocumentInfoFromRegister(DocumentTemplate document) {
        return document.toString();
    }
}
