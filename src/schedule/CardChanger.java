/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class CardChanger {

    private String currentCard = "dayPanel";

    public void changeCard(JPanel mainCard, JPanel exCard) {
        CardLayout card = (CardLayout) mainCard.getLayout();
        card.addLayoutComponent(exCard, exCard.getName());
        card.show(mainCard, exCard.getName());
        currentCard = exCard.getName();
    }

    //retorna string contendo o nome do card atual
    public String getCurrentCard() {

        return currentCard;
    }
}
