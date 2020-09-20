package pl.sda.jawawwa24.usystematyzowanie.computer;

import java.util.Optional;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 20/09/2020
 */
public class ServerComputer {
    private GraphicCard graphicsCard;
    public ServerComputer(GraphicCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
    public Optional<GraphicCard> getGraphicsCard() {
        return Optional.ofNullable(graphicsCard);
    }
}