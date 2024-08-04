package hellow;
class Document {
 // Method to open document (to be overridden by subclasses)
 public void open() {
     System.out.println("Opening a generic document");
 }
}

//Sub claases
class WordDocument extends Document {
 public void open() {
     System.out.println("Opening a Word document");
 }
}

class PDFDocument extends Document {
 public void open() {
     System.out.println("Opening a PDF document");
 }
}

class SpreadsheetDocument extends Document {
 public void open() {
     System.out.println("Opening a Spreadsheet document");
 }
}

public class OfficeDoc {
 public static void main(String[] args) {
     Document doc1 = new WordDocument();
     Document doc2 = new PDFDocument();
     Document doc3 = new SpreadsheetDocument();

     //calling the method from classes
     doc1.open(); 
     doc2.open();  
     doc3.open(); 
 }
}
