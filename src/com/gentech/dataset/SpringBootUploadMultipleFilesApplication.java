//Am încercat să combin mai multe tutoriale, adaugand si cateva elemente personale
package com.gentech.dataset; //Numele package
import javax.annotation.Resource; //Pentru annotation definite de noi
import org.springframework.boot.CommandLineRunner; // Ceea ce nu am inteles..la versiuni mai noi
import org.springframework.boot.SpringApplication; // au dispărut aceste funcțiuni
import org.springframework.boot.autoconfigure.SpringBootApplication; // sau au fost redenumite?
import main.java.com.gentech.dataset.service.FilesStorageService; // cum pot afla denumirea actuala?

@SpringBootApplication
public class SpringBootUploadMultipleFilesApplication implements CommandLineRunner {
  @Resource //annotation personal
  FilesStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootUploadMultipleFilesApplication.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
    storageService.deleteAll();
    storageService.init();
  }
}