package com.teachmeskills.lesson_8.fabric;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.document_parser.impl.DocxDocumentParser;
import com.teachmeskills.lesson_8.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_8.document_parser.impl.TxtDocumentParser;

public class ParserFabric {

    static public IParser createParser(String fileName){

        // TODO (опционально) * попробовать переписать на конструкцию switch-case, может это будет более ёмкая запись +
        return switch (fileName.substring(fileName.lastIndexOf("."))) { // Метод lastIndexOf находит значения начиная с указанного символа. Метод substring извлекает часть строки, начиная с этого индекса до конца.
            case ".pdf" -> new PdfDocumentParser();
            case ".docx" -> new DocxDocumentParser();
            default -> new TxtDocumentParser();
        };
    }
}
