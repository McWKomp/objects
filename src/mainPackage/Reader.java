package mainPackage;

public class Reader {
    String[] PIB = new String[3];
    int id;
    String faculty;
    Integer[] DMY = new Integer[3];
    int phoneNumber;
    public void takeBook(int amount){
        System.out.println("-----TAKE BOOK TASK 1-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i]+" ");
        }
        System.out.println("took "+amount+" book(s).");
    }

    public void takeBook(String takenBooks) {
        System.out.println("-----TAKE BOOK TASK 2-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i] + " ");
        }
        System.out.println("took these books: "+takenBooks + ".");
    }

    public void takeBook(String[] takenBooks){
        System.out.println("-----TAKE BOOK TASK 3-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i] + " ");
        }
        System.out.print("took these books: ");
        String ending = ", ";
        for (int j = 0; j<takenBooks.length; j++ ){
            if(j==takenBooks.length-1){
                ending=".";
            }
            System.out.print(takenBooks[j]+ending);

        }
        System.out.println("");
    }

    public void returnBook(int amount){
        System.out.println("-----RETURN BOOK TASK 1-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i]+" ");
        }
        System.out.println("returned "+amount+" book(s).");
    }

    public void returnBook(String takenBooks) {
        System.out.println("-----RETURN BOOK TASK 2-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i] + " ");
        }
        System.out.println("returned these books: "+takenBooks + ".");
    }

    public void returnBook(String[] takenBooks){
        System.out.println("-----RETURN BOOK TASK 3-----");
        for (int i = 0; i < PIB.length; i++) {
            System.out.print(PIB[i] + " ");
        }
        System.out.print("returned these books: ");
        String ending = ", ";
        for (int j = 0; j<takenBooks.length; j++ ){
            if(j==takenBooks.length-1){
                ending=".";
            }
            System.out.print(takenBooks[j]+ending);
        }
    }

}
