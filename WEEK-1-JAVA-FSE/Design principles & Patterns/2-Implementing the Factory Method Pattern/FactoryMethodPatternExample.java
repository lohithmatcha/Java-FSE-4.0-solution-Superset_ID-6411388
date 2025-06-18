public class FactoryMethodPatternExample {

    // step-2
    interface Document {
        void open(); // anything just to show here
    }

    // step 3 Concrete
    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word document...");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF document...");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel document...");
        }
    }

    // step 4.1 Abstract for Factory

    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // step 4.2 Concrete Factories
    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    // step 5 to test
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
