package com.converter;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

/**
 * Created by Sebastian on 24.09.2016.
 **/

@Component
class PDFRead {

    void createPdf(String destinationPath, String fileName){
        try {
            PdfWriter writer = new PdfWriter(destinationPath+"\\"+fileName);
            PdfDocument document = new PdfDocument(writer);
            Document pdf = new Document(document);
            pdf.add(new Paragraph("Hello world!"));
            pdf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
