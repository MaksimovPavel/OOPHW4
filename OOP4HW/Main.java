import controller.NotebookController;
import controller.PCController;
import data.Memory;
import data.NoteBook;
import data.PC;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook("14", "Air", Memory.ONE, "256", 1000);
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512", 1200);
        NoteBook n3 = new NoteBook("3", "Asus", Memory.TWO, "512", 1100);

        ArrayList<NoteBook> al = new ArrayList<>();
        al.add(n1);
        al.add(n2);
        al.add(n3);

        PC pc1 = new PC("12", "Asus", Memory.FOUR, "2048", 700);
        PC pc2 = new PC("1", "HP", Memory.SIXTEEN, "512", 1200);
        PC pc3 = new PC("24", "Macbook", Memory.TWO, "4096", 1450);

        ArrayList<PC> pc = new ArrayList<>();
        pc.add(pc1);
        pc.add(pc2);
        pc.add(pc3);

        NotebookController controller = new NotebookController();
        PCController pcController = new PCController();

        controller.printInLogNotebooks(controller.getFilteredNotebookList(al, "id", "2"));
        pcController.printInLogPCs(pcController.getFilteredPCList(pc, "powerSupply", "450"));

    }
}