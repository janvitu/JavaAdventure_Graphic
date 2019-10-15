package cz.vse.vitj07.adventura.logika;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    private IHra hra;

    public ImageView obrazekLokace;
    public Label popisLokace;
    public Label jmenoLokace;

    public void setHra(IHra hra) {
        this.hra = hra;
        HerniPlan herniPlan = hra.getHerniPlan();
        Prostor aktualniProstor = herniPlan.getAktualniProstor();

        jmenoLokace.setText(aktualniProstor.getNazev());
        popisLokace.setText(aktualniProstor.getPopis());

        String nazevObrazku = "/" + aktualniProstor.getNazev() + ".jpg";
        Image image = new Image(getClass().getResourceAsStream(nazevObrazku));
        obrazekLokace.setImage(image);
    }
}
