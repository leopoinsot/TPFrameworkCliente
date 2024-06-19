package poinsot.main;

import poinsot.framework.Start;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainPrueba {
    public static void main(String[] args) {
		try {
			var fileReader = new FileReader("C:\\Users\\leonr\\IdeaProjects\\TPFrameworkCliente\\src\\main\\resources\\configuracion.json");
            var start = new Start(fileReader);
            start.init();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

    }
}