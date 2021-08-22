package com.android.tms.register;

import com.android.tms.documents.DocumentTemplate;

/**
 * Used to define the functionality of the "Register" class
 */
public interface IRegister {
    void saveDocumentInRegister(DocumentTemplate document);

    String getDocumentInfoFromRegister(DocumentTemplate document);
}
