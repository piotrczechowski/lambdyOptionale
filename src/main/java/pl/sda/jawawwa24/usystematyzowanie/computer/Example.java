package pl.sda.jawawwa24.usystematyzowanie.computer;



import java.util.Optional;


/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */
public class Example {
    public static void main(String[] args) {
        Computer fullComputer = new Computer(new GraphicCard(new Chip("nvidia")));
        Computer withoutGC = new Computer(null);
        Computer fake = null;

        printChipGraphicVendor(fullComputer);
        printChipGraphicVendor(withoutGC);
        printChipGraphicVendor(fake);
    }

    static void printChipGraphicVendor(Computer computer) {
        System.out.println("Vendor: "+ computer.getGraphicCard().getChip().getVendor());
    }

    static void printChipVendorSafeWay(Computer computer) {
        if (computer != null) {
        GraphicCard graphicsCard = computer.getGraphicCard();
            if (graphicsCard != null) {
                Chip chip = graphicsCard.getChip();
                if (chip != null) {
                    System.out.println("Graphics card vendor (safe way): " + chip.getVendor());
                }
            }
        }
    }

//    static void printChipVendorOptionalWay (Computer computer) {
//        Optional.ofNullable(computer)
//                .map(computer1 -> computer1.getGraphicCard())
//                .map(graphicCard -> graphicCard.getChip())
//                .map(chip -> chip.getVendor())
//                .ifPresent(s -> System.out.println("Vendor (Optional): " + s));
//    }

    static void printChipVendorOptionalWay (Computer computer) {
        Optional.ofNullable(computer)
                .map(Computer::getGraphicCard)
                .map(GraphicCard::getChip)
                .map(Chip::getVendor)
                .ifPresent(s -> System.out.println("Vendor (Optional): " + s));
    }

    static void printChipVendorOptionalWayWithException(Computer computer) {
        Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicCard())
                .map(graphicsCard -> graphicsCard.getChip())
                .map(chip -> chip.getVendor())
                .orElseThrow(() -> new IllegalArgumentException("Bląd serwera"));

    }
    static void printChipvendorOptionaServerComputer (ServerComputer serverComputer) {
        Optional.ofNullable(serverComputer)
               .flatMap(serverComputer1 -> serverComputer1.getGraphicsCard())
                .map(graphicCard -> graphicCard.getChip())
                .map(chip -> chip.getVendor())
                .ifPresent(o -> System.out.println("Vendor" + o));


    }
}
